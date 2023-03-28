package Uzichaem_Java;

public class lesson_str46 {
    public static void main(String[] args) {
        String [] wordListOne = {"первый", "второй", "третий", "четвертый", "десятый", "пятнадцатый", "луи-бронкский"};
        String [] wordListTwo = {"противник", "забота", "капитал", "рассказ", "определение",
                "степень", "камера", "шахимат", "здравствуй мир"};
        String [] wordListThree = {"субъект", "премия", "цветок", "продукция", "вещество", "очередь", "концерт","чтототам"};


        // Вычисляем, сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // Генерируем три случайных числа
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        // Теперь строим фразу
        String fraza = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        // Выводим фразу на экран
        System.out.println("Всё, что нам нужно, - это " + fraza);

    } // закрываем метод main


}// закрываем класс lesson_str46
