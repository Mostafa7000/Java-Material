package codeForces.loops;

import java.util.Scanner;

public class SequenceOfNumbersAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int n = scanner.nextInt(), m = scanner.nextInt();
            if (n <= 0 || m <= 0)
                return;

            if (n > m) {
                int tmp = n;
                n = m;
                m = tmp;
            }
            int total = 0;
            for (int i = n; i <= m; i++) {
                total += i;
                System.out.print(i + " ");
            }
            System.out.println("sum =" + total);
        }
    }
}
