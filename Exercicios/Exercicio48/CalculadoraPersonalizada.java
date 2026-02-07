@FunctionalInterface
interface OperacaoMatematica{
    double executar(double a, double b);
}

public class CalculadoraPersonalizada{
    public static void main(String[] args) {
        OperacaoMatematica potencia = (a, b) -> Math.pow(a, b);
        System.out.println("Potencia: " + potencia.executar(2, 3));

        OperacaoMatematica raizQ = (a, b) -> Math.sqrt(a + b);
        System.out.println("Raiz quadrada: " + raizQ.executar(10, 5));
    }
}