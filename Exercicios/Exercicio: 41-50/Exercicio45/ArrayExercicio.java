
public class ArrayExercicio{
    static int[] meuArray = {10, 20, 30, 40, 50};

public static int acessarElemento(int[] array, int indice){
    try {
        return array[indice];
    } catch (ArrayIndexOutOfBoundsException e) {
        System.err.println("Erro: Indice fora dos limites do array.");
        return -1;
    }
}
public static void main(String[] args) {
    System.out.println("Elemento no indice 2: " + acessarElemento(meuArray, 2));
    System.out.println("Elemento no indice 10: " + acessarElemento(meuArray, 10));        
    }
}