public class Soma2{
    public static void main(String[] args) {
        int num = 10;
        int soma = 0;
        
        do { 
            soma += num;
            num--;
        } while (num > 0);

        System.out.println("A soma total é: " + soma);
    }
}