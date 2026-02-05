class CaixaDeBrinquedos{
    private Object coisaNaCaixa;

    public void guardar(Object coisa){
        this.coisaNaCaixa = coisa;
    }

    public Object pegar(){
        return coisaNaCaixa;
    }

    public static void main(String[] args) {
        //Criando uma caixa para guardar um carrinho
        CaixaDeBrinquedos caixaDeCarrinhos = new CaixaDeBrinquedos();
        caixaDeCarrinhos.guardar(new Carrinho("Fusca"));

        //Criando uma caixa para guardar bonecas
        CaixaDeBrinquedos caixaDeBonecas = new CaixaDeBrinquedos();
        caixaDeBonecas.guardar(new Boneca("Barbie"));

        //Verificar o tipo de objeto antes de fazer o cast
        if(caixaDeCarrinhos.pegar() instanceof Carrinho){
            Carrinho carrinho = (Carrinho) caixaDeCarrinhos.pegar();
            System.out.println("carrinho.getModelo(): " + carrinho.getModelo());
        }
        if (caixaDeBonecas.pegar() instanceof Boneca) {
            Boneca boneca = (Boneca) caixaDeBonecas.pegar();
            System.out.println("boneca.getNome(): " + boneca.getNome());
        }
    }
}