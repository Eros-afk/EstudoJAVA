public class TesteArrayException{
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) { // poderia colocar apenas Exception que é a classe pai do tratamento de excessões
            System.err.println("Erro: " + e.getMessage());
        }
        System.out.println("O programa segue normalmente");
    }
}