package Uzichaem_Java;

public class Сycles {


    public static void main(String[] args) {

        Сycles test1 = new Сycles();
        int[] nums2 = {1, 2, 3, 5, 6, 7, 8};

        test1.summ(nums2);


        int[] massiv = new int[10];

        for (int j = 0; j < 11; j++) {
            massiv[j] = j + 2;
            System.out.println("Element is index " + j + " is: " + massiv[j]);
            System.out.println();
        }


        for (int i = 0; i <= 10; i++) { //умножаем на 2
            System.out.println("Номер № " + i);
        }


//        for (int i = 0; ) {
//
//        }

        // Конструкция switch case
        int chislo = 10 + 5 + 2;

        switch (chislo) {
            case 10:
                System.out.println("Равно: " + chislo);
                break;
            case 5:
                System.out.println("Равно: " + chislo);
                break;
            case 15:
                System.out.println("Мы угадали! Число равно: " + chislo);
            default: // это аналог else
                System.out.println("Никакое из значений не подошло!");
        }

        int month = 3;
        String season;

        switch (month) {
            case 12:
            case 1:
            case 2:
                season = "Зимушка-зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "Весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "Лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "Осень";
                break;
            default:
                season = "Вы с какой планеты?";
        }

    }


    public int summ(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Your sum: " + sum);
        return sum;
    }


}