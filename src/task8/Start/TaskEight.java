package task8.Start;

import Tools.MyArrayWorker;
import Tools.MyScanner;

import java.util.ArrayList;

import static task8.Logic.TaskEightLogic.merge;

public class TaskEight {
    public static void main(String[] args) {
        System.out.println("Please enter first array size:");
        int size1 = MyScanner.nextInt();
        System.out.println("Please enter first array elements:");
        int[] first = MyArrayWorker.inputArray(size1);
        System.out.println("Please enter second array size:");
        int size2 = MyScanner.nextInt();
        System.out.println("Please enter second array elements:");
        int[] second = MyArrayWorker.inputArray(size2);
        ArrayList<Integer> resultArray = merge(first, second);
        System.out.println("\nResult array:\n" +
                resultArray.toString());
    }
}
