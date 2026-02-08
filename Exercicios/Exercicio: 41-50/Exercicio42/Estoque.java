
import java.util.HashMap;
import java.util.Map;

public class Estoque {
    public static void main(String[] args) {
// Cria um Map para representar o estoque de produtos
        Map<Integer, Integer> estoque = new HashMap<>();

// Adiciona produtos ao estoque
        estoque.put(123, 50);
        estoque.put(456, 30);
        estoque.put(789, 20);

// Verifica a quantidade disponível de um produto
        int codigoProduto = 123;
        int quantidadeProduto = estoque.get(codigoProduto);
        System.out.println("Quantidade de produto " + codigoProduto + ": " + quantidadeProduto);

// Remove alguns produtos do estoque
        int quantidadeRemovida = 10;
        if (quantidadeProduto >= quantidadeRemovida) {
            estoque.put(codigoProduto, quantidadeProduto - quantidadeRemovida);
            System.out.println("Quantidade de produto " + codigoProduto + " após remoção: " + (quantidadeProduto - quantidadeRemovida));
        } else {
            System.out.println("Quantidade insuficiente para remover.");
        }
    }
}
