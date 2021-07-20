package arrays;

public class CheckRotateArray{

    public static void rotateArray(int[] arr){

        int tmp = arr[arr.length - 1];
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];
        }
        arr[0] = tmp;
    }
}