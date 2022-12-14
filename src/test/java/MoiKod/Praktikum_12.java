package MoiKod;

import java.util.Random;

public class Praktikum_12 {
    /*Пользователь задаёт переменной numberToGenerate значение — целое число до 100. Программа должна его отгадать.
    Она делает это путём перебора случайных целых чисел.
    Если программа выдала случайное число, а оно не совпадает с загаданным, попытки будут повторяться в бесконечном цикле.
    Счётчик попыток увеличится.
    Если число подходящее, программа выводит количество попыток и завершает цикл с помощью break.
    В этом тренажёре нет правильного ответа. Просто позапускай код и посмотри, как работает бесконечный цикл с прерыванием break.*/

    public static void main(String[] args) {

        int numberToGenerate = 1; // переменная для ввода числа
        int tryCount = 0; // переменная для подсчета количества попыток
        Random random = new Random();

        while (true) {
            if (numberToGenerate == random.nextInt(1000)) {
                System.out.println("Потребовалось попыток: " + tryCount);
                break;
            } else {
                tryCount++;
            }
        }
    }
}
