package task5.Start;

import Tools.MyArrayWorker;
import Tools.MyScanner;

public class TaskFive {
    public static void main(String[] args) {
        System.out.println("Please enter array size:");
        int n = MyScanner.nextInt();
        System.out.println("Please enter array elements:");
        int[] array = MyArrayWorker.inputArray(n);
        System.out.println(task5.Logic.TaskFiveLogic.getMinimumElements(array));
    }
}
