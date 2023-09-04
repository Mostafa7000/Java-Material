package codeForces.loops;

import java.util.Scanner;

public class Shape1 {
    private static void stars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print('*');
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = n; i > 0; i--) {
            stars(i);
            System.out.println();
        }
    }
}
