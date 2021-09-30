package task6.Start;

import Tools.MyArrayWorker;
import Tools.MyPrinter;
import Tools.MyScanner;

import static task6.Logic.TaskSixLogic.convertToMatrix;

public class TaskSix {
    public static void main(String[] args) {
        System.out.println("Please enter array size:");
        int n = MyScanner.nextInt();
        int[] array = MyArrayWorker.randomArray(n, 0, 100);
        MyPrinter.print(array);
        int[][] matrix = convertToMatrix(array);
        MyPrinter.print(matrix);
    }
}
