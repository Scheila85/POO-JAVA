//Agora, considere a criação de um simulador de carros. Crie uma classe Carro com atributos como marca, 
//modelo e ano, e métodos para ligar, desligar e acelerar. Isso tornará a simulação mais realista!

package Unidade01;

public class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar() {
        System.out.println("O carro está ligado.");
    }

    public void desligar() {
        System.out.println("O carro está desligado.");
    }

    public void acelerar() {
        System.out.println("O carro está acelerando.");
    }

    public static void main(String[] args) {
        Carro carro = new Carro("Wolkswagen", "Fox", 2020);
        carro.ligar();
        carro.acelerar();
        carro.desligar();
    }
}

