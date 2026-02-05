abstract class Animal{
    public abstract void fazerSom();

    public void dormir(){
        System.out.println("Zzz Zzz");
    }
}

class Cachorro extends Animal{
    public void fazerSom(){
        System.out.println("Aua Au");
    }
}

class Gato extends Animal{
    public void fazerSom(){
        System.out.println("Miau Miau");
    }
}

public class TestePolimorfismo{
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();

        cachorro.fazerSom();
        cachorro.dormir();
        gato.fazerSom();
        gato.dormir();
    }
}