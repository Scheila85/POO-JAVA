package Heranca_Interface_Polimorfismo.Hierarquia_Animais;

public class Mamifero extends Animal {
    //Nas classes filhos, devo pensar se o atirbuto é uma característica mais que só essa classe tem]
    //então coloco como atributo.
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

    public void Amamentar(){
        System.out.println("Mamífero amamentando...");
    }


    
    









}
