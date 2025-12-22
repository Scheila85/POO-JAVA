/*Escreva um programa que converta uma string em um número inteiro. Utilize try-catch
para capturar a exceção NumberFormatException, exibindo uma mensagem para o usuário 
caso o valor inserido não seja um número válido. */

package Excecoes.Captura_de_Excecoes;

public class ConversaoStringParaInt {
    public static void main(String[] args) {
        try {
            String string = "a";

            int numero = Integer.parseInt(string);
            
            System.out.println("Número convertido: "+numero);
            
        } catch (NumberFormatException e) {
            System.out.println("Erro ao transformar String para inteiro, a entrada deve ser um número inteiro.");
        }
    }
}
