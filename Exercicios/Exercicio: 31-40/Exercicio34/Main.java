interface Produto{
    String getNome();
    int getQuantidade();
    void adicionarQuantidade(int quantidade);
    void removerQuantidade(int quantidade);
}

class ProdutoImpl implements Produto{
    private String nome;
    private int quantidade;

    public ProdutoImpl(String nome, int quantidade){
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    public String getNome(){
        return this.nome;
    }

    @Override
    public int getQuantidade(){
        return this.quantidade;
    }

    @Override
    public void adicionarQuantidade(int quantidade){
        this.quantidade += quantidade;
    }

    @Override
    public void removerQuantidade(int quantidade){
        this.quantidade -= quantidade;
        if(this.quantidade < 0){
            this.quantidade = 0;
            System.out.println("Quantidade insuficiente. Estoque zerado.");
        }
    }
}

public class Main{
    public static void main(String[] args){
        Produto produto = new ProdutoImpl("Caneta", 10);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Quantidade inicial: " + produto.getQuantidade());

        produto.adicionarQuantidade(5);
        System.out.println("Quantidade após adição: " + produto.getQuantidade());

        produto.removerQuantidade(8);
        System.out.println("Quantidade após remoção: " + produto.getQuantidade());

        produto.removerQuantidade(10);
        System.out.println("Quantidade após remoção excessiva: " + produto.getQuantidade());
    }
}