package Uzichaem_Java;

public class DogTestDrive {

    public static void main(String[] args) {
        Dog one = new Dog();
        one.size = 70;
        one.name = "Волчара!";
        Dog two = new Dog();
        two.size = 8;
        two.name = "Жучара!";
        Dog three = new Dog();
        three.size = 35;
        three.name = "Булка!";

        one.dark();
        two.dark();
        three.dark();
    }
}
