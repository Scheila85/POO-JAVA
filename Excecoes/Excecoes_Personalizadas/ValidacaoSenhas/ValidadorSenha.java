package Excecoes.Excecoes_Personalizadas.ValidacaoSenhas;

public class ValidadorSenha {
    
    private String senha;


    public ValidadorSenha(){
    }


    public void validarSenha(String senha) throws SenhaInvalidaException {

        if (senha.length() > 15 && senha.length() < 8) {

            throw new SenhaInvalidaException("A senha deve ter entre 8 e 15 caracteres.");
            }

        if (!senha.matches(".*[A-Z].*")) {
            throw new SenhaInvalidaException("A senha deve conter letra maiúscula..");
        }

        if (!senha.matches(".*[0-9].*")) {
            throw new SenhaInvalidaException("A senha deve conter número.");
        }

        if (!senha.matches(".*[^a-zA-Z0-9].*")) {
            throw new SenhaInvalidaException("A senha deve conter caractere especial.");
        }
    }
}

