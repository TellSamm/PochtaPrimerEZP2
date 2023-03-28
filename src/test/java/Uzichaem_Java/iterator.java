package Uzichaem_Java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterator {
    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        array.add(5);
        array.add(10);
        array.add(88);
        array.add(101);
        array.add(103);
        array.add(105);
//        System.out.println(array.get(3));
//        array.set(3,105);
//        System.out.println(array.get(3));
//        System.out.println(array.size());

       Iterator<Integer> iterator = array.iterator();
//       System.out.println(iterator.next());
//       System.out.println(iterator.next());
//       System.out.println(iterator.hasNext());
//       System.out.println(iterator.next());
//       System.out.println(iterator.next());
//       System.out.println(iterator.hasNext());
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

}
