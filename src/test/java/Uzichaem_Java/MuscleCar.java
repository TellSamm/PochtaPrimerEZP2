package Uzichaem_Java;

import org.openqa.selenium.json.JsonOutput;

public class MuscleCar {

    int ves;
    int skorost;
    String color;

    int TolshynaVrony;
    public MuscleCar(int ves, int skorost, String color){ // Можем создать объект класса MuscleCar с параметрами
        this.ves = ves;
        this.skorost = skorost;
        this.color = color;
        System.out.println("New MuscleCar created!");
        System.out.println("Цвет этого монстра: " + color);
        System.out.println("Максимальная скорость этой тачки: " + skorost);

    }

    public MuscleCar(){ //Можем создать объект класса MuscleCar без параметров

    }

    public int gaz (int skorost){
        this.skorost = skorost;
        System.out.println("Нажимая на газ мы ускоряемся и наша скорость увеличивется в 2 раза!");
        System.out.println("Наша скорость равна: " + skorost * 2);
        return skorost;
    }

    public void bronya (int  TolshynaVrony){
        this.TolshynaVrony = TolshynaVrony;
        if(TolshynaVrony >= 120){
            System.out.println("Да это мать его бронеавтомонстр!");
        } else if (TolshynaVrony == 100){
            System.out.println("Для сельской местности пойдет!");
        } else {
            System.out.println("Это просто приора!");
        }
    }
}

