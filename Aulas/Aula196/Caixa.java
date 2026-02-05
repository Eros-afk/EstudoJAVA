public class Caixa<T> {
    private T coisaNaCaixa;

    public void guardar(T coisa){
        this.coisaNaCaixa = coisa;
    }

    public T pegar(){
        return this.coisaNaCaixa;
    }

    public static void main(String[] args) {
        //Criando uma caixa para guardar Strings

        Caixa<String> caixaDeString = new Caixa<>();
        caixaDeString.guardar("Olá mundo");
        String texto = caixaDeString.pegar();
        System.out.println(texto);
    }
}