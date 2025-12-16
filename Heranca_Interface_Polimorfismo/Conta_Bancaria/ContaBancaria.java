package Heranca_Interface_Polimorfismo.Conta_Bancaria;

/*Um banco deseja modernizar seu sistema de contas bancárias, e para isso, você deve implementar uma classe 
ContaBancaria com atributos como saldo e número da conta. Crie duas subclasses, ContaCorrente e ContaPoupanca, 
cada uma herdando de ContaBancaria. Diferencie as classes com características e métodos específicos para cada 
tipo de conta. */
public class ContaBancaria {
    
    private String agencia;
    private String nConta;
    private double saldo = 0;

    public ContaBancaria(String agencia, String nConta){
        this.agencia=agencia;
        this.nConta=nConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNConta() {
        return nConta;
    }

    public double getSaldo() {
        return saldo;
    }


    protected void movimentaSaldo(double valor){
        saldo += valor;
    }

    public void depositar(double valor){
        if (valor > 0){
        movimentaSaldo(valor);
        System.out.println("Valor depositado: R$" + valor);
        }else{
            System.out.println("Erro! Operação depósito permite apenas valores acima de 0.");
        }
    }

    public void sacar(double valor){
        if (valor >= saldo || valor < 0){
            System.out.println("Operação inválida!");
        }else{
            movimentaSaldo(-valor);
        System.out.println("Ação de saque");
        System.out.println("Valor do saque: R$"+valor);
        }
    }

    //Método para aplicar juros
    public void aplicarJuros(){
        System.out.println("Nenhuma taxa de juros aplicada.");
    }
}
