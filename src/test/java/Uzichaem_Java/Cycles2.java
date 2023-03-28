package Uzichaem_Java;

public class Cycles2 {
    public static void main(String[] args) {

        int [] array = new int[10];

        for(int i = 0; i < 10; i ++){
            array[i] = i;
        }

        for (int i = 0; i < 10; i ++){
            System.out.println("Element with index " + i + " is:" + array[i]);
        }

        int i = 0;

        while (i < 10){
            System.out.println("While: " + i);
            i++;
        }


    }
}
