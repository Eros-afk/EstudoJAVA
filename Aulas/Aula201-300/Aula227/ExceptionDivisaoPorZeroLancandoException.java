public class ExceptionDivisaoPorZeroLancandoException{
    
    public static int calcularMedia(int totalNotas, int quantidadeAlunos) throws ArithmeticException{
        return totalNotas / quantidadeAlunos;
    }
    public static void main(String[] args) {
        int totalNotas = 10;

        int qunatidadeAlunos = 0;

        try {
            int media = calcularMedia(totalNotas, qunatidadeAlunos);
            System.out.println("Média: " + media);
        } catch (ArithmeticException e) {
            System.err.println("Erro: Divisão por Zero" + e.getMessage());
        }
        System.out.println("O programa segue normalmente");
    }
}