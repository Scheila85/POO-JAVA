package Heranca_Interface_Polimorfismo.Veiculo_Heranca;

/*Imagine que você foi contratado(a) por uma empresa automobilística para desenvolver um sistema que 
organize informações de veículos. Comece criando uma classe Veículo com atributos básicos, como modelo e ano. 
Em seguida, crie duas subclasses, Carro e Moto, adicionando ao menos dois atributos específicos e 
um método adicional para cada um. Assim, seu sistema representará melhor as diferenças entre cada tipo de 
veículo. */

//Classe pai
class Veiculo {
    
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getAno(){
        return ano;
    }

    public void setMarca(String marca){
        this.marca = marca;
    } 

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void ligar(){
        System.out.println("Ligando veículo...");
    }

    public void acelerar(){
        System.out.println("Acelerando veículo...");
    }


    
}
