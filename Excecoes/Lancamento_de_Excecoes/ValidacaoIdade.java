/*Desenvolva uma classe Idade com um método verificarIdade(int idade) que lança uma 
exceção caso a idade fornecida seja menor que 0 ou maior que 150. Este exercício 
ajudará a controlar a entrada de dados inválidos no sistema. */

package Excecoes.Lancamento_de_Excecoes;

public class ValidacaoIdade {
    public static void main(String[] args) {
        try {

            String nome = "Maria";
            int idade = 160;
            
            verificarIdade(idade);
            System.out.println("Nome " + nome + ", Idade " + idade);
        
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
        }
    }

    public static void verificarIdade(int idade){
        if (idade < 0 || idade > 150 ){
            throw new IllegalArgumentException("Idade inválida. A idade deve estar entre 0 e 150.");
        }
        System.out.print("Usuário cadastrado com sucesso! ");
    }
}
