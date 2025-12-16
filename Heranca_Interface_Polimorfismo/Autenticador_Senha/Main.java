package Heranca_Interface_Polimorfismo.Autenticador_Senha;

public class Main {
    public static void main(String[] args) {
        
        Usuario usuario = new Usuario("Joao@123", "Usuario8899");
        Administrador administrador = new Administrador("Maria@124", "Adm29778");

        System.out.println(" --Acesso usuário-- ");
        System.out.println(usuario.autenticarLogin("Joao@123", "Usuario8899"));
        
        System.out.println();

        System.out.println("Acesso administrador");
        System.out.println(administrador.autenticarLogin("Maria@124", "Adm3333"));

    }
}
