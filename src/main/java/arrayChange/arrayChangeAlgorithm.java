package arrayChange;

public class arrayChangeAlgorithm {

    public static int arrayChange(int[] inputArray) {
        int result = 0;
        int n = inputArray.length;
        for(int i = 1; i < n; ++i) {
            if (inputArray[i] <= inputArray[i-1]) {
                result += inputArray[i-1] - inputArray[i] + 1;
                inputArray[i] = inputArray[i-1] + 1;
            }
        }
        return result;
    }
}
