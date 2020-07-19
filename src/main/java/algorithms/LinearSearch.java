package algorithms;

import java.util.List;

public class LinearSearch<T> {

    public T findItem(List<T> elements, T searchingItem) {
        for (T item : elements) {
            if (item.equals(searchingItem)) {
                return item;
            }
        }
        return null;
    }

    public T findItemViaStream(List<T> elements, T searchingItem) {
        return elements.stream().filter(customer -> searchingItem.equals(customer)).findAny().orElse(null);
    }
}
