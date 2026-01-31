class SalaDeAula{
    static int numAlunos = 0;

    public static void contagemAlunos(int numAlunos){
        SalaDeAula.numAlunos += numAlunos;
    }

    public static void mostrarNumAlunos(int numAlunos){
        System.out.println("Número total de alunos na sala de aula: " + numAlunos);
    }
}