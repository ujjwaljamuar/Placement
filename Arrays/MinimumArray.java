package Arrays;

public class MinimumArray {

    public int MinArray(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("No ELement Present");
        }
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            
        }
        return min; 
    }
        /*if (arr == null || arr.length == 0) {
                throw new IllegalArgumentException("No ELement Present");
            }
            int min = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (Math.min(min, arr[i]) < min) {
                    min = arr[i];
                }
            }
            return min;
        }                                    */


    public static void main(String[] args) {
        MinimumArray minArr = new MinimumArray();

        int[] arr = { 15,4,7,80,95,45,0,4,-2 };

        System.out.println(minArr.MinArray(arr) + " is the Minimum Value .");
        
    }
}
