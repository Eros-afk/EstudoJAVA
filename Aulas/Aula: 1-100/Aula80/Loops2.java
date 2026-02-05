
public class Loops2 {

    public static void main(String[] args) {
        System.out.println("Usando break");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }

        System.out.println("\nUsando continue");
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                continue; // Pula a iteração quando j é igual a 5
            }
            System.out.println(j);
        }
    }

}
