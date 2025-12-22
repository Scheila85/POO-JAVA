/*Implemente um método que tente ler um arquivo. Use um bloco try-catch para capturar
a exceção FileNotFoundException e exibir uma mensagem informativa caso o arquivo não 
seja encontrado. */

package Excecoes.Captura_de_Excecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeituraArquivo {
    
    public static void main(String[] args) {
        
        leitorArquivo("arquivo.txt");
    }

    public static void leitorArquivo(String nomeArquivo){

        try {
            File arquivoParaLeitura = new File(nomeArquivo);
            Scanner scanner = new Scanner(arquivoParaLeitura);

            //Loop para ler cada linha do arquivo
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: "+ e.getMessage());
        }
    }
}