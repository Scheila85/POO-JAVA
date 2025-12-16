package Heranca_Interface_Polimorfismo.Polimorfismo_Calculadora;

public class OperacoesMatematicas {

    //Soma int
    public int somar(int a, int b){
        return a + b;
    }

    //Soma double
    public double somar(double a, double b){
        return a + b;
    }

    //Subtração int
    public int subtrair(int a, int b){
        return a - b;
    }

    //Subtração double
    public double subtrair(double a, double b){
        return a - b;
    }

    //Multiplicação int
    public int multiplicar(int a, int b){
        return a * b;
    }

    //Multiplicação double
    public double multiplicar(double a, double b){
        if (b != 0) {
        return a * b;
        } else {
            throw new IllegalArgumentException("Não é possível dividir por 0.");
        }
    }

    //Divisão double
    public double dividir(double a, double b){
        if (b != 0){
            return a / b;
        }else{
            throw new IllegalArgumentException("Não é possível dividir por 0.");
        }
    }

    public static void main(String[] args) {
        OperacoesMatematicas operacoesMatematicas = new OperacoesMatematicas();

        System.out.println("Resultado soma");
        System.out.println(operacoesMatematicas.somar(5, 6));
        System.out.println(operacoesMatematicas.somar(5.0, 8.8));
        System.out.println("--------------");
        System.out.println("Resultado subtração");
        System.out.println(operacoesMatematicas.subtrair(7, 55));
        System.out.println(operacoesMatematicas.subtrair(3.3, 2));
        System.out.println("--------------");
        System.out.println("Resultado multiplicação");
        System.out.println(operacoesMatematicas.multiplicar(100, 5));
        System.out.println(operacoesMatematicas.multiplicar(2.2, 5.9));
        System.out.println("--------------");
        System.out.println("Resultado divisão");
        System.out.println(operacoesMatematicas.dividir(6.6, 7.2));
        System.out.println("--------------");
    }
}
