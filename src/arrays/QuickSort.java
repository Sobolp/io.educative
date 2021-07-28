package arrays;

class QuickSort {
    /**
     * algorithm quicksort(A, lo, hi) is
     * if lo < hi then
     * p:= partition(A, lo, hi)
     * quicksort(A, lo, p)
     * quicksort(A, p + 1, hi)
     * algorithm partition(A, low, high) is
     * pivot:= A[(low + high) / 2]
     * i:= low
     * j:= high
     * loop forever
     * <p>
     * while A[i] < pivot
     * i:= i + 1
     * while A[j] > pivot
     * j:= j - 1
     * if i >= j then
     * return j
     * swap A[i++] with A[j--]
     */
    private static int partition(int[] A, int low, int high) {
        int pivot = A[(low + high) / 2];
        int i = low;
        int j = high;
        while (true) {
            while (A[i] < pivot) {
                i++;
            }
            while (A[j] > pivot) {
                j--;
            }
            if (i >= j) {
                return j;
            }
            int tmp = A[j];
            A[j] = A[i];
            A[i] = tmp;
        }
    }

    private static void quickSortAlg(int[] A, int lo, int hi) {
        if (lo < hi) {
            int p = partition(A, lo, hi);
            quickSortAlg(A, lo, p);
            quickSortAlg(A, p + 1, hi);
        }
    }

    static void quickSort(int[] arr) {
        quickSortAlg(arr, 0, arr.length - 1);

    }
}