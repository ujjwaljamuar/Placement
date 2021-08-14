package DynamicProgramming;

import java.util.Scanner;

public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = 0 , b = 1 , c , count;
        System.out.println("Enter the count : ");
        count = sc.nextInt();

        System.out.print(a + " " + b);

        for (int i = 2; i <= count; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }

        sc.close();
    }
}
