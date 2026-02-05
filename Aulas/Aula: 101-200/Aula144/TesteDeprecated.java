class InformaRegras{
    @Deprecated
    public void mostraRegras(){
        System.out.println("Regra do sistema");
    }

    public void mostraNovasRegras(){
        System.out.println("Novas regras do sistema");
    }

    public void chamarMetodoObsoleto(){
        mostraRegras();
    }
}

public class TesteDeprecated{
    public static void main(String[] args) {
        InformaRegras regras = new InformaRegras();
        
        regras.chamarMetodoObsoleto();
    }
}
