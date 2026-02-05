class FinalVariables{
    final int numeroMaximo = 100;
    final String mensagem = "Bem-vindo ao Javalar!";

    void imprimirValoresFinais(){
        System.out.println("Número Máximo: " + numeroMaximo);
        System.out.println("Mensagem: " + mensagem);
    }
}


public class Main{
    public static void main(String[] args) {
        FinalVariables exemplo = new FinalVariables();
        //exemplo.numeroMaximo = 200; // Isso causará um erro de compilação
        //exemplo.mensagem = "Python é incrivel!"; // Isso também causará erro de compilação
        exemplo.imprimirValoresFinais();
    }
}