package task4.Start;

import Tools.MyArrayWorker;
import Tools.MyPrinter;
import Tools.MyScanner;


public class TaskFour {
    public static void main(String[] args) {
        System.out.println("Please enter array size:");
        int n = MyScanner.nextInt();
        int[] array = MyArrayWorker.randomArray(n, 0, 100);
        MyPrinter.print(array);
        task4.Logic.TaskFourLogic.check(array);
    }
}
