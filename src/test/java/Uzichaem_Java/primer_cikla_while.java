package Uzichaem_Java;

public class primer_cikla_while {
    public static void main(String[] args) {
        int x = 1;
        System.out.println("Перед началом цикла!");
        while (x < 4) {
            System.out.println("Внутри цикла");
            System.out.println("Значение x равно " + x);
            x = x + 1;
        } //закрываем цикл while (пока)
        System.out.println("После окончания цикла X равно  = " + x);
    }// закрываем главный метод main
}// закрываем class primer_cikla_while
