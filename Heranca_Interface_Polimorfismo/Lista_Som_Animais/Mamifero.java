package Heranca_Interface_Polimorfismo.Lista_Som_Animais;

public class Mamifero extends Animal {
    
    private boolean possuiGlandulasMamarias;
    private boolean possuiSangueQuente;
    
    public Mamifero(String nome, double peso, String tipoReproducao, String tipoCoberturaCorporal, boolean possuiGlandulasMamarias, boolean possuiSangueQuente){
        super(nome, peso, tipoReproducao, tipoCoberturaCorporal);
        this.possuiGlandulasMamarias=possuiGlandulasMamarias;
        this.possuiSangueQuente=possuiSangueQuente;
    }

    public boolean getPossuiGlandulasMamarias(){
        return possuiGlandulasMamarias;
    }

    public boolean getPossuiSangueQuente(){
        return possuiSangueQuente;
    }

    @Override
    public void emitirSom(){
        System.out.println("Mamífero emitindo som...");
    }

    public void Amamentar(){
        System.out.println("Mamífero amamentando...");
    }
}
