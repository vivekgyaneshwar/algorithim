package datastructures;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RandomizedSetTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testBasic() {
        RandomizedSet<Character> set = new RandomizedSet<>();
        for (char val = 'A'; val <= 'Z'; val++) {
            set.add(val);
        }
        for (char val = 'A'; val <= 'Z'; val++) {
            System.out.print(set.deleteRandom());
        }
        System.out.println();
        assertEquals(0, set.size());

        for (char val = 'A'; val <= 'Z'; val++) {
            set.add(val);
        }
        for (char val = 'A'; val <= 'Z'; val++) {
            System.out.print(set.delete(val));
        }
        System.out.println();
        assertEquals(0, set.size());
    }
}