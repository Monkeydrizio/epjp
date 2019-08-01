package ex;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

class ExTabellaTest {

    @Test
    void testTabella() {
        int a = 7;
        int b = 5;
        int c = 2;
        ExTabella tab1 = new ExTabella();
        tab1.add(c);
        tab1.add(a);
        tab1.add(b);
        Collection<Integer> actual = tab1.getData();
        Collection<Integer> expected = Arrays.asList(2, 5, 7);
        assertEquals(expected, actual);
    }

    @Test
    void testTabellaCheck() {
        ExTabella tab1 = new ExTabella();
        boolean actualChecked = tab1.check(55);
        assertThat(actualChecked, is(false));
    }
}