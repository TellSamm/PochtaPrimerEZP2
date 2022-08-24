package MoiKod;

import java.util.Random;

public class Praktikum_16 {
    /*Заполни массив выпитой воды за неделю — waterConsumption. Примени цикл for. Потребление за день определяется случайно — через генератор случайных чисел Random с ограничением в 2000.
Напечатай значения элементов массива с помощью цикла.*/
    public static void main(String[] args) {
        // Объяви пустой массив потребления воды за неделю (7 дней)
        int[] waterConsumption = new int [7];

        Random random = new Random(); // Генерирует случайное число

        // Допиши условие цикла, чтобы заполнить массив случайными значениями
        for (int i = 0; i < waterConsumption.length ; i++) {
            /* максимальное число, которое может вернуть nextInt(n) - n-1,
            поэтому мы передаём в метод число 2001 (2000 + 1), чтобы максимальным числом
            было 2000 (2001 - 1) */
            waterConsumption[i] = random.nextInt(2001);
        }

        System.out.println("Потребление воды за неделю:");
        for (int i = 0; i < waterConsumption.length ; i++){
            System.out.println("День " + (i + 1) + ". Выпито воды: " + waterConsumption[i] + " мл");
        }
    }
}
