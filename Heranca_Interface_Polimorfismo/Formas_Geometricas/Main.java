package Heranca_Interface_Polimorfismo.Formas_Geometricas;

public class Main {

    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(5);
        Retangulo retangulo = new Retangulo(2, 3);
        Triangulo triangulo = new Triangulo(3, 5, 2);


        System.out.println("Área do circulo: " + circulo.calculaArea());
        System.out.println("Perímetro do circulo: " + circulo.calculaPerimetro());
        System.out.println();
        System.out.println("Área do retangulo: " + retangulo.calculaArea());
        System.out.println("Perímetro do retangulo: " + retangulo.calculaPerimetro());
        System.out.println();
        System.out.println("Área do triangulo: " + triangulo.calculaArea());
        System.out.println("Perímetro do triângulo: " + triangulo.calculaPerimetro());
    }
}
