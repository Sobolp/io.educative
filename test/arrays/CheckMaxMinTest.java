package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckMaxMinTest {

    @Test
    void maxMin() {
        int[] input = new int[] {1, 2, 3, 4, 5};
        CheckMaxMin.maxMin(input);
        assertArrayEquals(new int[]{5, 1, 4, 2, 3}, input);
    }
}