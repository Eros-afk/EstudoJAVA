
import java.util.HashSet;
import java.util.Set;

public class SetExercise{
    public static void main(String[] args) {
        Set<Integer> conjunto = new HashSet<>();

        conjunto.add(1);
        conjunto.add(2);
        conjunto.add(3);

        System.out.println(conjunto);

        System.out.println("Contem '2'? " + conjunto.contains(2));

        conjunto.remove(1);

        System.out.println("Conjunto: " + conjunto);
    }
}