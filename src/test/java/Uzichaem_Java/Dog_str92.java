package Uzichaem_Java;

public class Dog_str92 {
     static String name;

    public static void main(String[] args) {
        // Создаем объект Dog и получаем к нему доступ

        Dog_str92 dog1 = new Dog_str92();
        Dog_str92.bark();
        dog1.name = "Барт!";

        //Теперь создадим массив типа Dog
        Dog_str92[] myDogs = new Dog_str92[3];
        // И поместим в него несколько элекментов
        myDogs[0] = new Dog_str92();
        myDogs[1] = new Dog_str92();
        myDogs[2] = dog1;

        //Теперь получаем доступ к объектам типа Dog
        //с помощью ссылок из массива
        myDogs[0].name = "Луи";
        myDogs[1].name = "Джордж";

        // хмм.... какое имя у myDogs[2]??
        System.out.print("Имя последней собаки - ");
        System.out.println(myDogs[2].name);

        //теперь переберем все элекменты массива
        //и вызовем для каждого метод dark()
        int x = 0;
        while (x < myDogs.length){
            myDogs[x].bark();
            x = x + 1;
        }
    }

    public static void bark(){
        System.out.println(name + " сказал Гав!");
    }
}
