public class ContBreak {
    public static void main(String[] args) {
        int codigoDeSaida = 9;
        int codigoCarterinha;

        for (codigoCarterinha = 1; codigoCarterinha <= 10; codigoCarterinha++) {
            if (codigoCarterinha == codigoDeSaida) {
                break;
            }
            //System.out.println("Carterinha numero: " + codigoCarterinha);

            if (codigoCarterinha == 3 || codigoCarterinha == 7 || codigoCarterinha == 10) {
                System.out.println("O código " + codigoCarterinha + " é um código aceito pelo Hospital Santa Clara.");
            } else {
                System.out.println("O código " + codigoCarterinha + " não é um código aceito pelo Hospital Santa Clara.");
            }
        }
    }
}
