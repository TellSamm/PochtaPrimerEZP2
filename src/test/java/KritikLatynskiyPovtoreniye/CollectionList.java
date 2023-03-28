package KritikLatynskiyPovtoreniye;

import java.util.ArrayList;
import java.util.List;

public class CollectionList { //коллекция list помогает нам решить проблему статического массива (размер массива сам увеличивается и уменьшается)

    public static void main(String[] args) {

        int [] array = new int[3];

        List <Integer> list = new ArrayList<>(); // имя динамического массива  list

        list.add(100);// добавили 100 с помощью метода add
        list.add(50);// добавили 50 с помощью метода add
        list.add(52);// добавили 52 с помощью метода add

        System.out.println(list.get(1)); // вывести значение под индексом 1

        list.set(1,44);// изменили значение 1 индекса = 44

        System.out.println(list.get(1));// вывести значение под индексом 1 ранее измененного на 44

        //list.remove(1);// удалили элемент и иднексом 1

        System.out.println(list.get(1)); // вывести значение под индексом 1 удалённого (Index 1 out of bounds for length 1)

        list.add(10);// добавили 10 с помощью метода add
        list.add(22);// добавили 22 с помощью метода add

        System.out.println(list.size()); // размер массива выводим size после еще добавления элементов в массив

        // @!еще рассмотрим интересные методы коллекции list!@

        //list.clear(); // полностью очищает список

        //System.out.println(list.size());

        List <Integer> list2 = new ArrayList<>();

        list2.add(2);
        list2.add(22);

        list.addAll(list2); // метод addAll позволяет добавить элементы одного списка в другой список

        System.out.println(list.size()); // ранее длинна списка list была 5 после стала равна 7 мы добавили еще элементы из list2

        System.out.println(list.get(6)); // выведем 6 индекс который прибавлен был из list2 должен быть равен = 22

        list.removeAll(list2);// метод removeAll позволяет удалить элементы одного списка из другого

        System.out.println(list.size()); // длинна массива list стала равна 4

        // метод isEmpty позволяет понять пустой ли наш массив или нет
        System.out.println(list.isEmpty()); // выводим результат (массив пустой? нет? = false)
        list.clear(); // очищаем массив
        System.out.println(list.isEmpty()); // выводим результат после очищения массива (массив пустой? да? = true)

        // метод contains(содержит) проверяет есть ли в нашем списке такое-то число? да (true) нет (false)

        System.out.println(list.contains(100)); // есть ли (содержит ли) число 100 наш массив? false конечно же
        // потому что мы до этого очистили наш массив с помощью метода clear
        list.add(100);
        System.out.println(list.contains(100)); //есть ли (содержит ли) число 100 наш массив? true конечно же
        //потому что мы добавили число 100 в индекс 1 с помощью метода add

        list.addAll(list2); // добавили элементы list2 в list
        // с помощью метода containsAll мы проверяем есть ли в массиве list элементы массива list2 (true/false)
        System.out.println(list.containsAll(list2)); // получаем ответ true потому что элементы есть! мы же их добавили до этого!
        list.removeAll(list2);// метод removeAll позволяет удалить элементы одного списка из другого

        System.out.println(list.containsAll(list2)); // получаем ответ false потому что элементов нет!




    }

}
