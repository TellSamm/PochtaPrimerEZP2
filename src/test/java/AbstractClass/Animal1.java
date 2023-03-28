package AbstractClass;

public abstract class Animal1 {

    public abstract void say (); // абстрактный класс говорить без { } скобок и тела метода

    public abstract void eat(); // абстрактный класс "есть" без { } скобок и тела метода

    public void walk (String place){ // не асбтрактный метод ходить c переменной String place (место)
        System.out.println("Im walking here: " + place);
    }

}
