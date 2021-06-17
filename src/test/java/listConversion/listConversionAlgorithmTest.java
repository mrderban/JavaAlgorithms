package listConversion;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static listConversion.listConversionAlgorithm.listConversion;
import static org.assertj.core.api.Assertions.assertThat;

public class listConversionAlgorithmTest {

    @Test
    public void listConversionTest() {
        List<Integer> inputList1 = new ArrayList<>();
        inputList1.add(1);
        inputList1.add(2);
        inputList1.add(3);
        inputList1.add(4);
        inputList1.add(5);
        inputList1.add(6);
        inputList1.add(7);
        inputList1.add(8);

        List<Integer> expectedList = new ArrayList<>();
        expectedList.add(186);
        assertThat(listConversion(inputList1)).isEqualTo(expectedList);
    }
}