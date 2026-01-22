public class Aprovacao{
    public static void main(String[] args) {
        float nota1 = 7.5f;
        float nota2 = 6.0f;
        float media = (nota1 +nota2) / 2;

        if (media < 7) {
            System.out.println("Reprovado");
        } else if (media >= 4 && media <= 6) {
            System.out.println("Recuperação");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Nota inválida");
            
        }
    }
}