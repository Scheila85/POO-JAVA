package Excecoes.Excecoes_Personalizadas.ValidacaoSenhas;

public class Main {
    
    public static void main(String[] args) {
        
        ValidadorSenha validadorSenha = new ValidadorSenha();

        try {

            validadorSenha.validarSenha("Abc1635@");
            
            System.out.println("Senha válida!");

        } catch (SenhaInvalidaException e) {
            System.out.println("Erro ao gerar senha: "+ e.getMessage());
        }
    }
}
