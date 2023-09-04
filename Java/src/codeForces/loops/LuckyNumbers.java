package codeForces.loops;

import java.util.Scanner;

public class LuckyNumbers {
    private static boolean isLucky(int number) {
        while (number > 0) {
            if (number % 10 != 4 && number % 10 != 7)
                return false;
            number /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(), b = scanner.nextInt();
        boolean printed = false;
        for (int i = a; i <= b; i++) {
            if (isLucky(i)) {
                System.out.print(i + " ");
                printed = true;
            }
        }
        if (!printed) {
            System.out.print(-1);
        }
    }
}
