package TwoSum;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class TwoSumI {
    public static int[] Twos(int[] arr, int target) {
        int[] result = new int[2];
        Map<Integer , Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (! map.containsKey(target - arr[i])) {
                map.put(arr[i], i);
            }
            else{
                result[1] = i;
                result[0] = map.get(target - arr[i]);
                return result;
            }
        }
        throw new NoSuchElementException("Not found");
    }

    public static void main(String[] args) {
        int[] arr = { 2,11,7,10,8,5};
        int[] res = Twos(arr, 9);
        System.out.println("The two indices are " + res[0] + " and " + res[1]);
    }
}
