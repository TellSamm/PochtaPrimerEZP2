package Uzichaem_Java;

public class Car { // Данный класс хранит в себе переменные и методы (addWeight, drive) с коротыми мы можем работать

    static int var = 10; // создали static переменную

    static void method(){
        System.out.println("This is Static method!"); // создали static метод
    }

    public Car(){
        System.out.println("Новая машина создана!");
        // Новый конструктор
    }
    public Car(String color){ // Новый конструктор созданный с новым параметром (перегрузка методов)

        this.color = color;
    }

    public Car(String color, int height, int width, int length ){ // Новый конструктор созданный с новым параметром (перегрузка методов)
        this.color = color;
        this.height = height;
        this.width = width;
        this.length = length;
    }



    int height;
    int width;
    int length;
    int weight = 2000; // эти значения будут сразу же у нашего созданного нового объекта
    int maxWeight = 2700; // эти значения будут сразу же у нашего созданного нового объекта
    String color;
    int speed;
    int maxSpeed = 260; // эти значения будут сразу же у нашего созданного нового объекта



    public void addWeight(int weight) { // c помощью метода прибавляем новую массу для машины!
        this.weight += weight;
        System.out.println("Новая масса " + this.weight);// синтаксис такой же как и this.weight = this.weight + weight для понимания
    }   // тут вопрос по this

    public void drive(int speed) {
        if (weight <= maxWeight) { //тут вопрос(почему не указываем this потому что названия не одинаковые у переменных)
            this.speed = speed;
            System.out.println("Мы поехали на машине! ");
        } else {
            System.out.println("Машина не может ехать максимальная масса превышена!");
        }



    }
}
