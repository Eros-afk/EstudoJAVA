
class Personagem {

    String nome;
    int nivelDePoder;

    Personagem(String nome, int nivelDePoder) {
        this.nome = nome;
        this.nivelDePoder = nivelDePoder;
    }
// Método que tenta modificar um valor primitivo

    public void tentarAumentarNivelDePoder(int nivelDePoder) {
        nivelDePoder += 10;
    }
// Método que modifica um objeto

    public void mudarNome(Personagem personagem) {
        personagem.nome = "Guerreiro";
    }
// Método que realmente aumenta o nível de poder do personagem

    public void aumentarNivelDePoder() {
        this.nivelDePoder += 10;
    }
}
