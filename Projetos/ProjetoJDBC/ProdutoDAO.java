import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO{
    private final Connection CONEXAO_DB;

    //Construtor que inicializa a conexão com o banco de dados
    public ProdutoDAO(Connection conexao){
        this.CONEXAO_DB = conexao;
    }

    //Método para inserir um novo produto no banco de dados
    public void inserir(Produto produto){
        String sql = "INSERT INTO produtos (nome_produto, qunatidade, preco, status) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = CONEXAO_DB.prepareStatement(sql)) {
            stmt.setString(1, produto.getNome());
            stmt.setInt(2, produto.getQuantidade());
            stmt.setDouble(3, produto.getPreco());
            stmt.setString(4, produto.getStatus());
            stmt.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Erro ao inserir produto: " + e.getMessage());
        }
    }

    //Método para excluir todos os produtos do banco de dados
    public void limparTabela(){
        String sql = "DELETE FROM produtos";
        try (PreparedStatement stmt = CONEXAO_DB.prepareStatement(sql)){
            stmt.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao exluir todos os produtos: " + e.getMessage());
        }
    }
}