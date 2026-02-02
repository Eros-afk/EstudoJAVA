public class Funcionario{
    String nome;
    String cargo;
    int idade;

    public static void main(String[] args) {
        
        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "Alan";
        funcionario1.cargo = "Dev";
        funcionario1.idade = 25;

        System.err.println("Nome: " + funcionario1.nome);
        System.out.println("Cargo: " + funcionario1.cargo);
        System.out.println("Idade: " + funcionario1.idade);
    

        Funcionario funcionario2 = new Funcionario();
        funcionario2.nome = "Ana";
        funcionario2.cargo = "ADM";
        funcionario2.idade = 34;

        System.err.println("\nNome: " + funcionario2.nome);
        System.out.println("Cargo: " + funcionario2.cargo);
        System.out.println("Idade: " + funcionario2.idade);
    }
}