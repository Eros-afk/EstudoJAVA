abstract class Operacao{
    abstract void Calcular();
}

class Soma extends Operacao{
    private double a, b;

    public Soma(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    void Calcular() {
        System.out.println("Resultado da soma: " + (a + b));
    }
}

class Subtracao extends Operacao{
    private double a, b;

    public Subtracao(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    void Calcular() {
        System.out.println("Resultado da subtração: " + (a - b));
    }
}

class Multiplicacao extends Operacao{
    private double a, b;

    public Multiplicacao(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    void Calcular() {
        System.out.println("Resultado da multiplicação: " + (a * b));
    }
}

class Divisao extends Operacao{
    private double a, b;

    public Divisao(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    void Calcular() {
        if(b != 0){
            System.out.println("Resultado da divisão: " + (a / b));
        } else {
            System.out.println("Erro: Divisão por zero.");
        }
    }
}

public class Calculadora{
    public static void main(String[] args) {
        Operacao soma = new Soma(10, 5);
        soma.Calcular();

        Operacao subtracao = new Subtracao(10, 5);
        subtracao.Calcular();

        Operacao multiplicacao = new Multiplicacao(10, 5);
        multiplicacao.Calcular();

        Operacao divisao = new Divisao(10, 5);
        divisao.Calcular();

        Operacao divisaoPorZero = new Divisao(10, 0);
        divisaoPorZero.Calcular();
    }
}