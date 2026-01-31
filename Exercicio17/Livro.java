class Livro{
    public String titulo;
    private String autor;
    protected int anoPublicacao;
    float preco;

    public Livro(){
        titulo = "Desconhecido";
        autor = "Desconhecido";
        anoPublicacao = 0;
        preco = 0.0f;
    }

    public Livro(String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = 0;
        this.preco = 0.0f;    
    }

    public Livro(String titulo, String autor, int anoPublicacaoInit, float preco){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacaoInit;
        this.preco = preco;    
    }

    public void setAutor(String autor) { 
        this.autor = autor;
    }

    public void getAutor(){
        System.out.println("Autor: " + autor);
    }
}