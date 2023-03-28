package Uzichaem_Java;

import java.util.Arrays;

public class MetodyPeregryzka {
    public static void main(String[] args) {
        int result = getSum(1, 10);
        System.out.println(result);
        result = getSum(5, 5, 5);
        System.out.println(result);


        sayHello("Petro");
        sayHello("Ivan", "petrio");

        int [] array = {1,2,44,556,67,45,34,252,623};

        int sum2 = getSum(array,"Shmidt");
    }

    //метод принимает 2 параметра
    static int getSum(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }

    // метод принимает 3 параметра
    static int getSum(int x, int y, int z) {
        int sum;
        sum = x + y + z;
        return sum;
    }

    // мето принимает в себя массив и считает сумму всех элементов в массиве
    static int getSum(int[] array, String name) {
//        int [] array = {1,2,44,556,67,45,34,252,623};
        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum = sum + array[i];
//        }
        int iter = 0;
        for (int r: array) {
            sum = sum + r + iter++;
        }

        for (int i = 0; i <array.length; i++){
            int r = array[i];
            sum = sum + r;
        }
        System.out.println(" Hi " + name + "!");
        System.out.println("Your sum is " + sum);
        return sum;
    }



    // метод принимает 1 пареметр
    static void sayHello(String name1) {
        System.out.println("Hello " + name1 + "!");

    }

    // метод принимает 2 параметра
    static void sayHello(String name1, String name2) {
        System.out.println("Hello " + name1 + "!");
        System.out.println("Hello " + name2 + "!");

    }
}
