package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void quickSortTest() {
        int[] testArr = new int[]{55,23,26,2,25};
        QuickSort.quickSort(testArr);
        assertArrayEquals(new int[]{2,23,25,26,55}, testArr);
    }
}