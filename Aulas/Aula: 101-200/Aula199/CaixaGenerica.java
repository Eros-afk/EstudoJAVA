public class CaixaGenerica<T>{
    private T coisaNaCaixa;

    public void guardar(T coisa){
        this.coisaNaCaixa = coisa;
    }

    public T pegar(){
        return coisaNaCaixa;
    }

    public static void main(String[] args) {
        //Criando uma caixa para guardar um carrinho
        CaixaGenerica<Carrinho> caixaDeCarrinhos = new CaixaGenerica<>();
        caixaDeCarrinhos.guardar(new Carrinho("Fusca"));

        //Criando uma caixa para guardar bonecas
        CaixaGenerica<Boneca> caixaDeBonecas = new CaixaGenerica<>();
        caixaDeBonecas.guardar(new Boneca("Barbie"));

        //Não precisamos mais verificar o tipo ou fazer cast
        //Pois o método pegar() retorna um Carrinho ou uma BOneca diretamente
        //Respectivamente

        //Pegando o carrinho da caixa
        Carrinho carrinho = caixaDeCarrinhos.pegar();
        System.out.println("carrinho.getModelo(): " + carrinho.getModelo());

        //Pegando a boneca da caixa
        Boneca boneca = caixaDeBonecas.pegar();
        System.out.println("boneca.getNome(): " + boneca.getNome());
    }
}