public class Aplicacao{
    public static void main(String[] args){
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes");
        System.out.println(livro1.titulo);
        livro1.getAutor();
    }
}