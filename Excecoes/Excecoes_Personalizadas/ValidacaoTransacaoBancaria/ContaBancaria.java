package Excecoes.Excecoes_Personalizadas.ValidacaoTransacaoBancaria;

public class ContaBancaria {
    
    public static void transferir(double valor) throws TransferenciaInvalidaException{
        if (valor < 0 | valor == 0){

            throw new TransferenciaInvalidaException();
        }

        System.out.println("Transferência concluída com sucesso.");
        System.out.println("Valor R$"+valor);
    }

    public static void main(String[] args) {

        try {
            double valor = 0;
            transferir(valor);
        } catch (TransferenciaInvalidaException e) {
            System.out.println("Erro ao realizar transferência: "+ e.getMessage());
        }
    }

}
