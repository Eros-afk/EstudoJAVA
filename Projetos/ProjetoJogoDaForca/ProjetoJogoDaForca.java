
import java.lang.reflect.Array;
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class PojetoJogoDaForca{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> palavrasSecretas = new ArrayList<>(); // Array list que irá oncter 3 palavras secretas;
        palavrasSecretas.add("cobra");
        palavrasSecretas.add("elefante");
        palavrasSecretas.add("girafa");
        
        Random palavra = new Random();
        int tamanhoDoArrayList = palavrasSecretas.size();
        int indiceDaPalavraAleatoriaGerada = random.nextInt(tamanhoDoArrayList);
    }
}