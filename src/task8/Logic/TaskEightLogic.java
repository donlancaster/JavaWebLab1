package task8.Logic;

import java.util.ArrayList;

public class TaskEightLogic {
    public static ArrayList<Integer> merge(int[] first, int[] second) {
        double maxLength = first.length + second.length;
        ArrayList<Integer> result = new ArrayList<Integer>();
        int indexFirst = 0, indexSecond = 0;
        int currentIndex = 0;
        while (currentIndex < maxLength) {
            if ((indexFirst < first.length) && (indexSecond < second.length)) {
                if (first[indexFirst] == second[indexSecond]) {
                    result.add(first[indexFirst++]);
                    indexSecond++;
                    currentIndex += 2;
                } else if (first[indexFirst] < second[indexSecond]) {
                    result.add(first[indexFirst++]);
                    currentIndex++;
                } else if (second[indexSecond] < first[indexFirst]) {
                    result.add(second[indexSecond++]);
                    currentIndex++;
                }
            }
            if ((indexSecond >= second.length) && (indexFirst < first.length)) {
                result.add(first[indexFirst++]);
                currentIndex++;
            } else if ((indexFirst >= first.length) && (indexSecond < second.length)) {
                result.add(second[indexSecond++]);
                currentIndex++;
            }
        }
        return result;
    }
}
