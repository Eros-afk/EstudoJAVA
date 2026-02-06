abstract class Loja{
    String cnpj;
    String razaoSocial;
    boolean aberta;

    void abrir(){
        aberta = true;
        System.out.println("Loja aberta.");
    }

    void fechar(){
        aberta = false;
        System.out.println("Loja fechada.");
    }
}

class LojaComercial extends Loja{

    public LojaComercial(String cnpj, String razaoSocial) {
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }   
}

public class Main{
    public static void main(String[] args) {
        LojaComercial loja = new LojaComercial("12.345.678/0001-90", "Loja Exemplo");
        System.out.println("CNPJ: " + loja.cnpj);
        System.out.println("Razão Social: " + loja.razaoSocial);
        loja.abrir();
        loja.fechar();
    }
}