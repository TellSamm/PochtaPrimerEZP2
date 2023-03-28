package ClassAndObject;

public class TestClass {
    public static void main(String[] args) {

        Car bmw = new Car();
        bmw.color = "Black";
        bmw.lenght = 5000;
        bmw.heigh = 2000;
        bmw.width = 2000;

        bmw.addWeight(800);// новый вес автомобиля
        bmw.drive(120); // новая скорость


        Car Toyota = new Car("Black");
        System.out.println("Cat color is - " + Toyota.color);



        Car Mazda = new Car("Red", 44,444,1240);
        System.out.println(Mazda.color + " " + Mazda.heigh + " " + Mazda.weight + " " + Mazda.lenght);

        System.out.println(Car.var); // получили доступ к статичной переменной без создания объекта класса
        Car.var = 100; // изменили значение переменной прям здесь ( и у всех объектов класса Car данная переменная будет иметь такое значение

        System.out.println(bmw.var);
        System.out.println(Toyota.var);
        System.out.println(Mazda.var);

        Car.method();// вызываем статический метод прямо по имени класса


        // как вообще могут применять static и final?


    }
}
