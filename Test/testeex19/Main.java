
public class Main {

    public static void main(String[] args) {
        Personagem heroi = new Personagem("Mago", 50);
        System.out.println("Antes de tentarAumentarNivelDePoder: " + heroi.nivelDePoder);
        heroi.tentarAumentarNivelDePoder(heroi.nivelDePoder);
        System.out.println("Depois de tentarAumentarNivelDePoder: " + heroi.nivelDePoder);
        System.out.println("Antes de mudarNome: " + heroi.nome);
        heroi.mudarNome(heroi);
        System.out.println("Depois de mudarNome: " + heroi.nome);
        System.out.println("Antes de aumentarNivelDePoder: " + heroi.nivelDePoder);
        heroi.aumentarNivelDePoder();
        System.out.println("Depois de aumentarNivelDePoder: " + heroi.nivelDePoder);
    }
}
