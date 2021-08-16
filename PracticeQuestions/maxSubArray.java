public class maxSubArray {

    public int MaxSumSArr(int[] arr) {
        int maxSoFar = arr[0];
        int currentMax = arr[0];
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            currentMax = currentMax + arr[i];
            if (currentMax < arr[i]) {
                currentMax = arr[i];
            }
            if (maxSoFar < currentMax) {
                maxSoFar = currentMax;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        maxSubArray msa = new maxSubArray();
        int[] arr = { 4, 3, -2, 6, -12, 7, -1, 6 };

        System.out.println(msa.MaxSumSArr(arr));

    }
}
