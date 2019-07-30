package ex;

public class S55 {

    /**
     * Add up all the numbers in the passed closed interval
     * 
     * @param first
     *            the left limit
     * @param last
     *            the right limit
     * @return the sum of all the numbers, or zero
     */

    public static long sum(int first, int last) {
        long sum = 0;
        if (first <= last) {
            for (int i = first; i <= last; i++) {
                sum = sum + i;
            }
            return sum;
        } else {
            return sum = 0;

        }

    }

    public static long sumEx(int first, int last) throws Exception { // Version with exception
        if ((first >= last)) {
            throw new Exception("You're stupid mate, the first number is bigger than the last one");
        }
        return sum(first, last);
    }

    /**
     * Add up only the even numbers in the passed closed interval
     * 
     * @param first
     *            the left limit
     * @param last
     *            the right limit
     * @return the sum of all the even numbers, or zero
     */

    public static long evenSum(int first, int last) {
        long sum = 0;
        if (first <= last) {
            for (int i = first; i <= last; i++) {
                if (i % 2 == 0) {
                    sum = sum + i;
                }
            }
            return sum;
        } else {
            return sum = 0;

        }
    }

    /**
     * Factorial
     * 
     * @param value
     * @return factorial of input value, or zero
     */

    public static long factorial(int value) {
        long fact = 1;
        if (value >= 0 && value <= 30) {
            for (int i = 1; i <= value; i++) {
                fact = fact * i;
            }
            return fact;
        } else {
            return fact = 0;
        }
    }

    public static long factorialEx(int value) throws Exception { // Version with exception
        long fact = 1;
        if (value <= 0) {
            throw new Exception("You're stupid mate, I am not able to calculate factorial of a negative numb");
        }
        if (value >= 30) {
            throw new Exception("Sorry mate, the number is huge for my limited resources");
        }
        for (int i = 1; i <= value; i++) {
            fact = fact * i;
        }
        return fact;
    }

    /**
     * Fibonacci number (0, 1, 1, 2, 3, 5, 8, …)
     * 
     * @param value
     * @return the Fibonacci number of value, or zero
     */

    public static long fibonacci(int value) {
        long requested = 0;
        long previous1;
        long previous2;
        if (value == 0) {
            requested = 0;
        } else if (value == 1) {
            requested = 1;
        } else if (value >= 2) {
            previous1 = 1;
            previous2 = 0;
            for (int i = 3; i <= value; i++) {
                requested = previous1 + previous2; // a i=3: 1+0=1 a i=4 1+1=2
                previous2 = previous1; // p2 = 1 p2 = 1
                previous1 = requested; // p1 = 1 p1 = 2
            }
            return requested;
        }
        return requested;
    }

    /**
     *
     * Multiplication table
     * 
     * @param value
     * @return The multiplication table for value, when possible
     */

    public static int[][] multiplicationTable(int value) {
        int[][] result = new int[value + 1][value + 1];
        for (int i = 0; i <= value; i++) {
            for (int j = 0; j <= value; j++) {
                result[i][0] = i;
                result[0][i] = i;
                result[i][i] = i * i;
                result[i][j] = i * j;
            }
        }
        return result;
    }
}
