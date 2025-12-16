package Heranca_Interface_Polimorfismo.Emitir_Som_Animais;

/*No exercício 2, você desenvolveu uma hierarquia de classes para animais. Agora, adicione um método 
emitirSom à classe base Animal, e sobrescreva-o nas subclasses para que cada animal emita um som específico. 
Esse método permitirá identificar os animais apenas pelos sons que produzem, enriquecendo seu sistema de 
classificação. */

public class Animal {

    private String nome;
    private double peso;
    private String tipoReproducao; //ovíparo = ovos; vivíparo = nascem da mãe.
    private String tipoCoberturaCorporal;

    public Animal(String nome, double peso, String tipoReproducao, String tipoCoberturaCorporal){
        this.nome=nome;
        this.peso=peso;
        this.tipoReproducao=tipoReproducao;
        this.tipoCoberturaCorporal=tipoCoberturaCorporal;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public String getReproducao() {
        return tipoReproducao;
    }

    public String getCoberturaPele() {
        return tipoCoberturaCorporal;
    }

    public void emitirSom(){
        System.out.println("Animal emitindo som...");
    }

    public void seMover(){
        System.out.println("Animal se movendo...");
    }

    public void seAlimentar(){
        System.out.println("Animal se alimentando...");
    }
}

