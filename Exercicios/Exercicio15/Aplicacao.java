public class Aplicacao{
    public static void main(String[] args){
        Carro carro = new Carro("Toyota", "Corolla", 2020);
        System.out.println(carro.exibirDetalhes());

        Carro carro2 = new Carro("Honda", "Civic");
        System.out.println(carro2.exibirDetalhes());

        Carro carro3 = new Carro();
        System.out.println(carro3.exibirDetalhes());
    }
}