
import empresa.dados.Funcionario;



class FolhaDePagamento{
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Davi", 3500.00);
        System.out.println(funcionario.obterInfo());
    }
}