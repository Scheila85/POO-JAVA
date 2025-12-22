
/*Em um sistema bancário, desenvolva uma classe ContaBancaria com um método transferir. Esse método deve 
lançar uma exceção personalizada TransferenciaInvalidaException se a quantia transferida for menor ou 
igual a zero, garantindo a validade das transações. */

package Excecoes.Excecoes_Personalizadas.ValidacaoTransacaoBancaria;

public class TransferenciaInvalidaException extends Exception{

    public TransferenciaInvalidaException(){
        super("o valor deve ser maior que zero.");
    }
    public TransferenciaInvalidaException(String mensagem){
        super(mensagem);
    }

    public TransferenciaInvalidaException(String mensagem, Throwable causa){
        super(mensagem, causa);
    }
}