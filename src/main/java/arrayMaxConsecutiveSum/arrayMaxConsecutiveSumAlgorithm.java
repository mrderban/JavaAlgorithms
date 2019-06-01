package arrayMaxConsecutiveSum;

public class arrayMaxConsecutiveSumAlgorithm {

    public static int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        int currentSum = 0;
        //currentSum & bestSum initialization
        for (int i = 0; i < k; i++) {
            currentSum += inputArray[i];
        }
        int bestSum = currentSum;

        //add from one side remove from the other and compare currentSum w/ bestSum
        for (int i = k; i < inputArray.length; i++) {
            currentSum += inputArray[i];
            currentSum -= inputArray[i - k];
            bestSum = Math.max(bestSum, currentSum);
        }
        return bestSum;
    }
}
