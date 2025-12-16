package Heranca_Interface_Polimorfismo.Hierarquia_Animais;

public class Peixe extends Animal {
    
    private String tipoHabitatAquatico;

    public Peixe(String nome, double peso, String tipoReproducao, String tipoCoberturaCorporal, String tipoHabitatAquatico){

        super(nome, peso, tipoReproducao, tipoCoberturaCorporal);
        this.tipoHabitatAquatico=tipoHabitatAquatico;
    }

    public String getTipoHabitatAquatico() {
        return tipoHabitatAquatico;
    }

    //Métodos são ações que o objeto pode fazer;
    //Ação que o objeto está fazendo no momento = estado atual do objeto.
    public void nadar(){
        System.out.println("Peixe nadando...");
    }
    
}
