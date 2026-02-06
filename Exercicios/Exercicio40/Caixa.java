class Caixa<T> {
    private T[] elementos;

    public Caixa(int capacidade){
        elementos = (T[]) new Object[capacidade];
    }

    public void adcionar(T elemento, int indice){
        elementos[indice] = elemento;
    }

    public T obter(int indice){
        return elementos[indice];
    }

    public static void main(String[] args) {
        Caixa<Double> caixaDeNumeros = new Caixa<>(3);
        caixaDeNumeros.adcionar(10.5, 0);
        caixaDeNumeros.adcionar(30.0, 1);
        caixaDeNumeros.adcionar(40.0, 2);
        System.out.println("Valor obtido: " + caixaDeNumeros.obter(0));
        System.out.println("Valor obtido: " + caixaDeNumeros.obter(1));

        Caixa<Character> caixaDePalavras = new Caixa<>(3);
        caixaDePalavras.adcionar('O', 0);
        caixaDePalavras.adcionar('l', 1);
        caixaDePalavras.adcionar('á', 2);

        System.out.println("Letra obtida: " + caixaDePalavras.obter(0));
        System.out.println("Letra obtida: " + caixaDePalavras.obter(1));
        System.out.println("Letra obtida: " + caixaDePalavras.obter(2));
    }
}