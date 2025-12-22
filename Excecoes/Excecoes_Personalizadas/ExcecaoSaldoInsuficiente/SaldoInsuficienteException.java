package Excecoes.Excecoes_Personalizadas.ExcecaoSaldoInsuficiente;

/*Desenvolva uma exceção personalizada chamada SaldoInsuficienteException que seja lançada quando uma 
tentativa de sacar uma quantia superior ao saldo disponível for feita em uma conta bancária. */

public class SaldoInsuficienteException extends Exception{
    
    public SaldoInsuficienteException(){
        super("Saldo insuficiente.");
    }

    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }

    public SaldoInsuficienteException (String mensagem, Throwable causa){
        super (mensagem, causa);
    }
}
