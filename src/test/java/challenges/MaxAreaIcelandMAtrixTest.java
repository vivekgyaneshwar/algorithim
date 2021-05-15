package challenges;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxAreaIcelandMAtrixTest {

    MaxAreaIcelandMAtrix maxAreaIcelandMAtrix;

    @Before
    public void setUp() throws Exception {
        maxAreaIcelandMAtrix=new MaxAreaIcelandMAtrix();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void maxAreaOfIsland() {
        int[][] grid ={{0,0,0,0,0,0,0,0}};
        Assert.assertEquals(0,maxAreaIcelandMAtrix.maxAreaOfIsland(grid));
        int[][] grid1 = {{0,0,1,0,0,0,0,1,0,0,0,0,0},{0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},{0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},{0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},{0,0,0,0,0,0,0,1,1,0,0,0,0}};
        Assert.assertEquals(6,maxAreaIcelandMAtrix.maxAreaOfIsland(grid1));
    }
}