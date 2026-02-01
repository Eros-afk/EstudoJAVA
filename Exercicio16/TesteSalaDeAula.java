public class TesteSalaDeAula{
    public static void main(String[] args) {
        SalaDeAula sala1 = new SalaDeAula();
        SalaDeAula.contagemAlunos(30);
        SalaDeAula sala2 = new SalaDeAula();
        SalaDeAula.contagemAlunos(20);
        SalaDeAula sala3 = new SalaDeAula();
        SalaDeAula.contagemAlunos(10);
        
        SalaDeAula.mostrarNumAlunos();
    }
}