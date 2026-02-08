
import java.util.ArrayList;
import java.util.List;

public class Filmes {

    public static void main(String[] args) {
        List<String> filmes = new ArrayList<>();

        filmes.add("Sexta-Feira13");
        filmes.add("Nada de Novo no Front");
        filmes.add("O gerente ficou maluco");

        System.out.println("Catálogo de de filmes: " + filmes);

        /*
        System.out.println("Lista de filmes: ");
        for(String filme : filmes){
            System.out.println(filme);
        }
         */

        System.out.println("Nada de Novo no Front está no catálogo? " + filmes.contains("Nada de Novo no Front"));

        /*
        String filmeBuscado = "Matrix";
        if (filmes.contains(filmeBuscado)) {
            System.out.println(filmeBuscado + " está na lista.");
        } else {
            System.out.println(filmeBuscado + " não está na lista.");
        }
        */
    }
}
