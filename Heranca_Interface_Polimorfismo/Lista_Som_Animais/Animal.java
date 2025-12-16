package Heranca_Interface_Polimorfismo.Lista_Som_Animais;

/*Utilize a hierarquia de classes que você criou para animais no exercício 2. Crie uma lista com diferentes 
animais e percorra essa lista chamando o método emitirSom de cada animal. Esse recurso ajudará a criar uma 
“sinfonia” de sons de animais, permitindo que a equipe de biólogos utilize o sistema para reconhecimento 
auditivo das espécies. */
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
}

