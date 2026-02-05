class ExemploDepreciado{
    @Deprecated
    public void metodoObsoleto(){
        System.out.println("Este método está obsoleto.");
    }
}

public class Principal{
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        ExemploDepreciado exemplo = new ExemploDepreciado();
        exemplo.metodoObsoleto();
    }
}