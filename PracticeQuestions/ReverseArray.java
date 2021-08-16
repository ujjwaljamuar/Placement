
import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int[] num,int start , int end) {
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }

    public static void print(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {10,20,30,40,50};

    /*  System.out.println("Enter length of the array : ");
        int a = sc.nextInt();
        int[] numbers = new int[a];
        for (int i = 0; i < a; i++) {
            System.out.println("Enter at postion[" + i + "] :");
            numbers[i] = sc.nextInt();
        }                                                                                
        
        */

        print(numbers);

        reverse(numbers, 0, numbers.length - 1);

        print(numbers);




        sc.close();
    }
}
