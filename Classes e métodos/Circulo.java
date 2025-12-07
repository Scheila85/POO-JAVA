//1) Imagine que você está criando um aplicativo para uma loja de materiais de arte. 
// Crie uma classe Círculo que represente um círculo, incluindo atributos como raio e área, 
// e implemente métodos para calcular a área e o perímetro. Isso ajudará os artistas a entender melhor 
// as medidas de seus trabalhos!


package Unidade01;

import java.util.Scanner;

public class Circulo{
    //Devo colocar todos os atributos que descrevem o objeto, mesmo que não seja usado em calculos.
    //Se é resultado de um calculo ou valor temporário, não deve virar atributo.
    //área e perimetro são resultados de calculos, não fazem parte da identidade de um circulo.

    //Vira atributo quando faz parte da identidade do objeto e descreve como ele é.

    //Não deve virar atributo quando:
    //Depende de outros valores; pode ser calculado sempre que precisar e é resultado de um calculo.

    private double raio;

    public Circulo(double raio){
        this.raio = raio;
    }

    //Comportamentos do circulo:
    //Nesses métodos eu retorno a fórmula e não uma variável porque não possuo nenhum valor ainda
    //Aí no main eu posso colocar em variáveis, porque vou receber o valor que irá substituir raio e aí sim
    //terá um valor para retornar.
    public double calculaPerimetro(){
        return 2*raio*Math.PI;
    }

    public double calculaArea(){
        return Math.PI * Math.pow(raio, 2);
    }


public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    boolean continuacao = true;
    while (continuacao) {
    System.out.println("Escolha uma opção de calculo abaixo: ");
    System.out.println("1. Área: ");
    System.out.println("2. Perímetro: ");
    System.out.println("3. Sair: ");

    int tipoCalculo = scanner.nextInt();
    scanner.nextLine();

    //Declara a variável visivel no método todo.
    Circulo circulo = null;

    if (tipoCalculo == 1 || tipoCalculo == 2){
    System.out.println("Digite o raio do círculo: ");
    double raio = scanner.nextDouble();
    scanner.nextLine();
    //Atribui o objeto válido
    circulo = new Circulo(raio);
    }

    switch (tipoCalculo) {
        case 1:
            double a = circulo.calculaArea(); //Não passo raio como argumento, porque eu estou dentro da mesma
            //classe, e em POO os métodos podem acessar diretamente o raio.
            String areaFormatada = String.format("%.2f", a);
            System.out.println("A área do círculo é: " + areaFormatada);
            break;
        case 2:
            double p = circulo.calculaPerimetro();
            areaFormatada = String.format("%.2f", p);
            System.out.println("O perímetro do círculo é: " + areaFormatada);
            break;
        case 3:
            continuacao = false;
            break;

        default:
            System.out.println("Erro! Digite uma opção válida.");
            break;
    }
    }
    scanner.close();
    }
}


//Não separo em classes para o objeto e calculo -> porque estou me referindo a um único circulo, se eu quisesse cadastrar e gerenciar vários
//circulos aí faria sentido eu ter duas classes, uma que representa o objeto e a outra que gerencia vários objetos.

//Separo porque cada classe representa uma responsabilidade única.
//Circulo -> um circulo
//Gerenciador de círculos -> representa um conjunto de circulos.