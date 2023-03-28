package Uzichaem_Java;

import java.util.ArrayList;
import java.util.List;

public class List_s {
    public static void main(String[] args) {

        List<Integer> array = new ArrayList<>();

        Dog k = new Dog();
        array.add(5);
        array.add(10);
        array.add(15);

        System.out.println(array.get(2));


    }
}
