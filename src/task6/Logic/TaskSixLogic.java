package task6.Logic;

public class TaskSixLogic {

    public static int[][] convertToMatrix(int[] array) {
        int[][] matrix = new int[array.length][array.length];
        int delta = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = array[(j + delta) % array.length];
            }
            delta++;
        }
        return matrix;
    }
}
