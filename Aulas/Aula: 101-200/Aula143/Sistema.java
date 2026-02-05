class InformaRegras{
    @Deprecated
    public void mostraRegras(){
        System.out.println("Regra do sistema");
    }

    public void mostraNovasRegras(){
        System.out.println("Novas regras do sistema");
    }
}

public class Sistema{
    public static void main(String[] args) {
        InformaRegras regras = new InformaRegras();
        
        //Uso do método obsoleto (deprecated)
        regras.mostraRegras();

        //Uso do novo método
        regras.mostraNovasRegras();
    }
}

// -Xlint:deprecation para detales sobre os métodos obsoletos
//javac -Xlint:deprecation Sistema.java

//@SuppressWarnings("deprecation") para suprimir avisos de métodos obsoletos