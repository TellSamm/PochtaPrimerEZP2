package Nasledovaniye;

public class Dog extends Animal {// унаследовались от класса Animal и теперь в нашем классе Dog мы можем не описывать все характеристики
    //что ест в классе Animal но можем добавить что то своё

    private int weight = 10; // добавили дополнительную переменную ВЕС собакена

    public int getWeight() { // получить вес собаки
        return weight;
    }

    public void setWeight(int weight) { // изменить вес собаки

        this.weight = weight;
    }





    public void sit() { //метод сидеть
        System.out.println("Im siting ");
    }



    public void lay() { //метод лежать
        System.out.println("Im laying");
    }
}
