package Excecoes.Excecoes_Personalizadas.ValidacaoSenhas;

public class SenhaInvalidaException extends Exception {
    

    public SenhaInvalidaException(){
        super("senha inválida!");
    }

    public SenhaInvalidaException(String mensagem){
        super(mensagem);
    }

    public SenhaInvalidaException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }


}

