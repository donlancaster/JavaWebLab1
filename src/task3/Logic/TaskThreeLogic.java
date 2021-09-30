package task3.Logic;

public class TaskThreeLogic {
    public static double[][] function(double a, double b, double h) {
        int rows = (int) ((int) (b - a) / h) + 1;
        double[][] matrix = new double[rows][2];
        for (int i = 0; i < rows; i++) {
            matrix[i][0] = a;
            matrix[i][1] = Math.tan(a);
            a += h;
        }
        return matrix;
    }

    public static void printMatrix(double[][] matrix) {
        System.out.println("Result matrix:");
        for (double[] value : matrix) {
            System.out.println(value[0] + " | " + value[1]);
        }
    }
}
