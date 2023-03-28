package Uzichaem_Java;

public class CarMainTest {
    public static void main(String[] args) {

        Car car1 = new Car(); // создадим объект класса Car

        car1.color = "black";
        car1.length = 5000;
        car1.height = 2000;
        car1.width = 2000;

        car1.addWeight(50);
        car1.drive(120);



        car1.addWeight(700);
        car1.drive(100);

        Car toyota = new Car("Black");// Через конструктор присвоили toyota цвет
        System.out.println("Цвет машины " + toyota.color);// Выводим цвет машины

        Car bmw = new Car("Black",2100,2000,5100);// Через конструктор присвоили bmw атрибуты
        System.out.println(bmw.color + " " + bmw.height + " " + bmw.width + " " + bmw.length);


        System.out.println(Car.var); // обратились к static переменной через имя класса не создавая объект класса Car
        Car.method();

        Car.var = 100;
        System.out.println("Значение var для объекта класса car1 " + car1.var);
        System.out.println("Значение var для объекта класса toyota " + toyota.var);


    }
}
