public class ExceptionDivisaoPorZero{
    public static void main(String[] args) {
        int totalNotas = 100;
        int quantidadeAlunos = 0;

        try {
            int media = totalNotas/quantidadeAlunos; 
        } catch (ArithmeticException _) {
            System.err.println("Problema: Divisão por zero!");
        } finally{
            System.out.println("O programa terminou.");
        }
    }
}