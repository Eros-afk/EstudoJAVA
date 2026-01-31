
import empresa.dados.Funcionario;

class FolhaDePagamento{
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Davi", 3500.00);
        
        funcionario.aumentarSalario(1000.00);
        
        System.out.println(funcionario.obterInfo());
        //funcionario.aumentarSalario(2000.00);
        //funcionario.alterarQualquerSalario(funcionario, 5000.00);
        //funcionario.salario = 7000.00;
        //System.out.println(funcionario.obterInfo());
    }
}