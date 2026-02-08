public class ExemploNullPointerExceptionInteger{
    public static void main(String[] args) {
        Integer numero = null;
        //System.out.println(numero.toString());
        try {
            numero.toString();
        } catch (NullPointerException e) {
            System.err.println("Ocorreu um: " + e.getMessage());
        }
    }
}