package Tools;

public class MyPrinter {
    public static void print(int[] array) {
        System.out.println("\narray:");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + " ");
        }
        System.out.println();
    }

    public static void print(int[][] matrix) {
        System.out.println("\nmatrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
