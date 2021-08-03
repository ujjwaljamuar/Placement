package Arrays;
import java.util.Scanner;
public class ArrayDemo {

    public void demoArray() {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[5]; // 5 values
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;

        // myArray[5] = 45                                   ---> it will throw indexoutOfBound Exception

        printArray(myArray);                                 // print function called

        System.out.println();

        // modify the array
        myArray[2] = 45;
        myArray[4] = 95;

        System.out.println("New Array is : ");
        printArray(myArray);                                 // print the new Array

        System.out.println();

        System.out.println("Length of the myArray is " + myArray.length);
        System.out.println(myArray[myArray.length-3]);      // print 45


        int [] myArray1 = {1,2,3,4,5,6,7,8,9};
        printArray(myArray1);
        System.out.println();
        System.out.println("Length of myArray1 is " + myArray1.length);

        // Taking Input 

        System.out.println("Enter the length for myArray2 : ");
        int a = sc.nextInt();
        int[] myArray2 = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.println("Enter array at pos["+i+"] : ");
            myArray2[i] = sc.nextInt(); 
        }
        System.out.println("MyArray2 : ");
        printArray(myArray2);





        sc.close();
    }

    public void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        
        ArrayDemo arrdemo = new ArrayDemo();

        arrdemo.demoArray();

        arrdemo.printArray(new int[] {20,30,40,50});
    }
}
