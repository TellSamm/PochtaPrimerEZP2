package MoiKod;

import java.util.Random;

public class Praktikum_10 {

        public static void main(String[] args) {
            Random random = new Random(); // Генерирует случайное число

            int monthCount = 0; // Для учёта того, сколько месяцев понадобилось для возврата долга
            int moneyTotal = 0; // Суммарное количество отданных денег
            int rublesAMonth; // Сколько было отдано в этом месяце
            int credit = 500000; // Сколько нужно отдать
            int min = 8000; // Минимальная сумма, которую нужно отдавать
            int max = 10000; // Максимальная сумма, которую можно отдавать

            while (moneyTotal < credit) {
                int diff = max - min; // Разница между тем, что нужно отдать обязательно, и тем, что ты можешь отдать
                rublesAMonth = random.nextInt(diff + 1) + min; // Случайная сумма, которую ты отдашь в этом месяце (минимальное значение + то, что свыше минимального платежа)
                moneyTotal = moneyTotal + rublesAMonth; // Добавили эти деньги к отданным
                monthCount = monthCount + 1; // Засчитали месяц
            }

            System.out.println("Ура! Ты отдал долг в " + credit + " р. за " + monthCount + " месяцев.");
        }
}
