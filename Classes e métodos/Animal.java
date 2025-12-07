//Imagine que você está criando um aplicativo para um zoológico. Desenvolva uma classe Animal com 
//características como nome e tipo de alimentação, além de um método que permita ao animal emitir 
//um som característico. Isso tornará o app mais interativo!


package Unidade01;

public class Animal {
    private String nome;
    private String alimento;
    private String porte;

    public Animal(String nome, String alimento, String porte){
        this.nome = nome;
        this.alimento = alimento;
        this.porte = porte;
    }

    public void descreveAnimal(){
        System.out.println("Nome: " + nome);
        System.out.println("Alimento: " + alimento);
        System.out.println("Porte: " + porte);
    }

    public void emiteSom(){
        System.out.println("Som de " + nome);
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Cachorro", "ração", "pequeno");

        animal.descreveAnimal();
        animal.emiteSom();

    }
}
