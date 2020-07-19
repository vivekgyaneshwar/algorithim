package algorithms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.junit.Before;
import org.junit.Test;

public class LinearSearch_IntegerTest {

    private List<Integer> elements;
    private LinearSearch<Integer> searchInt;

    @Test
    public void linearSearch_Integer() {
        Integer found = searchInt.findItem(elements, 20);
        assertNotNull(found);
        assertEquals(20, found.intValue());
    }

    @Test
    public void linearSearch_Stream_Integer() {
        Integer found = searchInt.findItemViaStream(elements, 20);
        assertNotNull(found);
        assertEquals(20, found.intValue());
    }

    @Before
    public void setup() {
        searchInt = new LinearSearch<>();
        elements = IntStream.iterate(10, x -> x + 10).limit(25).boxed().collect(Collectors.toList());
    }

}
