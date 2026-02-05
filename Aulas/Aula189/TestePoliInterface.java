interface Veiculo{ //Interface é um contrato que define um conjunto de métodos que uma classe deve implementar. Ela não pode conter implementação de métodos, apenas a assinatura.
    void acelerar();
}

class Carro implements Veiculo{
    public void acelerar(){
        System.out.println("O carro está acelerando.");
    }
}

class Moto implements Veiculo{
    public void acelerar(){
        System.out.println("A moto está acelerando.");
    }
}

public class TestePoliInterface{
    public static void main(String[] args) {

        //Objetos polimorficos
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();

        carro.acelerar();
        moto.acelerar();
    }
}