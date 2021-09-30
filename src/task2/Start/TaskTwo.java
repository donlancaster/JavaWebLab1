package task2.Start;

import Tools.MyScanner;

import static task2.Logic.TaskTwoLogic.belongs;

public class TaskTwo {
    public static void main(String[] args) {
        System.out.println("Please enter x:");
        int x = MyScanner.nextInt();
        System.out.println("Please enter y:");
        int y = MyScanner.nextInt();
        System.out.println(belongs(x, y));
    }
}
