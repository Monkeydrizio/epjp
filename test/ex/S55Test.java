package ex;

import static org.junit.jupiter.api.Assertions.*;
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
    void multiplicationTable() {
        fail("Not yet implemented");
    }
}
