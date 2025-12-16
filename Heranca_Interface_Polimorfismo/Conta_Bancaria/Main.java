package Heranca_Interface_Polimorfismo.Conta_Bancaria;

public class Main {
    public static void main(String[] args) {
        
        ContaPoupanca contaPoupanca = new ContaPoupanca("45", "8976-7");
        ContaCorrente contaCorrente = new ContaCorrente("75", "64537-x", true);
        
        //Movimentações contas bancárias
        System.out.println(" --CONTA POUPANÇA--");
        System.out.println("Agencia: " + contaPoupanca.getAgencia());
        System.out.println("Conta:   " + contaPoupanca.getNConta());
        System.out.println("Saldo:  R$" + contaPoupanca.getSaldo());
        contaPoupanca.depositar(2000.0);
        System.out.println("Saldo:  R$" + contaPoupanca.getSaldo());
        contaPoupanca.sacar(500.0);
        System.out.println("Saldo:  R$" + contaPoupanca.getSaldo());
        contaPoupanca.aplicarRendimento();
        System.out.println("Saldo:  R$" + contaPoupanca.getSaldo());
        System.out.println();

        System.out.println(" --CONTA CORRENTE--");
        System.out.println("Agencia: " + contaCorrente.getAgencia());
        System.out.println("Conta:   " + contaCorrente.getNConta());
        System.out.println("Saldo:  R$" + contaCorrente.getSaldo());
        contaCorrente.depositar(1000.0);
        System.out.println("Saldo:  R$" + contaCorrente.getSaldo());
        contaCorrente.sacar(500.0);
        System.out.println("Saldo:  R$" + contaCorrente.getSaldo());
        contaCorrente.usarCartaoCredito("S");

        //Remoção de juros das contas
        System.out.println();
        System.out.println(" --Remoção de juros-- ");
        System.out.print("Conta Corrente: ");
        contaCorrente.aplicarJuros();
        System.out.println(contaCorrente.getSaldo());
        System.out.println();
        System.out.print(" --Conta Poupança--");
        contaPoupanca.aplicarJuros();
        System.out.println(contaPoupanca.getSaldo());
    }
}
