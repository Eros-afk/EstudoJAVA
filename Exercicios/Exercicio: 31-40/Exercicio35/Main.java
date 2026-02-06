abstract class FiguraGeometrica{
    void calcularArea(double base, double altura){
        System.out.println("Área do retângulo: " + (base * altura));
    }
    void calcularPerimetro(double base, double altura){
        System.out.println("Perímetro do retângulo: " + (2 * (base + altura)));
    }
}

class Retangulo extends FiguraGeometrica{
    double base, altura;

    @Override
    void calcularArea(double base, double altura) {
        super.calcularArea(base, altura);
    }
    
    @Override
    void calcularPerimetro(double base, double altura){
        super.calcularPerimetro(base, altura);
    }
}

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.calcularArea(5, 10);
        retangulo.calcularPerimetro(5, 10);
    }
}
