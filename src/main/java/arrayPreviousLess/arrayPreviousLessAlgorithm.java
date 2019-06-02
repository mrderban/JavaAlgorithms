package arrayPreviousLess;

public class arrayPreviousLessAlgorithm {
    public static int[] arrayPreviousLess(int[] inputArray) {
        //initialize resultArray
        int[] resultArray = new int[inputArray.length];
        //initialize first entry
        resultArray[0] = -1;

        //move through inputArray
        for (int i = 1; i < inputArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (inputArray[j] < inputArray[i]) {
                    resultArray[i] = inputArray[j];
                } else {
                    resultArray[i] = -1;
                }
            }
        }
        return resultArray;
    }
}
