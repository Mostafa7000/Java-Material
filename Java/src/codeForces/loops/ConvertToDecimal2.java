package codeForces.loops;

import java.util.Scanner;

public class ConvertToDecimal2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String binary = Integer.toBinaryString(scanner.nextInt());
            int result=0;
            for(char c: binary.toCharArray()){
                if(c=='1')
                    result++;
            }
            if (i != n - 1)
                System.out.println((int) Math.pow(2, result) - 1);
            else
                System.out.print((int) Math.pow(2, result) - 1);
        }
    }
}
