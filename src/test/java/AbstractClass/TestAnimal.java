package AbstractClass;

public class TestAnimal  {

    public static void main(String[] args) {

        Cat1 Murza = new Cat1(); // объект "экземпляр" класса Cat1;
        Dog1 Reks = new Dog1(); // объект "экземпляр" класса Dog1;

        Reks.walk("Elmenya 38");

        Murza.eat();// вызвали переопределенный в классе Cat1 абстрактный метод из класса Animal;
        Reks.eat(); // вызвали переопределенный в классе Dog1 абстрактный метод из класса Animal;


    }


}
