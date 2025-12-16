package Heranca_Interface_Polimorfismo.Lista_Som_Animais;

public class Peixe extends Animal {
    
    private String tipoHabitatAquatico;

    public Peixe(String nome, double peso, String tipoReproducao, String tipoCoberturaCorporal, String tipoHabitatAquatico){

        super(nome, peso, tipoReproducao, tipoCoberturaCorporal);
        this.tipoHabitatAquatico=tipoHabitatAquatico;
    }

    public String getTipoHabitatAquatico() {
        return tipoHabitatAquatico;
    }

    @Override
    public void emitirSom(){
        System.out.println("Peixe emitindo som...");
    }
    
    public void nadar(){
        System.out.println("Peixe nadando...");
    }
    
}