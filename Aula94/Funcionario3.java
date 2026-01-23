public class Funcionario3{
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
    
    //Sobrecarga de construtores, o compilador identifica qual usar baseado na lista de parâmetros

    Funcionario3(String nomeInit, String cargoInit, int idadeInit) {
        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;
    }

    Funcionario3(String nomeInit){
        nome = nomeInit;
    }

    Funcionario3(){

    }

    public static void main(String[] args) {
        
        //Funcionario3 funcionario1 = new Funcionario3("Alan", "Dev", 25);

        Funcionario3 funcionarioAlan = new Funcionario3();
        funcionarioAlan.nome = "Alan";

        System.out.println("Nome: " + funcionarioAlan.nome);
        System.out.println("Cargo: " + funcionarioAlan.cargo);
        System.out.println("Idade: " + funcionarioAlan.idade);


        Funcionario3 funcionarioAna = new Funcionario3("Ana");
        System.out.println("\nNome: " + funcionarioAna.nome);
    }
}