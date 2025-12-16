package Heranca_Interface_Polimorfismo.Hierarquia_Animais;

public class Ave extends Animal{
    
    private boolean possuiAsas;
    private String tipoPenas;

    public Ave(String nome, double peso, String tipoReproducao, String tipoCoberturaCorporal, boolean possuiAsas, String tipoPenas){
        super(nome, peso, tipoReproducao, tipoCoberturaCorporal);
        this.possuiAsas=possuiAsas;
        this.tipoPenas=tipoPenas;
    }

    public boolean getPossuiAsas(){
        return possuiAsas;
    }

    public String getTipoPenas(){
        return tipoPenas;
    }

    public void voar(boolean voar){
        if(voar){
            System.out.println("Ave voando...");
        } else{System.out.println("Essa ave não pode voar.");}
    }
}
