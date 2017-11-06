import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void fibonacciDirect() throws Exception {
        assertEquals(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55), Solution.fibonacci(1, 1, 10));
    }

    @Test
    public void fibonacciReversed() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
        assertEquals(Arrays.asList(55, 34, 21, 13, 8, 5, 3, 2, 1, 1), Solution.reverseOrder(arrayList));
    }

    @Test
    public void fibonacciDirectNotEquals() throws Exception {
        assertNotEquals(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55), Solution.fibonacci(0, 1, 10));
    }

    @Test
    public void fibonacciReversedNotEquals() throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55);
        assertNotEquals(Arrays.asList(1, 1, 2, 3, 5, 8, 13, 21, 34, 55), Solution.reverseOrder(arrayList));
    }
}