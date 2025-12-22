
/*Em um sistema meteorológico, crie uma classe ConversorTemperatura com um método 
converterCelsiusParaFahrenheit(double temperaturaCelsius). Esse método deve lançar 
uma IllegalArgumentException caso a temperatura informada seja menor que -273.15 
(o zero absoluto). Depois, implemente um programa que utilize essa classe e capture 
a exceção, informando uma mensagem de erro apropriada ao usuário. */

package Excecoes.Lancamento_de_Excecoes;

public class ConversaoTemperatura {
    public static void main(String[] args) {

        try {
            
            double temperaturaCelsius = -271;

            System.out.println(temperaturaCelsius+"°C corresponde a "+ converteCelsiusParaFahrenheit(temperaturaCelsius)+"°F.");

        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao realizar conversão: "+ e.getMessage());
        }
    }

    //Usar IllegalArguemntException quando o método recebe um argumento inválido:
    //O valor passado por quem chamou o método é não faz sentido;
    //Viola uma regra do método;
    public static double converteCelsiusParaFahrenheit(double temperaturaCelsius){
        if (temperaturaCelsius < -273.15){
            throw new IllegalArgumentException("Temparatura em graus Celsius inválida.");
        }
        double f = (temperaturaCelsius * 1.8)+32;
        return f;
    }

}
