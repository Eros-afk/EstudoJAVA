
public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        System.out.println(a + b); // Saída: 12
        System.out.println(a - b); // Saída: 8
        System.out.println(a * b); // Saída: 20
        System.out.println(a / b); // Saída: 5
        System.out.println(a % b); // Saída: 0

        System.out.println(a == b); // Saída: false
        System.out.println(a != b); // Saída: true
        System.out.println(a > b); // Saída: true
        System.out.println(a < b); // Saída: false
        System.out.println(a >= b); // Saída: true
        System.out.println(a <= b); // Saída: false

        boolean c = true;
        System.out.println(a < b && c); // Saída: false
        System.out.println(a > b || c); // Saída: true
        System.out.println(!c); // Saída: false

        /* 
        Atribuição (=)
        Atribuição de adição (+=)
        Atribuição de subtração (-=)
        Atribuição de multiplicação (*=)
        Atribuição de divisão (/=)
        Atribuição de módulo (%=)
         */

         /*
         int a = 5;
        // Pré-incremento int b = ++a; // Agora, a é 6 e b também é 6
        // Pós-incremento int c = a++; // Agora, a é 7, mas c é 6 (porque o
        valor antigo de a foi usado)
        // Pré-decremento int d = --a; // Agora, a é 6 e d também é 6
        // Pós-decremento int e = a--; // Agora, a é 5, mas e é 6 (porque o
        valor antigo de a foi usado)
         */
    }
}
