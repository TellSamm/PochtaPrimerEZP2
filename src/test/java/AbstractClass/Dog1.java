package AbstractClass;

public class Dog1 extends Animal1{

    @Override
    public void say() {
        System.out.println("Gav gav!"); // переопределили абстрактный метод из абстрактного класса теперь мяукаем!
    }

    @Override
    public void eat() {
        System.out.println("I like kostochka!"); // переопределили абстрактный метод из абстрактного класса теперь кушаем молоко!
    }

    public void sit (){
        System.out.println("im siting!"); // в класс Dog добавили класс сидеть
    }
}
