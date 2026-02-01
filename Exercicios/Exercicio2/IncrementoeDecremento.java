public class IncrementoeDecremento{
    public static void main(String[] args) {
        int contador = 5;
        System.out.println("Valor inicial: " + contador);
        System.out.println("Pré-incremento: " + ++contador);
        System.out.println("Pós-incremento " + contador++); //vira 7
        System.out.println("Pré-decremento: " + --contador); //volta 6
        System.out.println("Pós-decremento: " + contador--); //volta 5
        System.out.println("Valor final: " + contador);
    }
}