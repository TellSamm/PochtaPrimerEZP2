public class Praktikum_14 {
    /*Необходимо вывести на экран таблицу умножения на 3:
            3*1=3
            3*2=6
            3*3=9
            3*4=12
            3*5=15 и так далее*/


    public static void main(String[] args) {
        for (int i=1; i<=10; i++) {
            System.out.println ("3*" + i + "=" + 3*i);
            //Как видно, есть:
            /*текстовая часть: “3*”  и  “=”
            алгоритмическая часть: будет подставлять значения за счет цикла for – это все остальные значения.
            Поэтому в System.out.println() всю текстовую часть заключаем в кавычки. И получаем: System.out.println ("3*"+ i + "=" + 3*i);*/
        }
    }
}
