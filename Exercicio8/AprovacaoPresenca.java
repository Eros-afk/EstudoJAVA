public class AprovacaoPresenca{
    public static void main(String[] args) {
        float nota1 = 7.5f;
        float nota2 = 7.5f;
        int frequencia = 75;
        float media = (nota1 + nota2) / 2;

        if(media < 7 || frequencia < 75){
            System.out.println("Reprovado");
        } else if(media >=4 && media <= 6 && frequencia >= 75){
            System.out.println("Recuperação");
        } else if(media >= 7 && frequencia >= 75){
            System.out.println("Aprovado");
        } else {
            System.out.println("Nota ou presença inválida");
        }
    }
}