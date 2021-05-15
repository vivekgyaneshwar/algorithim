package algorithms;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SumInArrayTest {
    SumInArray sumInArray;

    @Before
    public void setUp() throws Exception {
        sumInArray= new SumInArray();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void findPairs() {
        int[] ints = {3, 4, 7, 1, 2, 9, 8};
        int[] arr1= {65, 30, 7, 90, 1, 9, 8};
        Assert.assertEquals(3,sumInArray.numberPairsForSum(ints,10));
        Assert.assertEquals(0,sumInArray.numberPairsForSum(arr1,7));
    }
}