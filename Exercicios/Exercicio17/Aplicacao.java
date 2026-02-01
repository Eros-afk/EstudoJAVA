public class Aplicacao{
    public static void main(String[] args){
        Livro livro0 = new Livro();
        System.out.println("Título: " + livro0.titulo);
        livro0.getAutor();
        System.out.println("Ano de Publicação: " + livro0.anoPublicacao);
        System.out.println("Preço: " + livro0.preco);
        
        Livro livro1 = new Livro("Dom Quixote", "Miguel de Cervantes");
        System.out.println(livro1.titulo);
        livro1.getAutor();
        System.out.println("Ano de Publicação: " + livro1.anoPublicacao);
        System.out.println("Preço: " + livro1.preco);

        Livro livro2 = new Livro("1984", "George Orwell", 1949, 39.90f);
        System.out.println(livro2.titulo);
        livro2.getAutor();
        System.out.println("Ano de Publicação: " + livro2.anoPublicacao);
        System.out.println("Preço: " + livro2.preco);
    }
}