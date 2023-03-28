package ClassAndObject;

public class Car {


    static int var = 10;
    static void method(){
        System.out.println("Static method!");
    }

    public Car(){ // конструктор с выводом на экран "New car created!"
        System.out.println("New car created!");
    }

    public Car test (String value){ // просто пример конструктора
        System.out.println("Test test" + value);
        return this;
    }

    public Car (String color){ // переменная color примет значение color в контрукторе сразу this.
        this.color = color;
    }



    public Car (String color,int heigh, int weight, int lenght){// опять перегрузили метод уже с новыми параметрами создали конструктор
        this.color = color;
        this.heigh = heigh;
        this.weight = weight;
        this.lenght = lenght;
    }




    int heigh;
    int width;
    int lenght;
    int weight = 2000;
    int maxWeight = 2700;
    String color;
    int speed;
    int maxSpeed = 260;

    public void addWeight (int weight){
        this.weight += weight;
        System.out.println("New weight " + this.weight);

    }

    public void drive(int speed){
        if (weight <= maxWeight) {
            this.speed = speed;
            System.out.println("Мы начали движение!");
        } else {
            System.out.println("Cannot drive! Максимальная масса автомобиля превыешена движение невозможно!");
        }
    }


}
