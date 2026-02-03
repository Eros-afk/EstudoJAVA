interface Interface1{
    void metodoA();
}

interface Interface2{
    void metodoB();
}

//Interface que herda de duas outras interfaces
interface interface3 extends Interface1, Interface2{
    void metodoC();
}

class ClasseExemplo implements interface3{
    public void metodoA(){
        System.out.println("Implementação do método A");
    }
    public void metodoB(){
        System.out.println("Implementação do método B");
    }
    public void metodoC(){
        System.out.println("Implementação do método C");
    }
}

/*
    class ClasseExemplo implements Interface1, Interface2{
        public void metodoA(){
            System.out.println("Implementação do método A");
        }
        public void metodoB(){
            System.out.println("Implementação do método B");
        }
    }
 */

public class TestInterfaceMultipla{
    public static void main(String[] args) {
        ClasseExemplo exemplo = new ClasseExemplo();
        exemplo.metodoA();
        exemplo.metodoB();
        exemplo.metodoC();
    }
}