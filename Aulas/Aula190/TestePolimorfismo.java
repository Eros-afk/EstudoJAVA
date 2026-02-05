abstract class Animal extends Object{
    public abstract void fazerSom();
}

class Cachorro extends Animal{
    public void fazerSom(){
        System.out.println("Au Au");
    }
}

class Gato extends Animal{
    public void fazerSom(){
        System.out.println("Miau Miau");
    }
}

public class TestePolimorfismo{
    public static void main(String[] args) {
        Object meuCachorro = new Cachorro();
        Object meuGato = new Gato();
    
        Cachorro objConvertido = (Cachorro) meuCachorro;
        objConvertido.fazerSom();

        ((Cachorro) meuCachorro).fazerSom();
    }
}