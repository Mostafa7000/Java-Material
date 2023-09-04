package codeForces.loops;

import java.util.Scanner;

public class SomeSums {
    public static boolean check(int number, int A, int B) {
        int sum = 0;
        while (number > 0) { // 17
            sum += (number % 10);
            number /= 10;
        }
        return sum >= A && sum <= B;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int summation = 0;
        for (int i = 1; i <= N; i++) {
            if (check(i, A, B))
                summation += i;
        }

        System.out.println(summation);
    }
}