/*
A empresa paga ao corretor uma comissão calculada de acordo com o valor de suas vendas.
 Se o valor da venda de um corretor for maior que R$ 50.000,00 a comissão será de 12% do valor vendido.
 Se o valor da venda do corretor estiver entre R$ 30.000,00 e R$ 50.000,00 (incluindo extremos) a comissão será de 9,5%.
 Em qualquer outro caso, a comissão será de 7%. Escreva um programa onde será informado nome do corretor e o valor da venda, após isto o programa irá calcular o valor da comissão.
*/
import java.util.Scanner;
public class ComissaoCorretor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do corretor: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o valor da venda: R$ ");
        double valorVenda = scanner.nextDouble();
        double comissao;
        if (valorVenda > 50000) {
            comissao = valorVenda * 0.12;
        } else if (valorVenda >= 30000) {
            comissao = valorVenda * 0.095;
        } else {
            comissao = valorVenda * 0.07;
        }
        System.out.println("\nCorretor: " + nome);
        System.out.printf("Valor da venda: R$ %.2f\n", valorVenda);
        System.out.printf("Comissão: R$ %.2f\n", comissao);

        scanner.close();
    }
}
