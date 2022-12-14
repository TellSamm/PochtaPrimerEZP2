package MoiKod;

public class Praktikum_9 {
    //Напиши программу, которая составит расписание работы врача поликлиники на 30 дней. По нечётным дням врач принимает 5 человек по записи.
    // По чётным дням — 7 человек по «живой» очереди. Используй циклы и условные операторы.
    //Чтобы узнать, чётный ли день, нужно проверить остаток от его деления на 2. Если число чётное, остаток равен нулю.
    //Определить остаток можно с помощью символа %. Например, остаток выражения 5 % 3 равен двум, а у 4 % 2 — ноль.
    // Для проверки, равен ли остаток нулю, используй оператор ==.

    public static void main(String[] args) {

        int days = 30; // Количество дней
        int queueNumber = 7; // Количество пациентов по очереди
        int appointmentNumber = 5; // Количество пациентов по записи

        for (int smena_dney = 1; smena_dney <= days; smena_dney++) { //внешний цикл для смены дней
            System.out.println("День " + smena_dney);
            // В месяц должно пройти 30 дней
            // Расписание каждого дня зависит от условия: проверь, чётный ли день
            // Если да, то принять пациентов из очереди
            if (smena_dney % 2 == 0) {// !!!условный оператор if!!!
                for (int po_ocheredi = 1; po_ocheredi <= queueNumber; po_ocheredi++) { // !!!ЦИКЛ FOR!!!
                    System.out.println("  Пациент по очереди: " + po_ocheredi);
                }
            } else { // Иначе принимаем пациентов по записи // else идёт когда закрывается скобка после конструкции if
                for (int po_zapisi = 1; po_zapisi <= appointmentNumber; po_zapisi++) {
                    System.out.println("  Пациент по записи: " + po_zapisi);
                }
            }
            System.out.println("На сегодня всех вылечили");
        }//цикл прошёл все условия выполнились в течении 30 дней ктото пошел по записи а ктото без в зависимости
        // от четных и нечетных дней

        System.out.println("Какой насыщенный выдался месяц!");
    }
}





