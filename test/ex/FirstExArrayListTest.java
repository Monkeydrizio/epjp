package ex;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class FirstExArrayListTest {

    @Test
    void testMergingArrayListSorted1() {
        Integer[] a = { 1, 3, 8 };
        Integer[] b = { 2, 6, 10 };
        ArrayList<Integer> actual = FirstExArrayList.merge(a, b);
        ArrayList<Integer> expected = new ArrayList<Integer>();
        List<Integer> cList = Arrays.asList(1, 2, 3, 6, 8, 10);
        expected.addAll(cList);
        assertEquals(expected, actual);
    }

}
