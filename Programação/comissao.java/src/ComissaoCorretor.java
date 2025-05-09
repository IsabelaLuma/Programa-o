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
