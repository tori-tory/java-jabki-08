import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    public void testArraylist() {
        List<Integer> arrayList = new ArrayList<>();
        Assertions.assertTrue(arrayList.size() == 0);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(2,3);
        Assertions.assertEquals(4, arrayList.getLast());

        arrayList.remove(0);
        Assertions.assertEquals(2, arrayList.getFirst());
    }

    @Test
    public void testLinkedList() {
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        Collections.reverse(linkedList);
        Assertions.assertEquals(30, linkedList.getFirst());
        linkedList.set(1, 100);
        Assertions.assertEquals(100, linkedList.get(1));
    }
}