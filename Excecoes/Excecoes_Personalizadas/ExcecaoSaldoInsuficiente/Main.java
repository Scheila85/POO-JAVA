package Excecoes.Excecoes_Personalizadas.ExcecaoSaldoInsuficiente;

public class Main {

    private static double saldo = 1000;
    public static void main(String[] args) {
        
        try { 

            double valor = 1500;
            sacar(valor);

            System.out.println("Saque no valor de R$"+valor+" realizado com sucesso!");

        } catch(SaldoInsuficienteException e){
            System.out.println("Erro ao realizar transação: "+ e.getMessage());
        }
    }

    public static void sacar(double valor) throws SaldoInsuficienteException{
        if (valor > saldo) {
            throw new SaldoInsuficienteException();
        }
        saldo-=valor;
    }
}
