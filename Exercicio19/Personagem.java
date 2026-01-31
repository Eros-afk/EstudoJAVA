public class Personagem{
    public String nome;
    int nivelDePoder;

    Personagem(String nome, int nivelDePoder){
        this.nome = nome;
        this.nivelDePoder = nivelDePoder;
    }

    public void aumentarPoder(int incremento){
        nivelDePoder += incremento;
    }

    public void mudarNome(Personagem persona, String novoNome){
        persona.nome = novoNome;
    }
}