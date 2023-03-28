package Metody;

public class MetodyTest {
    public static void main(String[] args) {
        int a = 22;
        int b = 23;

        int sum;

        sum = getSum(a, b);
        System.out.println(sum);
        sum = getSum(100, 160);
        System.out.println(sum);

        showSum(1000, 2233, 33441);
        saySay();
        sayHello("Sam");

        showSumToPerson("Sam", 22,222,2323);
    }

    static int getSum(int x, int y){
      int sum;
      sum = x + y;
      return sum;
    }

    static void showSum (int x, int y, int z){
        int sum = x + y + z;
        System.out.println("Sum is:" + sum);
    }

    static void saySay(){
        System.out.println("Hello!");
        System.out.println("Im running!");
    }

    static void sayHello (String name){
        System.out.println("Hello- " + name);
    }




    // вот тут интересно вызов методов внутри метода!)
    static void showSumToPerson(String name, int y, int b, int c){
        System.out.println("Start program!");
        sayHello(name);
        showSum(y,b,c);
        System.out.println("Stop program!");
    }

}
