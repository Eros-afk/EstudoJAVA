public class ExemploObjetosNulos{

    String teste; //Inicialização automática //teste será null;
    int testePrimitiva; //inicialização automática Neste caso testPrimitiva será 0

    public static void main(String[] args) {
        String nome = new String("Arnaldo");
        //String nome (erro) == Variáveis locais devem ser inicializadas (obrigatório)
        int varLocal = 10;

        System.out.println("VARLOCAL: " + varLocal);

        try {
            int tamanhoNome = nome.length(); // Tentando acessar objeto nulo
            System.out.println("Tamanho do nome: " + tamanhoNome);
        } catch (NullPointerException e) {
            System.out.println("Erro: A variável 'nome' está nula!");
        } finally{
            System.out.println("Sempre execute o bloco finally");
        }
    }
}