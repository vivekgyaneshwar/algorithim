package algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class LinearSearch_StringTest {

    private List<String> elements;

    private LinearSearch<String> searchInt;

    @Test
    public void linearSearch_Stream_String() {
        String found = searchInt.findItemViaStream(elements, "Mary");
        assertNotNull(found);
        assertEquals("Mary", found);
    }

    @Test
    public void linearSearch_String() {
        String found = searchInt.findItem(elements, "Mary");
        assertNotNull(found);
        assertEquals("Mary", found);
    }

    @Before
    public void setup() {
        searchInt = new LinearSearch<>();
        elements = Arrays.asList("Hello", "Mary", "How", "Are", "You");
    }

}
