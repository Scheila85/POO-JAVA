//Por fim, pense em um sistema de recursos humanos. Implemente uma classe Funcionário com características 
//como nome, cargo e salário, e um método para calcular aumento de salário. Isso ajudará a gerenciar a 
//equipe de forma eficaz!

package Unidade01;

import java.util.Scanner;

public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;


    public Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void exibirSalario(){
        System.out.println(salario);
    }
    public double aumentoSalario(float percentualAumento){
        return salario * percentualAumento/100;
    }

    public double calcularSalarioComAumento(float percentualAumento){
        return salario + salario * percentualAumento/100;
    }

    public void aplicarAumento(float percentualAumento){
        salario += salario * percentualAumento/100;
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print(("Funcionário: "));
        String nome = scanner.nextLine();

        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Salário atual: R$");
        double salario = scanner.nextDouble();

        System.out.print("Percentual de aumento: ");
        float percentualAumento = scanner.nextFloat();

        Funcionario funcionario = new Funcionario(nome, cargo, salario);
        
        System.out.println("Valor do aumento: R$" + funcionario.aumentoSalario(percentualAumento));
        funcionario.aplicarAumento(percentualAumento);
        System.out.printf("Novo salário: R$%.2f" + funcionario.calcularSalarioComAumento(percentualAumento));
        
        scanner.close();
    }

}