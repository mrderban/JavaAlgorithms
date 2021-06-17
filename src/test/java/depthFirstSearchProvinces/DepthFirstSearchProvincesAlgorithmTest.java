package depthFirstSearchProvinces;

import junit.framework.TestCase;
import org.junit.Test;

public class DepthFirstSearchProvincesAlgorithmTest extends TestCase {

    @Test
    public void testGetProvinces() {
        int[][] intMatrix = new int[][]{{1,1,0},{1,1,0},{0,0,1}};
        assertEquals(DepthFirstSearchProvincesAlgorithm.getProvinces(intMatrix),2);
    }
}