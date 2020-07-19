package algorithms;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class LinearSearch_POJOTest {

    private List<DemoPOJO> elements;
    private LinearSearch<DemoPOJO> searchPojo;

    @Test
    public void linearSearch_POJO() {
        DemoPOJO found = searchPojo.findItem(elements, new DemoPOJO(1, "Mary"));
        assertNotNull(found);
        assertTrue(found.equals(new DemoPOJO(1, "Mary")));
    }

    @Test
    public void linearSearch_Stream_POJO() {
        DemoPOJO found = searchPojo.findItemViaStream(elements, new DemoPOJO(1, "Mary"));
        assertNotNull(found);
        assertTrue(found.equals(new DemoPOJO(1, "Mary")));
    }

    @Before
    public void setup() {
        searchPojo = new LinearSearch<>();
        elements = new ArrayList<>();
        elements.add(new DemoPOJO(1, "Mary"));
        elements.add(new DemoPOJO(2, "Zheng"));
        elements.add(new DemoPOJO(3, "Alex"));

    }
}
