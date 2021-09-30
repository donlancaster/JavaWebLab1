package task3.Start;

import Tools.MyScanner;

import static task3.Logic.TaskThreeLogic.*;

public class TaskThree {
    public static void main(String[] args) {
        System.out.println("Please enter a:");
        double a = MyScanner.nextDouble();
        System.out.println("Please enter b:");
        double b = MyScanner.nextDouble();
        System.out.println("Please enter h:");
        double h = MyScanner.nextDouble();
        double[][] matrix = function(a, b, h);
        printMatrix(matrix);
    }
}
