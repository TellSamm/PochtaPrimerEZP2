package TestUyra;

public class Main {
    public static void main(String[] args) {
        Auto bmw = new Car();
        Auto kavasaki8 = new Moto();

        bmw.setName("X6");
        bmw.setSpeed(150);

        Auto superCar = new SuperCar();


        superCar.setSpeed(10);
        System.out.println(superCar.getSpeed());
        System.out.println(bmw.getSpeed());
    }
}
