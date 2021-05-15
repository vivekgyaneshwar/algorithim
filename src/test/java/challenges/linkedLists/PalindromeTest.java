package challenges.linkedLists;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome palindrome;

    @Before
    public void setUp() throws Exception {
        palindrome = new Palindrome();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void isPalindrome() {
        Assert.assertTrue(palindrome.isPalindrome("MalayalaM"));
    }
}