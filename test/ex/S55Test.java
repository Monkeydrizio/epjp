package ex;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class S55Test {

    @Test
    void sumPositive() {
        long actual = S55.sum(1, 3);

        assertThat(actual, is(6L));
    }

    @Test
    void sumNegPos() {
        long actual = S55.sum(-3, 3);

        assertThat(actual, is(0L));
    }

    @Test
    void sumSingle() {
        long actual = S55.sum(1003, 1003);

        assertThat(actual, is(1003L));
    }

    @Test
    void sumEmpty() {
        long actual = S55.sum(1003, 1002);

        assertThat(actual, is(0L));
    }

    @Test
    void evenSumPositive() {
        long actual = S55.evenSum(1, 3);

        assertThat(actual, is(2L));
    }

    @Test
    void evenSumNegPos() {
        long actual = S55.evenSum(-3, 3);

        assertThat(actual, is(0L));
    }

    @Test
    void evenSumSingle() {
        long actual = S55.evenSum(1002, 1002);

        assertThat(actual, is(1002L));
    }

    @Test
    void evenSumEmpty() {
        long actual = S55.evenSum(1003, 1002);

        assertThat(actual, is(0L));
    }

    @Test
    void factorialFour() {
        long actual = S55.factorial(4);

        assertThat(actual, is(24L));
    }

    @Test
    void factorialZero() {
        long actual = S55.factorial(0);

        assertThat(actual, is(1L));
    }

    @Test
    void factorialNegative() {
        long actual = S55.factorial(-4);

        assertThat(actual, is(0L));
    }

    @Test
    void fibonacciZero() {
        long actual = S55.fibonacci(-3);

        assertThat(actual, is(0L));
    }

    @Test
    void fibonacciQuarto() {
        long actual = S55.fibonacci(4);

        assertThat(actual, is(2L));
    }

    @Test
    void fibonacciQuinto() {
        long actual = S55.fibonacci(5);

        assertThat(actual, is(3L));
    }

    @Test
    void fibonacciSettimo() {
        long actual = S55.fibonacci(7);

        assertThat(actual, is(8L));
    }

    @Test
    void multiplicationTable() {
        
        int[][] expected = {{ 0, 1, 2, 3, 4, 5 },
                            { 1, 1, 2, 3, 4, 5 },
                            { 2, 2, 4, 6, 8, 10 },
                            { 3, 3, 6, 9, 12, 15 },
                            { 4, 4, 8, 12, 16, 20 },
                            { 5, 5, 10, 15, 20, 25 }};
        
        int[][] actual = S55.multiplicationTable(5);
        
        assertThat(actual, is(expected));
    }
    
    @Test
    void multiplicationTableZero() {
        
        int[][] expected = {{ 0 },
                           };
        
        int[][] actual = S55.multiplicationTable(0);
        
        assertThat(actual, is(expected));
    }
}
