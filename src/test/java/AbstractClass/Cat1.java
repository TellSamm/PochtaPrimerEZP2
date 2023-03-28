package AbstractClass;

public class Cat1 extends Animal1{

    @Override
    public void say() {
        System.out.println("Mew mew mew!"); // переопределили абстрактный метод из абстрактного класса теперь мяукаем!
    }

    @Override
    public void eat() {
        System.out.println("I like Milk!");// переопределили абстрактный метод из абстрактного класса теперь кушаем молоко!
    }


}
