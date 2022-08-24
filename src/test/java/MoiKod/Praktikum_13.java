package MoiKod;

import java.util.Random;

public class Praktikum_13 {
    public static void main(String[] args) {
        Random random = new Random(); // Генерирует случайное число
        int secretCode;
        int cookInput;

        // Добавь цикл - чеки печатаются бесконечно
        while (true){
            secretCode = random.nextInt(50); // Здесь задаётся код - случайное число от 0 до 50
            System.out.println("Печатаю новый чек!");
            cookInput = random.nextInt(50); // Повар пытается угадать код


        if (secretCode == cookInput) { // Если повар угадал код, цикл должен завершиться
            System.out.println("Шеф угадал число! Прекращаю печать!");
            break;
        }
        }
    }
}
