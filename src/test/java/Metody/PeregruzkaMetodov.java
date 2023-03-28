package Metody;

public class PeregruzkaMetodov {

    public static void main(String[] args) {


    getSum(2, 3, 4);// можно передать хоть 2 хоть 3 параметра! метод отработает в любом случае.

        sayHello("Sam", "lui");


        int [] array = {1, 22, 33, 44, 55};

        getSum(array, "Sam");
    }

    static int getSum(int x, int y){
        int sum;
        sum = x + y;
        return sum;
    }

    static int getSum(int [] array, String name){
        int sum = 0;
       for (int i = 0; i < array.length; i ++){
           sum += array[i];
       }
        System.out.println("Hi " + name);
        System.out.println("Summ is " + sum);
       return sum;
    }

    // создали такой же метод только с новой переменной теперь можно 3 числа складывать (этот метод перегружен)
    static int getSum(int x, int y, int z){
        int sum;
        sum = x + y + z;
        return sum;
    }

    static void sayHello (String name){
        System.out.println("Hello- " + name);
    }

    //так же перегрузили метод и теперь можем здороваться с 2-мя людьми
    static void sayHello (String name1, String name2){
        System.out.println("Hello- " + name1);
        System.out.println("Hello- " + name2);
    }

}
