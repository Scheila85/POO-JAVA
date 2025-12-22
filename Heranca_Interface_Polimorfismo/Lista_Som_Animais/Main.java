package Heranca_Interface_Polimorfismo.Lista_Som_Animais;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        //Coloco tipo Animal para que eu consiga adicionar todos os objetos do tipo animais ao array, já que todos são uma extensão
        //de Animal e assim chamar o método emitirSom() correspondente a cada animal. Se eu colocasse o tipo do meu array
        //de Mamifero, eu não conseguiria add os outros tipos de animais a lista.

        //Animal corresponde ao tipo de objeto que poderei adicionar a lista, neste caso, todo objeto que herda
        //a classe animal

        //Tipo List, deixa o instanciamento mais flexivel, porque posso criar outros objetos do tipo list
        //como um new LinkedList(). Em contrapartida a quantidade de métodos que posso acessar diminui, porque
        //Vou conseguir apenas acessar métodos que estão em List e foram implementados em ArrayList(), mas se
        //for algum método especifico de ArrayList(), eu precico declarar o tipo do array como:
        //ArrayList<Animal> animais = new ArrayList<>();
        List<Animal> animais = new ArrayList<>();

        Animal mamifero = new Mamifero("Leão", 100.0, "vivíparo", "pelos", true, true);
        Ave ave = new Ave("Pinguim", 23.0, "ovíparo", "penas", true, "densas");
        Peixe peixe = new Peixe("Tubarão", 200.0, "ovíparo", "escamas", "água salgada");

        animais.add(mamifero);
        animais.add(ave);
        animais.add(peixe);
        
        //Indefinido em animal, porque não tenho esse método na classe Animal, é especifico da classe Mamifero
        //mamifero.amamentar();

        for (Animal animal: animais){
            animal.emitirSom();
        }
    }
}

