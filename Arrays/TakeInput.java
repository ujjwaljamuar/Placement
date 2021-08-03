package Arrays;

import java.util.Scanner;

public class TakeInput {

    public void Input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Array : ");
        int a = sc.nextInt();

        int[] arr = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.println("Enter at position[" + i + "] :");
            arr[i] = sc.nextInt();

        }
        System.out.println("Array is : ");
        printArray(arr);


        sc.close();
    }

    public void printArray(int[] array){
        
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        TakeInput inp  = new TakeInput();
        inp.Input();
    }
}
