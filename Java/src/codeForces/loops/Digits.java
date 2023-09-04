package codeForces.loops;

import java.util.Scanner;

public class Digits {
    private static void stars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print('*');
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String number = scanner.next();
            for (int j = number.length() - 1; j >= 0; j--) {
                System.out.print(number.charAt(j) + " ");
            }
            System.out.println();
        }
    }
}
