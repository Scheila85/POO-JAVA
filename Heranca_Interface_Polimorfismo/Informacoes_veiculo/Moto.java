package Heranca_Interface_Polimorfismo.Informacoes_veiculo;

public class Moto extends Veiculo {
    
    private int cilindradas;
    private boolean capacete;

    public Moto(String marca, String modelo, int cilindradas, boolean capacete){
        super(marca, modelo);
        this.cilindradas=cilindradas;
        this.capacete=capacete;
    }

    public int getCilindradas(){
        return cilindradas;
    }

    public boolean getCapacete(){
        return capacete;
    }

    @Override
    public void imprimirInformacoes() {
        super.imprimirInformacoes();
        System.out.println("Cilindradas: " + cilindradas);
        System.out.println("Capacete: " + capacete);
    }

    public String verificaUsoCapacete(){
        if (capacete){
        return "capacete colocado.";
        }else{
        return "capacete não colocado.";
        }
    }
}

