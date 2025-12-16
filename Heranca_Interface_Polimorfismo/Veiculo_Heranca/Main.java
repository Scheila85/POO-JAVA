package Heranca_Interface_Polimorfismo.Veiculo_Heranca;


public class Main {
    public static void main(String[] args) {
        
        Carro carro = new Carro("Wolkswagen", "Fox", 2010, 4, 5);
        Moto moto = new Moto("Honda", "CG 160 Start", 2025, 160, true);
    
        
        System.out.println("-- MOTO --");
        System.out.println("Marca:  " + moto.getMarca());
        System.out.println("Modelo: " + moto.getModelo());
        System.out.println("Ano:    " + moto.getAno());
        System.out.println("Cilindradadas: " + moto.getCilindradas());
        System.out.println("Capacete: " + moto.getCapacete());
        System.out.println();

        System.err.println("Testando Moto...");
        moto.ligar();
        moto.verificaUsoCapacete();
        moto.acelerar();

        System.out.println();
        System.out.println("-- CARRO --");
        System.out.println("Marca:  " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano:    " + carro.getAno());
        System.out.println("Número de portas: " + carro.getnPortas());
        System.out.println("Quantidade de cinto de segurança: " + carro.getQtddCintoSeguranca());
        System.out.println();

        System.err.println("Testando Carro...");
        carro.abrirPortas();
        carro.colocaCintoSeguranca();
        carro.ligar();
        carro.acelerar();
    }
}
