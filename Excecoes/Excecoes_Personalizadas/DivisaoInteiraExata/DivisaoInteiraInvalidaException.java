package Excecoes.Excecoes_Personalizadas.DivisaoInteiraExata;

public class DivisaoInteiraInvalidaException extends Exception {
    
    public DivisaoInteiraInvalidaException(){
        super("divisão deve ser exata.");
    }
    public DivisaoInteiraInvalidaException(String mensagem){
        super(mensagem);
    }
    public DivisaoInteiraInvalidaException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }

}
