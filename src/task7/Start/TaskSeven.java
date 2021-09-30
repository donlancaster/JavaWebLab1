package task7.Start;

import Tools.MyArrayWorker;
import Tools.MyPrinter;
import Tools.MyScanner;

import static task7.Logic.TaskSevenLogic.shellSort;

public class TaskSeven {
    public static void main(String[] args) {
        System.out.print("Please enter array size: ");
        int n = MyScanner.nextInt();
        int[] array = MyArrayWorker.randomArray(n, 0, 100);
        MyPrinter.print(array);
        array = shellSort(array);
        MyPrinter.print(array);
    }
}



