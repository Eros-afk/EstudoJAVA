class MinhaClasse{
    public void calcularSoma(int i, int j){
        int soma = i + j;
        System.out.println("A soma é: " + soma);
    }

    @Deprecated
    public void calcularProduto(int i, int j){
        int produto = i * j;
        System.out.println("O produto é: " + produto);
    }
}

public class Principal {
    public static void main(String[] args) {
        MinhaClasse minhaClasse = new MinhaClasse();
        minhaClasse.calcularSoma(5, 10);
        minhaClasse.calcularProduto(5, 10);
    }
}