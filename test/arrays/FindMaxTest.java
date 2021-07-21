package arrays;

import org.junit.jupiter.api.Test;

import static arrays.FindMax.findMaxSumSubArray;
import static arrays.FindMax.findMaxSumSubArrayKadanesAlgorithm;
import static org.junit.jupiter.api.Assertions.*;

class FindMaxTest {

    @Test
    void findMaxSumSubArrayTest() {
        assertEquals(11, findMaxSumSubArray(new int[]{1, 7, -2, -5, 10, -1}));
    }

    @Test
    void findMaxSumSubArrayKadanesAlgorithmTest() {
        assertEquals(11, findMaxSumSubArrayKadanesAlgorithm(new int[]{1, 7, -2, -5, 10, -1}));
    }
}