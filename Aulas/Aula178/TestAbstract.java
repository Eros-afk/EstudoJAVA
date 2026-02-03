abstract class Carro{
    abstract void acelerar();

    int codigo = 10;

    Carro (int cod){
        codigo = cod;
    }

    void frear(){
        System.out.println("O carro está freiando...");
    }
}

class Caminhao extends Carro{

    public Caminhao(int codigo) {
        super(codigo);
    }


    void acelerar(){
        System.out.println("O caminhão está acelerando lentamente.");
    }
}

public class TestAbstract{
    public static void main(String[] args) {

        Caminhao caminhao = new Caminhao(1000);

        caminhao.acelerar();
        caminhao.frear();
        System.out.println("Código " + caminhao.codigo);
    }
}