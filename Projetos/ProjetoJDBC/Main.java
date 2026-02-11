import java.sql.Connection;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        try (Connection conexao = ConexaoDB.conectar()) {
            ProdutoDAO produtoDAO = new ProdutoDAO(conexao);

            //Lista todos os produtos (deve estar vazio)
            mostrarProdutos(produtoDAO);
            
            //Exemplo de inserção de produtos
            Produto novoProduto1 = new Produto("Notebook", 10, 1999.99, "Em estoque");
            Produto novoProduto2 = new Produto("Smartphone", 120, 1499.99, "Estoque baixo");
            Produto novoProduto3 = new Produto("Tablet", 15, 799.99, "Estoque Baixo");

            produtoDAO.inserir(novoProduto1);
            produtoDAO.inserir(novoProduto2);
            produtoDAO.inserir(novoProduto3);

            mostrarProdutos(produtoDAO);

            //Exemplo de consulta por ID (consultando o produto com ID 1)
            Produto produtoConsultado = produtoDAO.consultarPorId(id);
            
        } catch (Exception e) {
        }
    }
}