package arrayChange;

import org.junit.Test;

import static arrayChange.arrayChangeAlgorithm.arrayChange;
import static org.junit.Assert.*;

public class arrayChangeAlgorithmTest {

    @Test
    public void arrayChangeTest() {
        int[] intArray1 = new int[]{ 1,1,1 };
        assertTrue(arrayChange(intArray1)==3);
    }
    @Test
    public void arrayChangeTestTwo() {
        int[] intArray1 = new int[]{ 4,1,1 };
        assertTrue(arrayChange(intArray1)==9);
    }
}