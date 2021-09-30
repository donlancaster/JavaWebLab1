package task1.Start;

import Tools.MyScanner;

import static task1.Logic.TaskOneLogic.function;

public class TaskOne {
    public static void main(String[] args) {
        double x;
        System.out.println("Please enter x:");
        x = MyScanner.nextDouble();
        double y;
        System.out.println("Please enter y:");
        y = MyScanner.nextDouble();
        System.out.printf("Result = %.3f" , function(x, y));
    }


}
