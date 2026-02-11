
import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class ProjetoJogoDaForca{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> palavrasSecretas = new ArrayList<>(); // Array list que irá oncter 3 palavras secretas;
        palavrasSecretas.add("cobra");
        palavrasSecretas.add("elefante");
        palavrasSecretas.add("girafa");
        
        Random random = new Random();
        int tamanhoDoArrayList = palavrasSecretas.size();
        int indiceDaPalavraAleatoriaGerada = random.nextInt(tamanhoDoArrayList);
        String palavraSecreta = palavrasSecretas.get(indiceDaPalavraAleatoriaGerada); //Seleciona uma palavra secreta aleatoriamente

        ArrayList<Character> letrasDescobertas = new ArrayList<>(); //ArrayList para armazenar as letras descobertas

        for (int i = 0; i < palavraSecreta.length(); i++) {
            letrasDescobertas.add('_'); //Inicializa com traços para cada letra    
        }
        int tentativas = 6; //Número máximo de tentativas
        boolean palavraFoiDescoberta = false; //Adciona uma flag para verificar se a palavra foi descoberta

        //Enquanto a palavraFoiDescoberta não for descoberta ou ainda houver tentativas para decobrir o programa continuará
        while (!palavraFoiDescoberta && tentativas > 0){
            System.out.println("Palavra: " + letrasDescobertas);
            System.out.print("Advinhe uma letra: ");
            char chute = scanner.next().charAt(0);

            boolean acertou = false;
            for(int i = 0; i < palavraSecreta.length(); i++){ //Vou passar por cada letra da palavra (5, 8 ou 6)
                if(palavraSecreta.charAt(i) == chute){ //Verifica cada letra da palavra secreta se é igual ao chute
                    letrasDescobertas.set(i, chute); //Se for igual, eu coloco na lista de descobertas, na posição certa
                    acertou = true;
                }
            }
            if (!acertou) {
                tentativas--;
                System.out.println("Você tem mais " + tentativas + " tentativas.");
            }

            //Verifica se a palavra foi complletamente descoberta
            palavraFoiDescoberta = !letrasDescobertas.contains('_');
        }
        if (palavraFoiDescoberta) {
            System.out.println("Parabéns, você acertou! A palavra era: " + palavraSecreta);
        } else {
            System.out.println("Você perdeu! Apalavra era: " + palavraSecreta);
        }
    }
}