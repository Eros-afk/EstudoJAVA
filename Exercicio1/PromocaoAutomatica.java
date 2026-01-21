
public class PromocaoAutomatica {

    public static void main(String[] args) {
        byte a = 10;
        short b = 20;
        char c = 'A';
        int d = 30;
        long e = 40L;
        float f = 1.5f;
        double g = 2.5;

        int resultado = a + b;
        System.out.println("Resultado de soma: " + resultado);
        System.out.println("Valor do char: " + c);

        long resultadoLong = d + e; // int promovido para long
        float resultadoFloat = d * f; // int promovido para float
        double resultadoDouble = d * g; // int promovido para double

        System.out.println("Resultado long: " + resultadoLong);
        System.out.println("Resultado float: " + resultadoFloat);
        System.out.println("Resultado double: " + resultadoDouble);
    }
}
