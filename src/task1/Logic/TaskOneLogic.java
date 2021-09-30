package task1.Logic;

public class TaskOneLogic {
    public static double function(double x, double y) {
        return (1 + Math.pow(Math.sin(x + y), 2)) /
                (2 + Math.abs(x - (2 * x / (1 + Math.pow(x * y, 2))))) + x;
    }
}
