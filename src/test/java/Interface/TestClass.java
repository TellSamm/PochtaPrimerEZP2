package Interface;

public class TestClass {
    public static void main(String[] args) {

        Car Lexus = new Car();

        Plane IL2 = new Plane();

        Lexus.go();
        Lexus.stop();
        IL2.go();
        IL2.stop();
        IL2.setSpeed(223);
    }
}
