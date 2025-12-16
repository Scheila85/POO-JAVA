package Heranca_Interface_Polimorfismo.Emitir_Som_Animais;

public class Main {
    public static void main(String[] args) {
        
        Mamifero mamifero = new Mamifero(null, 0, null, null, false, false);
        Peixe peixe = new Peixe(null, 0, null, null, null);
        Ave ave = new Ave(null, 0, null, null, false, null);

        mamifero.emitirSom();
        peixe.emitirSom();
        ave.emitirSom();

    }
}
