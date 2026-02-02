class Veiculo{
    public void acelerar(){
        System.out.println("O veículo está acelerando");
    }
}

class Carro extends Veiculo{
    @Override
    public void acelerar(){
        super.acelerar();
        System.out.println("O carro está acelerando");
    }
}

public class TesteVeiculo{
    public static void main(String[] args){
        Carro carro = new Carro();
        carro.acelerar();
    }
}

