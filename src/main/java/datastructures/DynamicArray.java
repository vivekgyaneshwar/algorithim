package datastructures;

//this class holds and array and supports different operations in the array
public class DynamicArray<String> {

    private Object[] data;

    // Counter for the number of elements in our array
    private int size = 0;

    // The capacity of our array - or how many elements it can hold.
    // What we double when the number of elements exceeds the capacity of the array.
    private int initialCapacity;

    public DynamicArray(int initialCapacity) {
        this.initialCapacity = initialCapacity;
        data = new Object[initialCapacity];
    }

    //O(1)
    public String get(int index) {
        return (String)data[index];
    }

    public void set(int index, String value) {
        data[index] = value;
    }

    //O(n) might add some time for resize at a particular index
    public void insert(int index, String value) {

        // Check size
        if (size == initialCapacity) {
            resize();
        }

        // Copy up
        for (int j = size; j > index; j--) {
            data[j] = data[j-1];
        }

        // Insert
        data[index] = value;
        size++;
    }

    //
    // You try
    // Try implementing delete, isEmpty, and Contains on your own.


    private void resize() {
        Object[] newData = new Object[initialCapacity * 2];
        for (int i = 0; i < initialCapacity; i++) {
            newData[i] = data[i];
        }
        data = newData;
        initialCapacity = initialCapacity * 2;
    }

    public int size() {
        return size;
    }

    public void print() {
        for (int i=0;i< size;i++) {
            System.out.println("data[i] = " + data[i]);
        }
    }

    // Some array implementations offer methods like insert (also known as pushBack).
    // Which is like insert, only in does the insert at the end of the array.
    public void add(String value) {

        if (size == initialCapacity) {
            resize();
        }

        data[size] = value;
        size++;
    }

    public void delete(int index) {
        // Copy down
        for (int j = index; j < size - 1; j++) {
            data[j] = data[j + 1];
        }

        // Clear last element of array
        data[size - 1] = null;

        size--;
    }

    //O(1)
    public boolean isEmpty() {
        return size == 0;
    }

    //O(n)
    public boolean Contains(String value) {
        //linear search O(n)
        for (int i = 0; i <= size -  1; i++) {
            String currentValue = (String)data[i];
            if (currentValue.equals(value)) {
                return true;
            }
        }
        return false;
    }

}