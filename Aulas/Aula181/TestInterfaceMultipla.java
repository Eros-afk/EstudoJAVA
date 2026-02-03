interface Interface1{
    void metodoA();
}

interface Interface2{
    void metodoB();
}

abstract class ClasseExemplo implements Interface1, Interface2{
    public void metodoA(){
        System.out.println("Implementação do método A");
    }
    public void metodoB(){
        System.out.println("Implementação do método B");
    }
}

public class TestInterfaceMultipla extends ClasseExemplo{
    public static void main(String[] args) {
        TestInterfaceMultipla teste = new TestInterfaceMultipla();
        teste.metodoA();
        teste.metodoB();
    }
}