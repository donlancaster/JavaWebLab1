package task4.Logic;

public class TaskFourLogic {
    public static void check(int[] array) {
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
                System.out.println("array[" + i + "] = " + array[i] + " is prime");
                counter++;
            }
        }
        if (counter == 0) System.out.println("No prime numbers");
    }

    private static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
