package arrays;

class FindMax {
    public static int findMaxSumSubArray(int[] arr) {
        int maxSum = Integer.MIN_VALUE;
        for (int i=0; i < arr.length; i++) {
            int tmpSum = 0;
            for (int j = i; j < arr.length; j++){
                tmpSum += arr[j];
                maxSum = Math.max(maxSum, tmpSum);
            }
        }
        return maxSum;
    }
    public static int findMaxSumSubArrayKadanesAlgorithm(int[] arr) {
        int maxSum = 0;
        int tmpSum = -1;
        for (int i : arr) {
            if (tmpSum < 0) {
                tmpSum = i;
            } else {
                tmpSum += i;
            }
            maxSum = Math.max(maxSum, tmpSum);
        }
        return maxSum;
    }
}