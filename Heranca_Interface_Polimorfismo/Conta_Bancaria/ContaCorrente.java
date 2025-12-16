package Heranca_Interface_Polimorfismo.Conta_Bancaria;

public class ContaCorrente extends ContaBancaria {
    
    private boolean direitoCartaoCredito;
    private static double TAXA_JUROS = 0.15;

    public ContaCorrente(String agencia, String nConta, boolean direitoCartaoCredito){
        super(agencia, nConta);
        this.direitoCartaoCredito=direitoCartaoCredito;
    }

    public boolean getDireitoCartaoCredito(){
        return direitoCartaoCredito;
    }
    
    public double getTAXA_JUROS() {
        return TAXA_JUROS;
    }

    public void usarCartaoCredito(String resposta){
        if (resposta == "S"){
            System.out.println("Cartão de crédito em uso.");
        }else{
            System.out.println("Cartão de crédito nunca usado.");
        }
    }

    //Aplicar juros conta corrente
    @Override
    public void aplicarJuros() {
        double aplicarJuros = getSaldo() * TAXA_JUROS;
        movimentaSaldo(-aplicarJuros);
        System.out.println("Juros conta corrente: R$" + aplicarJuros);
        System.out.println("Valor removido da conta.");
    }

}
