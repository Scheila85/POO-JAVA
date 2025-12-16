package Heranca_Interface_Polimorfismo.Informacoes_veiculo;

public class Main {
    public static void main(String[] args) {
        
        Carro carro = new Carro("Wolkswagen", "fox", 4, 5);
        Moto moto = new Moto("Honda", "CG - 160", 160, true);


        carro.imprimirInformacoes();
        System.out.println();
        moto.imprimirInformacoes();
    }
}
