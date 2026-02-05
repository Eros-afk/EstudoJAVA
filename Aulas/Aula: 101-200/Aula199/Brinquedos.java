class Carrinho{
    private String modelo;
    public Carrinho(String modelo){
        this.modelo = modelo;
    }
    public String getModelo(){
        return modelo;
    }
}

class Boneca{
    private String nome;
    public Boneca(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
}

public class Brinquedos{
    public static void main(String[] args) {
        Carrinho carrinho = new Carrinho("Fusca");
        Boneca boneca = new Boneca("Barbie");

        System.out.println("Brinquedo 1: " + carrinho.getModelo());
        System.out.println("Brinquedo 2: " + boneca.getNome());
    }
}