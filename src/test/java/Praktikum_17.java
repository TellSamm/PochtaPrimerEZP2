import java.util.Random;

public class Praktikum_17 {
        public static void main(String[] args) {
            String[] appliances = {"Стиральная машина", "Сушильная машина", "Холодильник", "Утюг", "Посудомоечная машина", "Микроволновая печь", "Варочная поверхность", "Духовой шкаф", "Блендер", "Миксер"}; // объяви массив наименований бытовой техники

            int[] amount = new int[10]; // объяви пустой массив количества бытовой техники

            Random random = new Random(); // генерирует случайное число

            for (int i = 0; i < amount.length; i++) { // допиши условие цикла for, чтобы заполнить массив случайными значениями
                amount[i] = random.nextInt(11);
            }
            for (int i = 1; i < appliances.length; i++) {

                System.out.println("Наименование: " + appliances[i] + ". Количество: " + amount[i]);
            }
        }
    }
