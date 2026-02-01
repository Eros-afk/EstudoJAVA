public class DiasNoMes{
    public static void main(String[] args) {
        String mes = "Abril";
        String dias = switch(mes){
            case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> "31";
            case "Abril", "Junho", "Setembro", "Novembro" -> "30";
            case "Fevereiro" -> "28";
            default -> "mês desconhecido";
        };
        System.out.println("O mês de "+mes+" tem "+dias+" dias.");
    }
}