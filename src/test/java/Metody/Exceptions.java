package Metody;

public class Exceptions {

    public static void main(String[] args) {

    deleniye(11, 2);

    deleniye2(10,0);
    }


     //try cath finally связка
    public static void deleniye (int a, int b){
        try {
            System.out.println("Result is: " + a/b);
        } catch (ArithmeticException e) {
            System.out.println("Problem!");
        } finally {
            System.out.println("Finish!");
        }
    }



    public static void deleniye2 (int a, int b){
      if (b == 0){
          throw new ArithmeticException("Делить на ноль нельзя!");
      }else {
          System.out.println("Result is " + a/b);
      }
    }



}
