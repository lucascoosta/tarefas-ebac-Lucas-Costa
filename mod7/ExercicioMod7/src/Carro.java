/**
 * @author Lucas Costa
 */
public class Carro {

    private int ano;
    private String modelo;
    private String marca;
    private String cor;

    public void ligar() {
        System.out.printf("Ligando o carro %s", modelo);
    }

    public void desligar() {
        System.out.printf("Desligando o carro %s", modelo);
    }

    public void dirigir() {
        System.out.printf("Dirigindo o carro %s da marca %s, de %d", modelo, marca, ano);
    }

}
