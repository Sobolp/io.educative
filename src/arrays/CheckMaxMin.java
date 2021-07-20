package arrays;

public class CheckMaxMin {

    public static void maxMin(int[] arr) {
        int[] result = new int[arr.length];
        int i_min = 0;
        int i_max = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                result[i] = arr[i_max--];
            } else {
                result[i] = arr[i_min++];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = result[i];
        }
    }
}
