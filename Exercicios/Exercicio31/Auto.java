final class Veiculo{
    public void ligarMotor(){
        System.out.println("Motor ligado.");
    }
}

class Carro extends Veiculo{
    public void abrirPorta(){
        System.out.println("Porta do carro aberta.");
    }
}

public class Auto{
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.ligarMotor();
        meuCarro.abrirPorta();
    }
}