public class Produto{
    private String nome;
    private double preco;
    private int quantidadedeEmEstoque;

    public Produto(String nomeInit, double precoInit, int quantidadedeEmEstoqueInit){
        nome = nomeInit;
        preco = precoInit;
        quantidadedeEmEstoque = quantidadedeEmEstoqueInit;
    }

    public String getNome() {
        return nome;
    }
    public double getPreco(){
        return preco;
    }
    public int getqunatidadeEmEstoque(){
        return quantidadedeEmEstoque;
    }
}