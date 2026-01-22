public class Loops{
    public static void main(String[] args){
        
        // Loop for
        System.out.println("Loop for:");
        for(int i = 0; i <= 5; i++){
            System.out.println(i);
        }

        // Loop while
        System.out.println("\nLoop while:");
        int j = 1;
        while(j <= 5){
            System.out.println(j);
            j++;
        }

        // Loop do-while
        System.out.println("\nLoop do-while:");
        int k = 1;
        do{
            System.out.println(k);
            k++;
        } while(k <= 5);
    }
}