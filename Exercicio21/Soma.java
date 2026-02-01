public class Soma{
    public static void main(String[] args) {
        int soma = 0;
        for(int i = 1; i <= 1000; i++){
            soma += i;
        }
        System.out.println("A soma é: " + soma);
     }


    /*
    public class SomaNumeros {
        public static void main(String[] args) {
            int[] numeros = new int[1000];
            int soma = 0;
            for (int i = 1; i <= 1000; i++) {
                numeros[i - 1] = i;
                soma += i;
            }
            System.out.println("Soma dos números de 1 até 1000: " + soma);
        }
    }
    */
}