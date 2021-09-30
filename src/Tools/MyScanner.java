package Tools;

import java.util.Scanner;

public class MyScanner {
    private static final Scanner scanner = new Scanner(System.in);

    public static int nextInt() {
        while (!scanner.hasNextInt()) scanner.next();
        return scanner.nextInt();
    }

    public static double nextDouble(){
        while (!scanner.hasNextDouble()) scanner.next();
        return scanner.nextDouble();
    }

}
