package Heranca_Interface_Polimorfismo.Veiculo_Heranca;

public class Carro extends Veiculo{
    
    private int nPortas;
    private int qtddCintoSeguranca;


    public Carro(String marca, String modelo, int ano, int nPortas, int qtddCintoSeguranca){
        super(marca, modelo, ano);
        this.nPortas = nPortas;
        this.qtddCintoSeguranca = qtddCintoSeguranca;
    }

    public int getnPortas() {
        return nPortas;
    }

    public int getQtddCintoSeguranca() {
        return qtddCintoSeguranca;
    }

    public void setNPortas(int nPortas){
        this.nPortas = nPortas;
    }

    public void setQtddCintoSeguranca(int qtddCintoSeguranca){
        this.qtddCintoSeguranca = qtddCintoSeguranca;
    }

    public void abrirPortas(){
        System.out.println("Abrindo as portas do carro...");
    }

    public void colocaCintoSeguranca(){
        System.out.println("Colocando cinto de segurança...");
    }
}
