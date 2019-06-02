package avoidObtacles;

import java.util.Arrays;

public class avoidObstaclesAlgorithm {
    public static int avoidObstacles(int[] obstacleArray) {
        //sort obstacleArray
        Arrays.sort(obstacleArray);

        //get the max value
        int maxObstacle = obstacleArray[obstacleArray.length - 1];
        int maxJumpSize = maxObstacle + 1;

        //move through all possible jumpSize to find the min value
        for (int i = 1; i <= maxJumpSize; i++) {
            //initialize validityCounter
            int validityCounter = 0;
            for (int obstacle : obstacleArray) {
                if (obstacle % i != 0) {
                    validityCounter++;
                }
            }
            if (validityCounter == obstacleArray.length) {
                return i;
            }
        }
        //default return
        return maxJumpSize;
    }
}
