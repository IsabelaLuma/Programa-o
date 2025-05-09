/*
Um posto está vendendo combustíveis com a seguinte tabela de descontos. 
Escreva um programa que leia o número de litros vendidos e o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), 
calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.
*/
import java.util.Scanner;
public class PostoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double PRECO_ALCOOL = 2.90;
        final double PRECO_GASOLINA = 3.30;

        System.out.print("Digite o tipo de combustível (A para Álcool, G para Gasolina): ");
        char tipo = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite a quantidade de litros vendidos: ");
        double litros = scanner.nextDouble();

        double precoLitro;
        double desconto;

        if (tipo == 'A') {
            precoLitro = PRECO_ALCOOL;
            if (litros <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else if (tipo == 'G') {
            precoLitro = PRECO_GASOLINA;
            if (litros <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            scanner.close();
            return;
        }

        double precoTotal = litros * precoLitro;
        double valorDesconto = precoTotal * desconto;
        double valorFinal = precoTotal - valorDesconto;

        System.out.printf("Valor a ser pago: R$ %.2f\n", valorFinal);

        scanner.close();
    }
}
