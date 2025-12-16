package Heranca_Interface_Polimorfismo.Hierarquia_Animais;

/* Você está ajudando uma equipe de biólogos a organizar um catálogo de animais! Comece com uma classe base 
chamada Animal, definindo os atributos básicos para representar qualquer animal. Em seguida, desenvolva 
subclasses específicas como Mamífero, Ave e Peixe, adicionando características que melhor descrevam cada tipo. 
Sua missão é criar uma estrutura hierárquica que facilite a identificação e classificação dos animais. */

public class Animal {
    //Todos os atributos da classe pai, devem fazer sentido para os filhos, sem modificação.
    //Se determinado atributos não fazer sentido para um filho, o atributo não deve estar na classe pai.
    //Sempre devo me perguntar: as características valem para 100% dos filhos sem exceção?
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

    public void seMover(){
        System.out.println("Animal se movendo...");
    }

    public void seAlimentar(){
        System.out.println("Animal se alimentando...");
    }
}
