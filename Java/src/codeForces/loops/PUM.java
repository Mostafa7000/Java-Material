package codeForces.loops;

import java.util.Scanner;

public class PUM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int counter = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(counter + " "); // 1 5
            counter++; // 2 6
            System.out.print(counter + " "); // 2 6
            counter++; // 3
            System.out.print(counter + " "); // 3
            counter++; // 4
            System.out.println("PUM"); // pum
            counter++; // 5
        }
    }
}
