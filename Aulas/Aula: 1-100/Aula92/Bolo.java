public class Bolo{
    int quantidadeDeAcucar;
    public static void main(String[] args) {
        Bolo boloDeChocolate = new Bolo();
        boloDeChocolate.quantidadeDeAcucar = 200;

        Bolo boloDeBaunilha = new Bolo();
        boloDeBaunilha.quantidadeDeAcucar = 150;

        System.out.println("Bolo de chocolate tem " + boloDeChocolate.quantidadeDeAcucar + "g de açucar.");
        System.out.println("Bolo de baunilha tem " + boloDeBaunilha.quantidadeDeAcucar + "g de açucar.");
    }
}