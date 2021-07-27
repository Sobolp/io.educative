package arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalsTest {
    ArrayList<Pair> expected;
    ArrayList<Pair> input;

    @BeforeEach
    void setUp() {
        input = new ArrayList<>();
        input.add(new Pair(1, 5));
        input.add(new Pair(3, 7));
        input.add(new Pair(4, 6));
        input.add(new Pair(6, 8));
        input.add(new Pair(9, 12));

        expected = new ArrayList<>();
        expected.add(new Pair(1, 8));
        expected.add(new Pair(9,12));

    }

    @Test
    void mergeIntervalsTest() {
        ArrayList<Pair> result = MergeIntervals.mergeIntervals(input);
        assertEquals(expected.size(), result.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), result.get(i));
        }
    }
}