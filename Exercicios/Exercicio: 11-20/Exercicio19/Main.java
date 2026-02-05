public class Main{
    public static void main(String[] args){
        Personagem personagem1 = new Personagem("Goku", 9000);
        System.out.println("Nome: " + personagem1.nome);
        System.out.println("Nível de Poder: " + personagem1.nivelDePoder);

        personagem1.aumentarPoder(500);
        System.out.println("Nível de Poder após aumento: " + personagem1.nivelDePoder);

        personagem1.mudarNome(personagem1, "Gohan");
        System.out.println("Nome após mudança: " + personagem1.nome);
    }
}