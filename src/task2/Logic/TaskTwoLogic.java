package task2.Logic;

public class TaskTwoLogic {
    public static boolean belongs(int x, int y) {
        if (y < -3 || y > 5) return false;
        if (Math.abs(x) <= 4) return true;
        if (Math.abs(x) <= 6 && y <= 0) return true;
        return false;
    }
}
