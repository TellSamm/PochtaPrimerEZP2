package Interface;

public class Plane implements Transport {// Класс самолёт
    @Override
    public void go() {
        System.out.println("I'm flying!"); // я лечу
    }

    @Override
    public void stop() {
        System.out.println("I'm going to land"); // я иду на посадку
    }

    public void setSpeed(int speed){ // ну и добавили свой новый метод для класса Самолёт (Plane)
        System.out.println("Our speed is: " + speed);
    }
}
