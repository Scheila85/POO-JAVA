//Considere a criação de um programa para calcular áreas de terrenos. Implemente uma classe Retângulo com 
//atributos como comprimento e largura, e métodos para calcular a área e o perímetro. Esse conhecimento 
//será útil para muitos!

package Unidade01;

import java.util.Scanner;

public class Retangulo {
    
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calculaArea(){
        return comprimento * largura;
    }

    public double calculaPerimetro(){
        return 2 * (comprimento + largura);
    }

    public static void main(String[] args) {
        
        Retangulo retangulo = new Retangulo(2, 5);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o comprimento do retangulo? ");
        double comp = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Qual a largura do retangulo? ");
        double larg = scanner.nextDouble();
        scanner.nextLine();
        
        scanner.close();

        Retangulo retangulo2 = new Retangulo(comp, larg);

        //Usando o objeto retangulo sem Scanner
        System.out.println("O perimetro é: " + retangulo.calculaPerimetro() + ".");
        System.out.println("A área é: " + retangulo.calculaArea() + "m².");
    
        //Usando o objeto retangulo2 que recebe entrada do usuário
        System.out.println("O perimetro é: " + retangulo2.calculaPerimetro() + ".");
        System.out.println("A área é: " + retangulo2.calculaArea() + "m².");
        
    }

}
