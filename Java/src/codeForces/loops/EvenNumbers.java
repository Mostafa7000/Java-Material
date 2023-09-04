package codeForces.loops;

import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean printed = false;
        int x = scanner.nextInt();
        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                printed = true;
            }
        }
        if (!printed)
            System.out.println(-1);
    }
}
