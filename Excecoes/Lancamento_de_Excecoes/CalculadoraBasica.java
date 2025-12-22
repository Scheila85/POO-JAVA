/*Imagine que você está desenvolvendo uma calculadora básica e precisa evitar 
operações inválidas. Escreva um método que receba dois números como parâmetros e 
lance uma exceção se o segundo número for zero, impedindo divisões por zero no 
programa. */
package Excecoes.Lancamento_de_Excecoes;

import java.util.Scanner;

public class CalculadoraBasica {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Captura de exceção:
        try {
            
            System.out.println("Digite o numerador: ");
            double numerador = input.nextDouble();

            System.out.println("Digite o denominador: ");
            double denominador = input.nextDouble();

            double resultadoDivisao = operacaoDivisao(numerador, denominador);
            System.out.println("O resultado da divisão é: "+ resultadoDivisao);

        } catch (ArithmeticException e) {
            System.out.println("Erro ao realizar divisão: "+ e.getMessage());
        } finally {
            input.close();
        }
    }
    //Numerador e denominador não vão como atributos, porque mudam a todo momento (são temporários).
    //Só vira atributo se o objeto precisa lembrar aquele valor depois.
    //Atributos representam o estado do objeto e não dependem da operação existir
    //para passarem a existir.
    //Atributos mudam por comportamento (métodos) e não por atribuição direta.

    //Lançamento de exceção:
    public static double operacaoDivisao(double numerador, double denominador){
        //1° verifico se a regra de negócio é atendida e se for, permito que o calculo
       //seja executado. 
        if (denominador==0) {
            //Aqui explico qual foi o erro e em catch eu eu digo qual erro ocorreu e onde ocorreu.
            throw new ArithmeticException("o denominador não pode ser 0.");  
        }
        return numerador/denominador;
    }

}