package longestCommonPrefix;

import junit.framework.TestCase;

import static avoidObtacles.avoidObstaclesAlgorithm.avoidObstacles;
import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixAlgorithmTest extends TestCase {

    public void testGetLongestCommonPrefix() {

        String[] stringArray1 = new String[]{"flower","flow","flight"};
        String[] stringArray2 = new String[]{"dog","racecar","car"};
        String[] stringArray3 = new String[]{"floweringplant","flowering","gtyj"};
        String[] stringArray4 = new String[]{"floweringint","floweringintek","floweringinteking"};
        assertEquals("fl", LongestCommonPrefixAlgorithm.getLongestCommonPrefix(stringArray1));
        assertEquals("", LongestCommonPrefixAlgorithm.getLongestCommonPrefix(stringArray2));
        assertEquals("", LongestCommonPrefixAlgorithm.getLongestCommonPrefix(stringArray3));
        assertEquals("floweringint", LongestCommonPrefixAlgorithm.getLongestCommonPrefix(stringArray4));

    }
}