package datastructures;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {

    private LinkedList linkedList;

    @Before
    public void SetUp() {
        linkedList = new LinkedList();
    }

    @Test
    public void AddFront() {
        System.out.println("before insertion");
        linkedList.print();
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);
        System.out.println("after insertion");
        linkedList.print();
        Assert.assertEquals(3, linkedList.getFirst());
        Assert.assertEquals(1, linkedList.getLast());
    }

    @Test
    public void GetFirst() {
        linkedList.addFront(1);
        Assert.assertEquals(1, linkedList.getFirst());
    }

    @Test
    public void GetLast() {
        linkedList.addFront(1);
        linkedList.addFront(2);
        linkedList.addFront(3);

        Assert.assertEquals(1, linkedList.getLast());
    }

    @Test
    public void AddBack() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);

        Assert.assertEquals(1, linkedList.getFirst());
        Assert.assertEquals(3, linkedList.getLast());
    }

    @Test
    public void Size() {
        System.out.println("before inserts");
        linkedList.print();
        linkedList.size();
        Assert.assertEquals(0, linkedList.size());
        linkedList.addBack(1);
        Assert.assertEquals(1, linkedList.size());
        //linkedList.addBack(2);
        Assert.assertEquals(2, linkedList.size());
        System.out.println("after inserts");
        linkedList.print();
        linkedList.size();
    }

    @Test
    public void Clear() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);
        System.out.println("before clear");
        linkedList.print();
        linkedList.size();
        linkedList.clear();
        System.out.println("after clear");
        linkedList.print();
        linkedList.size();

        Assert.assertEquals(0, linkedList.size());
    }

    @Test
    public void DeleteValue() {
        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);
        //TODO 1->2->3-->null
        linkedList.deleteValue(2);
        //TODO 1-->3-->null
        Assert.assertEquals(2, linkedList.size());
        Assert.assertEquals(1, linkedList.getFirst());
        Assert.assertEquals(3, linkedList.getLast());
    }

    @Test
    public void DeleteLastValue() {

        linkedList.addBack(1);
        linkedList.addBack(2);
        linkedList.addBack(3);
        linkedList.addBack(4);
        System.out.println("before delete");
        linkedList.print();
        linkedList.size();

        linkedList.deleteValue(4);
        System.out.println("after delete");
        linkedList.print();
        linkedList.size();

        Assert.assertEquals(3, linkedList.size());
        Assert.assertEquals(1, linkedList.getFirst());
        Assert.assertEquals(3, linkedList.getLast());

        linkedList.print();
    }

}
