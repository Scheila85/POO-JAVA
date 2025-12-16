//Imagine que você está desenvolvendo um aplicativo de finanças pessoais. Crie uma classe ContaBancária com 
//atributos como saldo e número da conta, e métodos para depositar e sacar. Isso ajudará os usuários a 
//gerenciar suas economias!


package Classes_e_métodos;

import java.util.Scanner;

public class ContaBancaria {

    private float saldo;
    private int numeroConta;


    public ContaBancaria(float saldo, int numeroConta){
        this.saldo = saldo;
        this.numeroConta = numeroConta;
    }

    public void exibeSaldo(){
        System.out.println(saldo);
    }

    public void deposita(float valor){
        saldo += valor;
    }

    public void saca(float valor){
        if (valor <= saldo){
            saldo -= valor;
        }
        else{
            System.out.println("Saldo insuficiente.");
        }
    }

    public static void main(String[] args) {
        
        

        Scanner scanner = new Scanner(System.in);
        System.out.print("Número da conta: ");
        int conta = scanner.nextInt();
        scanner.nextLine();

    
        ContaBancaria contaBancaria = new ContaBancaria(0, conta);

        System.out.println("Conta:   " + conta);
        System.out.println("Saldo: R$" + contaBancaria.saldo);


        boolean continuacao = true;
        while (continuacao) {
            
            System.out.println("Digite uma opção abaixo: ");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Sair");
            
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 3){
                continuacao = false;
                System.out.println("Obrigada por usar nossos serviços! Volte sempre...");
                break;
            }

            switch (opcao) {
                
                case 1:
                    System.out.print("Valor: R$");
                    float valor = scanner.nextFloat();
                    contaBancaria.deposita(valor);
                    System.out.println("Depósito no valor de R$" + valor + " realizado com sucesso!");
                    System.out.print("Novo saldo: R$");
                    contaBancaria.exibeSaldo();

                    break;
                
                    case 2:
                    System.out.print("Valor: R$");
                    valor = scanner.nextFloat();
                    contaBancaria.saca(valor);
                    System.out.println("Saque no valor de R$" + valor + " realizado com sucesso!");
                    System.out.println("Novo saldo: R$");
                    contaBancaria.exibeSaldo();

                    break;
                
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
            
        }
        scanner.close();
    }
}
