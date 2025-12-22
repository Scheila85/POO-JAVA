/*Escreva um programa que solicite ao usuário um número e tente dividi-lo por zero. 
Use um bloco try-catch para capturar a ArithmeticException, exibindo uma mensagem 
amigável para orientar o usuário sobre o erro. */

package Excecoes.Captura_de_Excecoes;

import java.util.Scanner;

public class DivisaoPorZeroFeedback {
    //Objetivo: treinar try catch;
    //Estou usando as exceções build-in's do Java;
    //Lanço minhas exceções quando a regra é do meu sistema;
    //Quando o java não conhece a regra.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Digite um número: ");
            int numero = input.nextInt();

            int divisao = numero/0;

            System.out.println("Resultado divisão: " + divisao);
            
        } catch (ArithmeticException e) {
            //Eu só trato/capturo o erro quando sei qual erro pode acontecer.
            System.out.println("Erro ao realizar divisão: divisão por 0 não é permitido.");
        } catch (Exception e){
            //Exception é um erro mais genérico, eu uso quando quero garantir que 
            //o programa não quebre se acontecer outro erro que eu não tratei.
            System.out.println("Ocorreu um erro inesperado: "+ e.getMessage());
        } finally{
        input.close();
        }
    }
    //nesta situação, se eu não capturar/tratar o erro, e for um erro que o Java reconhece, a JVM só vai lançar o erro, dizendo qual é, mas
    //o programa quebra do mesmo jeito.
}
