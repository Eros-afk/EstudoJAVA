public class Produto{
    private String nome;
    private double preco;
    private int quantidadedeEmEstoque;

    public Produto(String nomeInit, double precoInit, int quantidadedeEmEstoqueInit){
        nome = nomeInit;
        preco = precoInit;
        quantidadedeEmEstoque = quantidadedeEmEstoqueInit;
    }

    public void exibirProduto(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade em Estoque: " + quantidadedeEmEstoque);
        System.out.println("");
    }
}