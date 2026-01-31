package empresa.dados;

public class Funcionario{
    private String nome;
    double salario;

    private Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
    }
    
    protected Funcionario(){
        Funcionario func = new Funcionario("Roberto", 4500.00);
    }
}