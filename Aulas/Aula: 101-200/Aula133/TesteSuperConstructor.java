class Animal {
    String nome;

    Animal(String nome) {
        this.nome = nome;
    }
}

class Cachorro extends Animal {
    String raca;

    Cachorro(String nome, String raca) {
        super(nome);
        this.raca = raca;
    }
}

public class TesteSuperConstructor{
    public static void main(String[] args) {
        Cachorro dog = new Cachorro("Rex", "Labrador");
        System.out.println("O nome do animal é: " + dog.nome);
        System.out.println("A raça do animal é: " + dog.raca);
    }
}
