public class Main{
    public static void main(String[] args) {
        Produto produto = new Produto("Caneta", 2.50, 100);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getqunatidadeEmEstoque());
    }
}