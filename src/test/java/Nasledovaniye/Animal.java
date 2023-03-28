package Nasledovaniye;

public class Animal {
    String name;
    String color;

    public int var;
    public void walk(String place) { // ходить (перевод)
        System.out.println("We are walking here: " + place);
    }

    public void sleep() {
        System.out.println("Zzzz");
    }

    public void sound(){ // метод издавать звук по умолчанию gav gav gav!
        System.out.println("Gav gav gav!");
    }


}
