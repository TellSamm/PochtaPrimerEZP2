package Uzichaem_Java;

public class Metody {
    public static void main(String[] args) {
        int a = 12;
        int c = 11;

        int sum;
        sum = getSum(a, c);
        System.out.println(sum);//можно вызвать таким образом метод
        System.out.println(getSum(2,4));// тут более сокращенно

        showSum(10,51,55);

        tellMe();

        sayHello("Ivan");

        showSumToPerson("Joni",4,4,5);
    }
    static int getSum (int x , int y){
        int sum;
        sum = x + y;
        return sum;
    }

    static void showSum(int z, int y, int x){
        int sum = z + y + x;
        System.out.println("Sun is " + sum);
    } //это метод (показать сумму) который не возвращает значение какого либо типа


    //метод который нам ничего не возращает и даже не принимает переменную!
    static void tellMe(){
        System.out.println("Hello");
        System.out.println("Joni");
        System.out.println("You");
    }

    //метод который нам ничего не возвращает а просто принимает одну переменную!
    static void sayHello(String name){
        System.out.println("Hello " + name + "!");
    }

    //Вызов методов внутри метода!
    static void showSumToPerson(String name, int a, int b, int c ){
        System.out.println("Start to Program!");
        sayHello(name);
        showSum(a,b,c);
        System.out.println("End to program!");
    }
}
