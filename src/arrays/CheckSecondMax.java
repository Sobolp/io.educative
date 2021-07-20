package arrays;

class CheckSecondMax {

    public int findSecondMaximum(int[] arr)
    {
        // Write - Your - Code
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int i : arr) {
            if (i >= first) {
                second = first;
                first = i;
            } else if (i >= second) {
                second = i;
            }
        }
        return second;
    }
}
