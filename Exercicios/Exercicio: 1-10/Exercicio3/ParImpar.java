public class ParImpar{
    public static void main(String[] args) {
        int numero = 7;
        String resultado = (numero % 2 == 0) ? (numero + " é par") : (numero + " é impar");
        System.out.println(resultado);
    }
}