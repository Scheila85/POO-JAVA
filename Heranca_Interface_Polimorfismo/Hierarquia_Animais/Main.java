package Heranca_Interface_Polimorfismo.Hierarquia_Animais;

public class Main {
    public static void main(String[] args) {
        
        Mamifero mamifero = new Mamifero("Leão", 100.0, "vivíparo", "pelos", true, true);
        Ave ave = new Ave("Pinguim", 23.0, "ovíparo", "penas", true, "densas");
        Peixe peixe = new Peixe("Tubarão", 200.0, "ovíparo", "escamas", "água salgada");

        System.out.println("  ANIMAIS E SUAS CARACTERÍSTICAS  ");
        System.out.println("  -- Mamífero --  ");
        System.out.println("Nome: " + mamifero.getNome());
        System.out.println("Peso: " + mamifero.getPeso() + "Kg");
        System.out.println("Reprodução: " + mamifero.getReproducao());
        System.out.println("Cobertura corporal: " + mamifero.getCoberturaPele());
        System.out.println("Possui glandulas mamárias: " + mamifero.getPossuiGlandulasMamarias());
        System.out.println("Tipo sangue: " + mamifero.getPossuiSangueQuente());
        System.out.println("---------------------------------------------");

        System.out.println("  -- Ave --  ");
        System.out.println("Nome: " + ave.getNome());
        System.out.println("Peso: " + ave.getPeso() + "kg");
        System.out.println("Reprodução: " + ave.getReproducao());
        System.out.println("Cobertura corporal: " + ave.getCoberturaPele());
        System.out.println("Possui asas: " + ave.getPossuiAsas());
        System.out.println("Tipo asas: " + ave.getTipoPenas());
        System.out.println("---------------------------------------------");

        System.out.println("  -- Peixe --  ");
        System.out.println("Nome: " + peixe.getNome());
        System.out.println("Peso: " + peixe.getPeso() + "Kg");
        System.out.println("Reprodução: " + peixe.getReproducao());
        System.out.println("Cobertura corporal: " + peixe.getCoberturaPele());
        System.out.println("Tipo de habitat aquático: " + peixe.getTipoHabitatAquatico());
        System.out.println("---------------------------------------------");

        System.out.println("   -- AÇÕES --     ");

        mamifero.Amamentar();
        ave.voar(true);
        peixe.nadar();
    }
}
