package Uzichaem_Java;

public class Massivy {
    public static void main(String[] args) {
        String [] names;
        names = new String[3];

        String[] name = new String[3]; //создание массива более укороченная версия
        int [] array = new int[10];

        name [0] = "Vasya";
        name [1] = "Petya";
        name [2] = "Vanya";

        array [3]= 15;
        array [4] = 20;

        System.out.println(name[1]);
        System.out.println(name[2]);

        int [] massivishe = {15,10,100,223,414,515,166,152,124};

        System.out.println(massivishe[0]);
        System.out.println(massivishe[2]);
        System.out.println(massivishe[4]);

        for(int i = 0; i < 9; i ++){
            System.out.println(massivishe[i]);
        }

        int [] arr2 = new int [15];

        for (int j = 0; j < 15; j++){
            arr2 [j] = j * 10;
            System.out.println(arr2[j]);
        }
    }
}
