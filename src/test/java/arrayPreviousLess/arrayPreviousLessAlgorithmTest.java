package arrayPreviousLess;

import org.junit.Test;

import static arrayPreviousLess.arrayPreviousLessAlgorithm.arrayPreviousLess;
import static org.assertj.core.api.Assertions.assertThat;

public class arrayPreviousLessAlgorithmTest {

    @Test
    public void arrayPreviousLessTest() {
        int[] intArray1 = new int[]{3, 5, 2, 4, 5};
        int[] intArray2 = new int[]{-1, 3, -1, 2, 4};
        assertThat(arrayPreviousLess(intArray1)).isEqualTo(intArray2);
    }
}