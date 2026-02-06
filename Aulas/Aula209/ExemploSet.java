import java.util.HashSet;
import java.util.Set;

//import java.util.* //Importa todas as classes do pacote java.util 

public class ExemploSet{
    public static void main(String[] args){
        Set<String> conjunto = new HashSet<>();

        // Adicionando elementos ao conjunto
        conjunto.add("Java");
        conjunto.add("Python");
        conjunto.add("C++");

        // Verificara se o conjunto contém um elemento
        System.out.println("Contem 'Java?'? " + conjunto.contains("Java")); // true

        // Adiciona mais elementos
        conjunto.add("JavaScript");
        conjunto.add("Ruby");

        // Imprime o conjunto
        System.out.println("Conjunto completo: " + conjunto);

        // Remove um elemento
        conjunto.remove("Python");

        // Imprime o conjunto após a remoção
        System.out.println("Conjunto após remoção: " + conjunto);

        // Tentando adcionar um elemento duplicado 
        boolean adicionado = conjunto.add("Java");
        System.out.println("Tentando adicionar 'Java' novamente: " + adicionado); // false, pois 'Java' já existe no conjunto

        conjunto.clear(); // Limpa o conjunto
        System.out.println("Conjunto após limpeza: " + conjunto); // Conjunto vazio
    }
}