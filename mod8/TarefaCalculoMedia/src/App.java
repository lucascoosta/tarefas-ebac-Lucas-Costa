public class App {

    public static void main(String[] args) {
        calcularMedia(5.3, 7.1, 8, 9.4);
    }

    public static void calcularMedia(double nota1, double nota2, double nota3, double nota4) {
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.printf("Média: %.2f", media);
    }

}
