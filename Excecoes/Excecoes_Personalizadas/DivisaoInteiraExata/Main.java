package Excecoes.Excecoes_Personalizadas.DivisaoInteiraExata;

public class Main {

    public static void main(String[] args) {
        
        try {
            divisaoInteira(10, 7);
        } catch (DivisaoInteiraInvalidaException e) {
            System.out.println("Erro ao realizar divisão: " + e.getMessage());
        }
        
    }
    
    public static void divisaoInteira(int a, int b) throws DivisaoInteiraInvalidaException{
        if(a % b != 0){
            throw new DivisaoInteiraInvalidaException();
        }
        int divisao =  a / b;
        System.out.println("Resultado da divisão: "+ divisao);
    }
}
