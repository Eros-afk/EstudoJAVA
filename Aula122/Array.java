public class Array{
    public static void main(String[] args) {
        int[] meuArray = new int[3];
        meuArray = new int[3];
        meuArray[0] = 10;
        meuArray[1] = 20;
        meuArray[2] = 30;

        meuArray = new int[]{5, 8, 2};

        System.out.println(meuArray[0]);
        System.out.println(meuArray[1]);
        System.out.println(meuArray[2]);

        //Percorrendo o array
        for(int i = 0; i < meuArray.length; i ++){
            System.out.println("Elemento na posição:" + i + " é " + meuArray[i]);
        }
    }
}