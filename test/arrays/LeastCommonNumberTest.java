package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeastCommonNumberTest {

    @Test
    void findLeastCommonNumberTest() {
        assertEquals(6, LeastCommonNumber.findLeastCommonNumber(new int[]{0,6,7,10,25,30,}, new int[]{0,4,5,6,7}, new int[]{1,6,10,14}));
    }
}