public class Funcionario2{
    String nome;
    String cargo;
    int idade;

    /*
    Funcionario2(String nome, String cargo, int idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }
    */
    
    public Funcionario2(String nomeInit, String cargoInit, int idadeInit) {
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;
    }

    public static void main(String[] args) {
        
        Funcionario2 funcionario1 = new Funcionario2("Alan", "Dev", 25);
        /*funcionario1.nome = "Alan";
        funcionario1.cargo = "Dev";
        funcionario1.idade = 25;*/

        System.err.println("Nome: " + funcionario1.nome);
        System.out.println("Cargo: " + funcionario1.cargo);
        System.out.println("Idade: " + funcionario1.idade);
    

        Funcionario2 funcionario2 = new Funcionario2("Duda", "ADM", 34);
        /*funcionario2.nome = "Ana";
        funcionario2.cargo = "ADM";
        funcionario2.idade = 34;*/

        System.err.println("\nNome: " + funcionario2.nome);
        System.out.println("Cargo: " + funcionario2.cargo);
        System.out.println("Idade: " + funcionario2.idade);
    }
}