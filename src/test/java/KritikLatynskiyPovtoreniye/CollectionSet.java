package KritikLatynskiyPovtoreniye;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet { // Коллекция set и ее отличие от list в том что set хранит в себе уникальные значения, list может хранить
    // повторяющиеся значения , set это множество объектов они все уникальные, в коллекции set нет индексов поэтому мы не можем получить
    // как в list методом get по индексу значение

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(100);
        set.add(101);
        set.add(102);// еще раз добавили 101 но в методе size нам покажет 3 объекта так как 101 уже было и он неуникальный
        set.add(101);


        set.remove(101); // в отличие от list мы указываем не индекс а значение элемента

        System.out.println(set.size());

        Iterator<Integer> interator = set.iterator();

        while (interator.hasNext()){
            System.out.println(interator.next());
        }


        // set.clear(); // очистка списка
        System.out.println(set.size());

        // проверка есть ли значение contains
        System.out.println(set.contains(10)); //false
        System.out.println(set.contains(102)); //true



    }
}
