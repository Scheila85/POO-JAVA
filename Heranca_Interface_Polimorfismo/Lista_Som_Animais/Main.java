package Heranca_Interface_Polimorfismo.Lista_Som_Animais;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        //Coloco tipo Animal para que eu consiga adicionar todos os animais ao array, já que todos são uma extensão
        //de Animal e assim chamar o método emitirSom() correspondente a cada animal. Se eu colocasse o tipo do meu array
        //de Mamifero, eu não conseguiria add os outros tipos de animais a lista.
        List<Animal> animais = new ArrayList<>();
        Animal mamifero = new Mamifero("Leão", 100.0, "vivíparo", "pelos", true, true);
        Ave ave = new Ave("Pinguim", 23.0, "ovíparo", "penas", true, "densas");
        Peixe peixe = new Peixe("Tubarão", 200.0, "ovíparo", "escamas", "água salgada");

        animais.add(mamifero);
        animais.add(ave);
        animais.add(peixe);

        for (Animal animal: animais){
            animal.emitirSom();
        }
    }
}

