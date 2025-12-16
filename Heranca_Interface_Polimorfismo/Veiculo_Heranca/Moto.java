package Heranca_Interface_Polimorfismo.Veiculo_Heranca;

public class Moto extends Veiculo {
    
    private int cilindradas;
    private boolean capacete;

    public Moto(String marca, String modelo, int ano, int cilindradas, boolean capacete){
        super(marca, modelo, ano);
        this.cilindradas=cilindradas;
        this.capacete=capacete;
    }

    public int getCilindradas(){
        return cilindradas;
    }

    public boolean getCapacete(){
        return capacete;
    }

    public void verificaUsoCapacete(){
        if (capacete){
        System.out.println("Capacete colocado.");
        }else{
            System.out.println("Capacete não colocado.");
        }
    }
}
