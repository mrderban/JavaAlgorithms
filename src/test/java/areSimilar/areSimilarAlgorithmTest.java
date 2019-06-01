package areSimilar;

import org.junit.Test;

import static areSimilar.areSimilarAlgorithm.areSimilar;
import static org.junit.Assert.*;

public class areSimilarAlgorithmTest {

    @Test
    public void areSimilarTest() {
        int[] intArray1 = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int[] intArray2 = new int[]{ 1,2,3,8,5,6,7,4,9,10 };
        assertTrue(areSimilar(intArray1,intArray2));
    }

    @Test
    public void areSimilarTestTwo() {
        int[] intArray1 = new int[]{ 1,2,3,4,5,6,7,8,9,10 };
        int[] intArray2 = new int[]{ 1,9,3,8,5,6,7,4,2,10 };
        assertFalse(areSimilar(intArray1,intArray2));
    }
}