package Uzichaem_Java;

public class TestClassMuscleCar {

    public static void main(String[] args) {

        MuscleCar FordMustang = new MuscleCar(12,60,"Black");
        MuscleCar Shelby = new MuscleCar(11, 120,"White"); // с параметрами из конструктора класса
        MuscleCar Priora = new MuscleCar(); // так же можно создать без параметров из конструктора класса

        Shelby.gaz(124);
        Shelby.bronya(200);
        System.out.println(" ");
        FordMustang.gaz(50);
        FordMustang.bronya(12);

    }
}
