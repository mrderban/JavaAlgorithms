package arrayMaxConsecutiveSum;

import org.junit.Test;

import static arrayMaxConsecutiveSum.arrayMaxConsecutiveSumAlgorithm.arrayMaxConsecutiveSum;
import static org.junit.Assert.assertTrue;

public class arrayMaxConsecutiveSumAlgorithmTest {

    @Test
    public void arrayMaxConsecutiveSumTest() {
        int[] intArray1 = new int[]{2, 3, 5, 1, 6};
        assertTrue(arrayMaxConsecutiveSum(intArray1, 2) == 8);
    }
}