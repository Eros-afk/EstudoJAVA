interface Veiculo{
    void iniciar();
    void parar();
    default void buzinar(){
        System.out.println("Buzina!");
    }
}

class Carro implements Veiculo{
    public void iniciar(){
        System.out.println("Carro iniciado.");
    }
    public void parar(){
        System.out.println("Carro parado.");
    }
}

class Caminhao implements Veiculo{
    public void iniciar(){
        System.out.println("Caminhão iniciado.");
    }
    public void parar(){
        System.out.println("Caminhão parado.");
    }
}

public class Main{
    public static void main(String[] args) {
        Veiculo meuCarro = new Carro();
        Veiculo meuCaminhao = new Caminhao();

        meuCarro.iniciar();
        meuCarro.buzinar();
        meuCarro.parar();

        meuCaminhao.iniciar();
        meuCaminhao.buzinar();
        meuCaminhao.parar();
    }
}