
import java.io.IOException;
import java.nio.file.*;


public class ExemploNIO{
    public static void main(String[] args) {
        Path path = Paths.get("meuArquivo.txt");

        try {
            //Escrevendo um arquivo
            Files.write(path, "Olá, mundo".getBytes());

            //Lendo de um arquivo
            byte[] bytes = Files.readAllBytes(path);
            
            String content = new String(bytes);

            System.out.print(content);

        } catch (IOException e) {
            System.out.println("Problemas de IO: " + e.getMessage());
        }
    }
}