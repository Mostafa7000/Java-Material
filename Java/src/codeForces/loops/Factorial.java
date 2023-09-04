package codeForces.loops;

import java.util.Scanner;

public class Factorial {
    public static long factorial(int num) {
        long result = 1;
        while (num > 0) {
            result *= num;
            num--;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            System.out.println(factorial(scanner.nextInt()));
        }
    }
}
