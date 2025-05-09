//Faça um programa que peça as 4 notas bimestrais e mostre a média.
import java.util.Scanner;
public class sequenciais4 {
    public static void main(String[] args) {
        int n1, n2, n3, n4;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite 4 notas: ");
        n1 = s.nextInt();
        n2 = s.nextInt();
        n3 = s.nextInt();
        n4 = s.nextInt();
        float media = (n1 + n2 + n3 + n4) / 4.0F;
        System.out.println("A media eh: " + media);
        if (media >= 20) {
            System.out.println("parabens você passou,curta as ferias");
        } else {
            System.out.println("infelizmente você foi reprovado!");

        }
    }
}