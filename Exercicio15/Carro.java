public class Carro{
    String marcaDoCarro;
    String modeloDoCarro;
    int anoDoCarro;

    public Carro(){
        marcaDoCarro = "Desconhecida";
        modeloDoCarro = "Desconhecido";
        anoDoCarro = 0;
    }

    public Carro(String marca, String modelo){
        marcaDoCarro = marca;
        modeloDoCarro = modelo;
        anoDoCarro = 0;
    }

    public Carro(String marca, String modelo, int ano){
        marcaDoCarro = marca;
        modeloDoCarro = modelo;
        anoDoCarro = ano;
    }

    public String exibirDetalhes(){
        return "Marca: " + marcaDoCarro + ", \nModelo: " + modeloDoCarro + ", \nAno: " + anoDoCarro + "\n";
    }
}