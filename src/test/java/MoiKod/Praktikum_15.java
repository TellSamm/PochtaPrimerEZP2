package MoiKod;

public class Praktikum_15 {
    /*Перед тобой массив, с данными о том, сколько воды выпил один человек за неделю — в мл. Каждый элемент — это выпитая вода за один день. Что нужно сделать:
Исправь количество выпитой воды за пятницу: туда забыли дописать стакан воды в 200 мл. Прибавь этот объём к текущему значению.
Высчитай среднее потребление воды в день. Сложи все значения и подели на количество дней. Результат сохрани в переменную avgConsumption (англ. — average consumption, «среднее потребление»).*/
    public static void main(String[] args) {
        int[] waterConsumption = {1500, 1800, 2000, 1600, 1500, 1500, 1800};

        // Добавь 200 мл к потреблению за пятницу
        waterConsumption[4] = 1700;
        System.out.println("Новое значение выпитой воды за пятницу: " + waterConsumption[4] + " мл");

        // Высчитай среднее потребление воды за неделю
        int avgConsumption = (waterConsumption[0] + waterConsumption[1]+ waterConsumption[2]+ waterConsumption[3]+ waterConsumption[4]+ waterConsumption[5] + waterConsumption[6])/7;
        System.out.println("В среднем вы выпивали: " + avgConsumption + " мл в день");
    }
}
