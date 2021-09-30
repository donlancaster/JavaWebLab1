package Tools;

public class MyArrayWorker {
    public static int[] randomArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() * (max - min)) + min);
        }
        return array;
    }

    public static int[] inputArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.print("array[" + i + "] = ");
            array[i] = MyScanner.nextInt();
        }
        System.out.println();
        return array;
    }
}
