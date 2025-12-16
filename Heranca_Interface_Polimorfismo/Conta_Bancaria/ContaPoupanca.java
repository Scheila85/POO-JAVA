package Heranca_Interface_Polimorfismo.Conta_Bancaria;

public class ContaPoupanca extends ContaBancaria{
    private double TAXA_RENDIMENTO = 0.06;
    private static double TAXA_JUROS = 0.065;

    public ContaPoupanca(String agencia, String nConta){
        super(agencia, nConta);
    }

    public double getTaxaRendimento() {
        return TAXA_RENDIMENTO;
    }

    public double calcularRendimento(){
        return TAXA_RENDIMENTO * getSaldo();
    }

    public void aplicarRendimento(){
        double rendimento = calcularRendimento();
        movimentaSaldo(rendimento);
        System.out.println("Valor do rendimento da conta: R$" + rendimento);
    }

    //Aplicar juros conta poupança
    @Override
    public void aplicarJuros() {
        double aplicarJuros = getSaldo() * TAXA_JUROS;
        movimentaSaldo(-aplicarJuros);
        System.out.println("Juros conta poupança: R$" + aplicarJuros);
        System.out.println("Valor removido da conta.");
    }
}
