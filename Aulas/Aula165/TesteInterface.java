interface Animal{
    String DESCRICAO = "Interface para animal";
    void fazerSom();
}

//Classe Cachorro implementa a interface Animal
class Cachorro implements Animal{
    public void fazerSom(){
        System.out.println("Au Au");
    }
}

class Gato implements Animal{
    public void fazerSom(){
        System.out.println("Miau Miau");
    }
}

public class TesteInterface{
    public static void main(String[] args){
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();

        meuCachorro.fazerSom(); // Saída: Au Au
        meuGato.fazerSom();     // Saída: Miau Miau

        System.out.println("Descrição: " + Animal.DESCRICAO);
    }
}