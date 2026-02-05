
public class Aplicacao {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("João", 30, "Rua A", "1234-5678");

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Idade: " + pessoa.getIdade());
        pessoa.setIdade(31);
        System.out.println("Idade atualizada: " + pessoa.getIdade());

        System.out.println("Endereço: " + pessoa.getEndereco());
        pessoa.setEndereco("Rua B, 456");
        System.out.println("Novo Endereço: " + pessoa.getEndereco());
        
        System.out.println("Telefone: " + pessoa.getTelefone());
        pessoa.setTelefone("8765-4321");
        System.out.println("Novo Telefone: " + pessoa.getTelefone());

    }
}
