class Calculadora{
    final public int somar(int a, int b){
        return a + b;
    }
}

class CalculadoraCientifica extends Calculadora{
    // Tentativa de sobrescrever o método final causará um erro de compilação
    /*
    public int somar(int a, int b){
        return a + b + 10; // Erro de compilação
    }
    */

    public int multiplicar(int a, int b){
        return a * b;
    }
}

public class Calculo{
    public static void main(String[] args) {
        CalculadoraCientifica calcCientifica = new CalculadoraCientifica();
        int resultadoSoma = calcCientifica.somar(5, 10);
        int resultadoMultiplicacao = calcCientifica.multiplicar(5, 10);
        System.out.println("Resultado da Soma: " + resultadoSoma);
        System.out.println("Resultado da Multiplicação: " + resultadoMultiplicacao);
    }
}