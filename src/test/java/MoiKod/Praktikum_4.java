package MoiKod;

public class Praktikum_4 {

    public static void main(String[] args) {
        int days = 30; // Количество дней
        int salesPerDay = 14; // Продаж в день
        int total  = 0; // Переменная, которая хранит общее количество продаж

        for (int i = 1; i <= days; i = i + 1) {// начинается с 1 и до меньше или равно переменной days где хранится кол-во дней!
            total =  total + salesPerDay ; // Каждый день увеличивается на значение salesPerDay
            System.out.println("День " + i + ". Уже продано вентиляторов: " + total);
        }
    }
}
