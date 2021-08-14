package DynamicProgramming.BottomUp;

import java.util.Scanner;

public class NthFib {
    public static int fib(int n) {
        int[] table = new int[n + 1];
        table[0] = 0;
        table[1] = 1;

        for (int i = 2; i <= n; i++) {
            table[i] = table[i - 1] + table[i - 2];
        }
        return table[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the position : ");
        int n = sc.nextInt();
        System.out.println("The fibonacci number at " + n + " th postion is " + fib(n));
    }
}
