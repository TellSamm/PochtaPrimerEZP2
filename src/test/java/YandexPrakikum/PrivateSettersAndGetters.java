package YandexPrakikum;

public class PrivateSettersAndGetters {
    private String name;

    public String getName() { // в геттере мы пишем тип данных
        return name;
    }
    public void setName (String name){ // в сеттере мы не пишем тип данных (только в скобках)
        this.name = name;
    }
}
