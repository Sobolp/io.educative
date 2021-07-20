package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckRotateArrayTest {

    @Test
    void rotateArray() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        CheckRotateArray.rotateArray(input);
        assertArrayEquals(new int[]{5, 1, 2, 3, 4}, input);
    }
}