class ExemploFinal{
    //Definição de COnstante - uso de final
    final int CODIGO_FIXO = 10;

    //Método final
    final void meuMetodo(){
        System.out.println("Este é um método final.");
    }
}

public class TestFinalKeyword{
    public static void main(String[] args) {
        ExemploFinal testFInal = new ExemploFinal();

        //testFinal.CODIGO_FIXO = 20 Isso causa um erro de compilação

        System.out.println("Valor da contante CODIGO_FIXO: " + testFInal.CODIGO_FIXO);
        testFInal.meuMetodo();
    }
}

//Se for tentar estender a classe ExemploFinal ou sobrescrever o método meuMetodo, ocorrerá um erro de compilação.

//Não pode extender um classe final
//class subClasse extends ExemploFinal{}