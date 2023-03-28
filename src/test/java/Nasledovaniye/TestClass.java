package Nasledovaniye;



 public class TestClass { // тут мы создадим объекты таких классов как Cat и Dog которые имеют свои методы и атрибуты но так же
    // у них есть общий родитель от которого они наследуются это Animal

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        cat1.name = "murzik";
        cat1.color = "white";
        cat1.walk("Park");
        cat1.feed("moloko");
        System.out.println("Cat name is " + cat1.name);


        dog1.name = "Reks";
        dog1.color = "black";
        dog1.walk("Polyana");
        dog1.sit();
        System.out.println("Dog name is " + dog1.name);

        System.out.println("Вес собаки до изменения через Set-ер: " + dog1.getWeight());
        dog1.setWeight(20);
        System.out.println("Вес собаки после через Set-ер: " + dog1.getWeight());

        cat1.sound();//переопределили метод
        dog1.sound();//оставили как и в классе Animal т.к. собака лает

    }
}