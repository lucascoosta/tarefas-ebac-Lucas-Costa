import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        System.out.print("Digite a 1ª nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Digite a 2ª nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Digite a 3ª nota: ");
        double nota3 = sc.nextDouble();

        System.out.print("Digite a 4ª nota: ");
        double nota4 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 7) {
            System.out.printf("Aprovado! com média %.2f", media);
        } else if (media >= 5) {
            System.out.printf("Recuperação! com média %.2f", media);
        } else {
            System.out.printf("Reprovado! com média %.2f", media);
        }
        
        sc.close();
    }

}
