
import java.util.HashMap;
import java.util.Map;

public class ExemploMap{
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();

        //Adicionando pares chave-valor ao mapa
        mapa.put("Java", 1);
        mapa.put("Python", 2);
        mapa.put("C++", 3);

        //Verificar se o mapa contém uma chave
        System.out.println("Contém Java? " + mapa.containsKey("Java"));

        //Obter o valor associado a uma chave
        System.out.println("Valor associado a Python: " + mapa.get("Python"));

        mapa.put("JavaScript", 4);
        mapa.put("Ruby", 5);

        //Imprime sem ordem específica
        System.out.println("Mapa: " + mapa);

        //Remover um par chave-valor do mapa
        mapa.remove("Python"); 
        
        System.out.println("Mapa após remoção: " + mapa);

        mapa.put("Java", 6); //Atualiza o valor associado a chave Java

        System.out.println("Mapa após atualização: " + mapa);

        mapa.clear(); //Limpando o mapa
        System.out.println("Mapa após limpar: " + mapa);
   }
}