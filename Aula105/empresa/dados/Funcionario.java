package empresa.dados;

public class Funcionario{
    private String nome;
    public double salario; //encapsulamento, só poder ser acessado dentro da própria classe

    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public String obterInfo(){
        return "Nome: " + nome + ", Salário: " + salario;
    }

    public void aumentarSalario(double valor){
        //valor += 100;
        salario += valor;
    }

    public void alterarQualquerSalario(Funcionario func, double
    novoSalario){
        func.salario = novoSalario;
    }

    public void aumentarSalario(int porcetagem){
        salario += salario * porcetagem / 100;
    }
}