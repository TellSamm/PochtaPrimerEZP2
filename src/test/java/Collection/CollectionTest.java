package Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CollectionTest { // коллекции какие у нас бывают
    //List
    //Map
    //Set
    //Deque
    //Queue

    @Test
    public void test(){
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);
    }
}
