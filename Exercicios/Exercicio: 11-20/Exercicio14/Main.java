public class Main{
    public static void main(String[] args) {
        Produto produto = new Produto("Caneta", 2.50, 100);
        Produto produto2 = new Produto("Caderno", 15.00, 50);

        produto.exibirProduto();
        produto2.exibirProduto();
    }
}