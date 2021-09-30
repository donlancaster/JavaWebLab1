package task5.Logic;

public class TaskFiveLogic {
    public static int getMinimumElements(int[] array) {
        int maxIncreasingLength = 0, currentIncreasingLength = 0;
        boolean isIncreasing;
        for (int i = 0; i < array.length; i++) {
            isIncreasing = true;
            currentIncreasingLength = 1;
            for (int j = i + 1; (j < array.length) && isIncreasing; j++) {
                if (array[j - 1] < array[j]) {
                    currentIncreasingLength++;
                } else {
                    isIncreasing = false;
                }
            }
            maxIncreasingLength = Math.max(maxIncreasingLength, currentIncreasingLength);
        }
        return array.length - maxIncreasingLength;
    }
}
