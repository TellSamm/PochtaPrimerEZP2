package KritikLatynskiyPovtoreniye;

import java.util.ArrayList;
import java.util.List;

public class Iterator {

    public static void main(String[] args) {

        // значится iterator это интерфейс который работает с элементами списка последовательно обходить сложную коллекцию, без раскрытия деталей её реализации
        // Дословно «Iterator» можно перевести как «переборщик».
        // но лучше это попробовать на действиях
        List<Integer> list = new ArrayList<>();
        list.add(100);// добавили 100 с помощью метода add
        list.add(50);// добавили 50 с помощью метода add
        list.add(101);// добавили 100 с помощью метода add
        list.add(51);// добавили 50 с помощью метода add
        list.add(102);// добавили 100 с помощью метода add
        list.add(52);// добавили 50 с помощью метода add

        java.util.Iterator<Integer> interator = list.iterator();

        System.out.println(interator.next()); // говорим итератору покажи первый (по индексу 0) элемент
        System.out.println(interator.hasNext()); // метод позволяет узнать существует ли сл.элемент в списке (true,false)

        // использование на примере с циклом, наш цикл будет идти до того пока метод hasNext будет выдавать true
        while (interator.hasNext()){
            System.out.println(interator.next()); // выводим на экран все элементы массива пока не закончатся
        }

    }

}
