package Heranca_Interface_Polimorfismo.Informacoes_veiculo;

public class Carro extends Veiculo{
    
    private int nPortas;
    private int qtddCintoSeguranca;


    public Carro(String marca, String modelo, int nPortas, int qtddCintoSeguranca){
        super(marca, modelo);
        this.nPortas = nPortas;
        this.qtddCintoSeguranca = qtddCintoSeguranca;
    }

    public int getnPortas() {
        return nPortas;
    }

    public int getQtddCintoSeguranca() {
        return qtddCintoSeguranca;
    }

    @Override
    public void imprimirInformacoes(){
        super.imprimirInformacoes();
        System.out.println("Número de portas: " + nPortas);
        System.out.println("Quantidade de cinto de segurança: " + qtddCintoSeguranca);
    }

    public void abrirPortas(){
        System.out.println("Abrindo as portas do carro...");
    }

    public void colocaCintoSeguranca(){
        System.out.println("Colocando cinto de segurança...");
    }
}