package isPalindrome;

import junit.framework.TestCase;

import static areSimilar.areSimilarAlgorithm.areSimilar;
import static org.junit.Assert.assertFalse;

public class IsPalindromeAlgorithmTest extends TestCase {

    public void testIsPalindrome() {
        int x = 121;
        int y = -121;
        int z = 345676543;
        int w = 123456;
        assertTrue(IsPalindromeAlgorithm.isPalindrome(x));
        assertTrue(IsPalindromeAlgorithm.isPalindrome(z));
        assertFalse(IsPalindromeAlgorithm.isPalindrome(y));
        assertFalse(IsPalindromeAlgorithm.isPalindrome(w));
    }
}