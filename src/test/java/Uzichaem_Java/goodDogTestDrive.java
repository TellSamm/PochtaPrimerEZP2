package Uzichaem_Java;

public class goodDogTestDrive {
    public static void main(String[] args) {
        goodDog one = new goodDog();
        one.setSize(70);
        goodDog two = new goodDog();
        two.setSize(8);
        one.getSize();
        System.out.println("Первая собака - " + one.getSize());
        System.out.println("Вторая собака - " + two.getSize());
        one.bark();
        two.bark();
    }
}
