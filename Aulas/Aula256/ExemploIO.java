
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class ExemploIO{
    public static void main(String[] args) {
        try {
            // Escrevendo um arquivo
            FileWriter writer = new FileWriter("meuArquivo.txt");

            writer.write("Olá, mundo!"); // Grava os Dados

            writer.close();

            //Lendo de um arquivo
            FileReader reader = new FileReader("meuArquivo.txt");

            int data = reader.read();

            while(data != -1){
                System.out.print((char)data);
                data = reader.read();
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Problema de IO: " + e.getMessage());
        }
    }
}