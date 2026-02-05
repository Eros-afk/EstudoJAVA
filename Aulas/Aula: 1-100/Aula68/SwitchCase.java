
public class SwitchCase {

    public static void main(String[] args) {
        int diaDaSemana = 3; // 1 representa segunda, 2 terça, etc.
        switch (diaDaSemana) {
            case 1 -> System.out.println("Seg.");
            case 2 -> System.out.println("Ter.");
            case 3 -> System.out.println("Qua.");
            case 4 -> System.out.println("Qui.");
            case 5 -> System.out.println("Sex.");
            default -> System.out.println("Dia desconhecido");
        }

        String dia = "Ter.";
        String tipoDeDia = switch(dia){
            case "Seg.", "Ter.", "Qua.", "Qui.", "Sex." -> "Dia útil";
            case "Sábado", "Domingo" -> "Fim de semana";
            default -> "Dia desconhecido";
        };
        System.out.println(tipoDeDia);
    }
}
