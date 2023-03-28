package Uzichaem_Java;

public class Dog {
    int size;
    String name;

    void dark() {
        // данный метод
        if (size > 60) {
            System.out.println("Гав Гав!и так лает у нас - " + name);
        } else if (size > 14) {
            System.out.println("Вуф Вуф! и так лает у нас - " + name);
        } else {
            System.out.println("Тяф Тяф!и так лает у нас - " + name);
        }
    }
}
