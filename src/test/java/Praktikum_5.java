public class Praktikum_5 {
        public static void main(String[] args) {

            int days = 10; // Число дней с приёмом витаминов // в 1 день будет выпито 5 витаминок
            int vitamin = 5; // Число витаминок в день

            for (int i = 1; i <= days; i++) { // Внешний цикл для смены дней // меняются дни
                System.out.println("День " + i);
                for (int j = 1; j <= vitamin; j = j + 1) { // Вложенный цикл для приёма витаминов с новой переменной//
                    System.out.println("Витаминка " + j);
                }
            }
        }
    }

