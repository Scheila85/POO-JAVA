//Você está criando um sistema de e-commerce. Crie uma classe Produto com atributos como nome e preço, 
//e um método para calcular o preço com desconto. Isso ajudará os clientes a economizar em suas compras!

package Classes_e_métodos;

import java.util.Scanner;

public class Produto {
    private String nome;
    private float preco;

    public Produto(String nome, float preco){
        this.nome = nome;
        this.preco = preco;

    }

    public double calculaDesconto(double percentualDesconto){
        return preco - (preco * percentualDesconto/100);
    }

    public static void main(String[] args) {
        
        Produto produto = new Produto("Sofá", 500);
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Valor do produto: R$");
        float preco = scanner.nextFloat();

        System.out.print("Qual o percentual de desconto? ");
        double desconto = scanner.nextDouble();
        

        scanner.close();

        Produto produto2 = new Produto(nome, preco);

        //Com a entrada do usuário
        System.out.println("Nome: " + produto2.nome);
        System.out.println("Idade: " + produto2.preco);
        System.out.println("Valor com " + desconto + "% de desconto: R$" + produto2.calculaDesconto(desconto));

        //Sem a entrada do usuário
        System.out.println("O valor do " + produto.nome + " com 15% de desconto é R$: " + produto.calculaDesconto(15));
    }

}
