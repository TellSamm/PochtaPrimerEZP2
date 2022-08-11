public class Praktikum_2 {
    public static void main(String[] args) {
        int chapterCount = 0; // Объявляем переменную для общего числа глав
        int chapterPerDay = 3; // В этой переменной фиксируем ежедневный объем чтения, он будет неизменным


        for(int day = 1; day <= 7; day = day + 1) { // Переменная итерирования — day. Число итераций совпадает с количеством дней в неделе
            chapterCount = chapterCount + chapterPerDay; // При каждой итерации плюс 3 глав
            System.out.println(day + "-й день прошёл, студент Анатолий прочитал " + chapterCount + " глав."); // Сколько глав прочитывает Анатолий за разное количество дней
        }
        System.out.println("Количество глав за неделю: " + chapterCount + " глава."); // Сколько глав всего будет прочитано за неделю
    }
}
