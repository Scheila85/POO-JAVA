package Classes_e_métodos;

public class Pessoa {
    
    private String nome;
    private int idade;

    public Pessoa(String nome){
        this.nome = nome;
    }

    public void ComprimentarConvidados(){
        System.out.println("Olá " + nome + " seja bem-vindo(a)!");
    }


    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Scheila");

        //Chamei apenas o método porque o mesmo já imprime uma frase, então o println não aceita
        //algo que não tenha retorno
        System.out.println("Mensagem de boas vindas: ");
        pessoa.ComprimentarConvidados();
    }
}
