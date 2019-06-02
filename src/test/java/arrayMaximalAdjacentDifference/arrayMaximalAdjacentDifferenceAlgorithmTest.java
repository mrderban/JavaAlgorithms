package arrayMaximalAdjacentDifference;

import org.junit.Test;

import static arrayMaximalAdjacentDifference.arrayMaximalAdjacentDifferenceAlgorithm.arrayMaximalAdjacentDifference;
import static org.junit.Assert.assertTrue;

public class arrayMaximalAdjacentDifferenceAlgorithmTest {

    @Test
    public void arrayMaximalAdjacentDifferenceTest() {
        int[] intArray1 = new int[]{2, 4, 1, 0};
        assertTrue(arrayMaximalAdjacentDifference(intArray1) == 3);
    }
}