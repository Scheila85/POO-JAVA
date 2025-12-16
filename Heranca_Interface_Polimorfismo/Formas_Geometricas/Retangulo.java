package Heranca_Interface_Polimorfismo.Formas_Geometricas;

public class Retangulo extends FormaGeometrica{
    private double base;
    private double altura;

    public Retangulo(double base, double altura){
        this.base=base;
        this.altura=altura;
    }

    @Override
    public double calculaArea() {
        return base * altura;
    }

    @Override
    public double calculaPerimetro() {
        return 2 * (base + altura);
    }
}   
