package Nasledovaniye;

public class Cat extends Animal{

    public void feed (String feed){ // для кошки добавили свой дополнительный метод (кушать)
        System.out.println("I like " + feed);
    }

    @Override
    public void sound(){ // переопределили метод аннотацией @Override т.к. кошка мяукает
        System.out.println("mew mew mew!");
    }
}
