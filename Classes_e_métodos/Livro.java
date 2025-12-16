
//Você está ajudando a montar uma biblioteca digital. Crie uma classe Livro com atributos como título, 
//autor e número de páginas, além de um método para exibir detalhes do livro. Assim, os usuários poderão 
//explorar suas leituras de forma mais fácil.


package Classes_e_métodos;

public class Livro {
    
    private String titulo;
    private String autor;
    private String categoria;
    private int anoPublicação;
    private int nPaginas;

    public Livro(String titulo, String autor, String categoria, int anoPublicação, int nPaginas){

        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.anoPublicação = anoPublicação;
        this.nPaginas = nPaginas;
    }

    //Não preciso colocar parametro, porque não vou receber nenhum valor de fora, apenas exibir os atributos que já estão
    //dentro da minha classe.
    //Se fosse um setter() por exemplo, aí eu colocaria, porque estou recebendo valor novo de fora, e não tem como
    //adivinhar qual valor será.
    public void exibeInformacoes(){
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Categoria: " + categoria);
        System.out.println("Ano publicação :" + anoPublicação);
        System.out.println("Número de páginas: " + nPaginas); 
    }

    public static void main(String[] args) {
        

        Livro livro = new Livro("One Day", "David Nicholls", "Romance novel", 2011, 448);

        livro.exibeInformacoes();
    }
}
