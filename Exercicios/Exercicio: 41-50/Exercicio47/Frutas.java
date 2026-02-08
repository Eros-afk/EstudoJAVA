
import java.util.*;

public class Frutas{
    public static void main(String[] args) {
        List<String> minhaLista = new ArrayList<>();
        minhaLista.add("maça");
        minhaLista.add("banana");
        minhaLista.add("cereja");
        minhaLista.add("abacaxi");

        minhaLista.removeIf(letras -> letras.length() > 5);

        minhaLista.add(0, "uva");

        minhaLista.forEach(System.out::println);
    }
}