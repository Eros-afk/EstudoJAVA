class Pessoa{
    String nome;
    int idade;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
}

class Estudante extends Pessoa{
    int matricula;

    public Estudante(String nome, int idade, int matricula) {
        super(nome, idade);
        this.matricula = matricula;
    }
}

public class Escola{
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Maria", 20, 12345);
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Matrícula: " + estudante.matricula);
    }
}