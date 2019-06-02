package arrayMaximalAdjacentDifference;

public class arrayMaximalAdjacentDifferenceAlgorithm {
    public static int arrayMaximalAdjacentDifference(int[] inputArray) {
        int maxDiff = Math.abs(inputArray[0] - inputArray[1]);
        for (int i = 1; i < inputArray.length; i++) {
            int absoluteDiff = Math.abs(inputArray[i - 1] - inputArray[i]);
            maxDiff = absoluteDiff > maxDiff ? absoluteDiff : maxDiff;
        }
        return maxDiff;
    }
}

