package task7.Logic;

public class TaskSevenLogic {
    public static int[] shellSort(int[] array) {
        int i = 0;
        while (i < array.length - 1) {
            if (array[i] <= array[i + 1])
                i++;
            else {
                int tmp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = tmp;
                if (i != 0)
                    i--;
            }
        }
        System.out.print("\nsorted ");
        return array;
    }
}
