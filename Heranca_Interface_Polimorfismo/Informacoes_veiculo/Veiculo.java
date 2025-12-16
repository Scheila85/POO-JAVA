package Heranca_Interface_Polimorfismo.Informacoes_veiculo;

/*Utilize as classes Carro e Moto que você criou no exercício 1 e, agora, implemente um método na classe 
base Veículo chamado imprimirInformacoes. Sobrescreva este método nas subclasses para exibir detalhes 
específicos de cada tipo de veículo. Este recurso ajudará os usuários a verem informações detalhadas de cada 
veículo de maneira prática e organizada. */

public class Veiculo {
    
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void ligar(){
        System.out.println("Ligando veículo...");
    }

    public void imprimirInformacoes(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

    
}

