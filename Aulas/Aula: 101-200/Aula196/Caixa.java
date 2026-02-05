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

        //Criando uma caixa para guarda números Inteiros
        Caixa<Integer> caixaDeInteiro = new Caixa<>();
        //Integer valor = 123; // Autoboxing
        //Inter numero = new Integer(123); Depreciado
        Integer numero = Integer.valueOf(123);
        caixaDeInteiro.guardar(numero);
        Integer valorResgatado = caixaDeInteiro.pegar();
        System.out.println(valorResgatado);
    }
}