package algorithms;

public class BinarySearch {

    public int findItemIndex(int elements[], int left, int right, int searchItem) {
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (elements[mid] == searchItem)
                return mid;
            if (elements[mid] > searchItem)
                return findItemIndex(elements, left, mid - 1, searchItem);
            return findItemIndex(elements, mid + 1, right, searchItem);
        }
        return -1;
    }

}
