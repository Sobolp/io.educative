package arrays;

class CheckFirstUnique {
    public static int findFirstUnique(int[] arr) {
        int result = -1;
        // write your code here
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) count++;
            }
            if (count == 0) return arr[i];
        }
        return result;
    }
}