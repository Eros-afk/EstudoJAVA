public class Aplicacao{
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.setIdade(12);
        pessoa1.setEndereco("Av.Bou");
        pessoa1.setTelefone("122222");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println(pessoa1.getIdade());
        System.out.println(pessoa1.getEndereco());
        System.out.println(pessoa1.getTelefone());
    }
}