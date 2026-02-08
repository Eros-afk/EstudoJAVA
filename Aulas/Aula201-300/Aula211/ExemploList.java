
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExemploList{
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        System.out.println("Contém Java? " + lista.contains("Java"));

        List<String> outraLista = Arrays.asList("JavaScript", "Ruby");
        lista.addAll(outraLista);

        System.out.println("Lista: " + lista);

        lista.remove("Python");

        System.out.println("Lista após remoção: " + lista);

        System.out.println("Elemento na posição 2: " + lista.get(2));

        lista.clear();
        System.out.println("Lista após limpar: " + lista);

    }
}
