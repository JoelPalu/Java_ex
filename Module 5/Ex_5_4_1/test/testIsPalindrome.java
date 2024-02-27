import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class testIsPalindrome {

    @Test
    public void testIsPalindrome() {
        PalidromeChecker checker = new PalidromeChecker();
        assertFalse(checker.isPalindrome("openai"));

    }
    @Test
    public void testIsPalindrome1() {
        PalidromeChecker checker = new PalidromeChecker();
        assertTrue(checker.isPalindrome("radar"));


    }
    @Test
    public void testIsPalindrome2() {
        PalidromeChecker checker = new PalidromeChecker();

        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"));

    }
    @Test
    public void testIsPalindrome3() {
        PalidromeChecker checker = new PalidromeChecker();

        assertFalse(checker.isPalindrome("hello"));

    }
}


