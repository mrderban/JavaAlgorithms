package avoidObtacles;

import org.junit.Test;

import static avoidObtacles.avoidObstaclesAlgorithm.avoidObstacles;
import static org.junit.Assert.assertEquals;

public class avoidObstaclesAlgorithmTest {

    @Test
    public void avoidObstaclesTest() {
        int[] intArray1 = new int[]{5, 3, 6, 7, 9};
        assertEquals(4, avoidObstacles(intArray1));
    }
}