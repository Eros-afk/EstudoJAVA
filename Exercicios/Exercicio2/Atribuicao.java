public class Atribuicao{
    public static void main(String[] args) {
        int numero = 5;
        System.err.println("Valor inicial: " + numero);
        numero += 3;
        System.out.println("Após atribuição de adição (+= 3): " + numero);
        numero -= 2;
        System.out.println("Após atribuição de subtração (-= 2): " + numero);
        numero *= 4;
        System.out.println("Após atribuição de multiplicação (*= 4): " + numero);
        numero /= 2;
        System.out.println("Após atribuição de divisão (/= 2): " + numero);
    }
}