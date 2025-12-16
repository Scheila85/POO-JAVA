package Heranca_Interface_Polimorfismo.Formas_Geometricas;

public class Triangulo extends FormaGeometrica{
    private double base;
    private double altura;
    private double lados;


    public Triangulo(double base, double altura, double lados){
        this.base=base;
        this.altura=altura;
        this.lados=lados;
    }

    @Override
    public double calculaArea() {
        return (base * altura)/2;
    }

    @Override
    public double calculaPerimetro() {
        return base + (lados * 2);
    }
}
