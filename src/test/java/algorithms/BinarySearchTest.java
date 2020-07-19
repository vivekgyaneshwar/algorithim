package algorithms;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinarySearchTest {

    private int arr[] = { 2, 3, 4, 10, 40 };
    private BinarySearch testClass = new BinarySearch();

    @Test
    public void search_item_found() {
        int itemIndex = testClass.findItemIndex(arr, 0, arr.length - 1, 3);
        assertEquals(3, arr[itemIndex]);
    }

    @Test
    public void search_item_not_found() {
        int itemIndex = testClass.findItemIndex(arr, 0, arr.length - 1, 60);
        assertEquals(-1, itemIndex);
    }

}
