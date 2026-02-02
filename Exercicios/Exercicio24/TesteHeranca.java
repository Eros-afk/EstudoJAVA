

class Funcionario{
    private String nome;
    private double salario;

    public void addAumento(double valor){
        salario += valor;
    }

    public double ganhoAnual(){
        return salario * 12;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}

class Assistente extends Funcionario{
    public double ganhoAnual(){
        return super.ganhoAnual() + 1000;
    }
}

public class TesteHeranca{
    public static void main(String[] args) {
        Assistente assistente = new Assistente();
        assistente.setNome("João");
        assistente.setSalario(3000.00);
        assistente.addAumento(500);

        System.out.println("Nome: " + assistente.getNome());
        System.out.println("Salário Mensal: " + assistente.getSalario());
        System.out.println("Ganho Anual: " + assistente.ganhoAnual());
    }
}