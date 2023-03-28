package Uzichaem_Java;

public class Isklycheniya {

    public static void main(String[] args) {

        //deleniye(100, 2);
        deleniye(0,3,2);
    }

    public static void deleniye(int a, int b) {
        try {
            System.out.println("Result deleniya " + a / b);
        } catch (ArithmeticException err) {
            System.out.println("У нас проблемы Джо ничего не считается!");
        } finally { // этот блок не является обязательным
            System.out.println("Finish");
        }


    }

    public static void deleniye(int a, int b, int c) {
        if (a == 0){
            throw new ArithmeticException("Делить на ноль нельзя! a");
        } else if (b == 0){
            throw new ArithmeticException("Делить на ноль нельзя! b");
        } else if (c==0){
            throw new ArithmeticException("Делить на ноль нельзя! c");
        } else{
            System.out.println("Результат деления: " + a / b / c);
        }

    }
}