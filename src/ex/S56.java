package ex;

public class S56 {

    /**
     * Reverse a string
     * 
     * @param s
     * @return the input reversed
     */

    public static String reverse(String s) {

        StringBuilder sb = new StringBuilder(s);
        StringBuilder sb1 = sb.reverse();
        String sfinal = sb1.toString();
        return sfinal;
    }

    /**
     * Check if the parameter is a palindrome
     * 
     * @param s
     * @return true if the parameter is a palindrome
     */

    public static boolean isPalindrome(String s) {

        return s.equals(S56.reverse(s));
    }

    /**
     * Remove vowels from the parameter
     * 
     * @param s
     * @return a string, same of input but without vowels
     */

    public static String removeVowels(String s) {

        StringBuilder sb = new StringBuilder(s);
        StringBuilder sbnv = new StringBuilder();
        for (int i = 0; i <= s.length() - 1; i++) {
            if (sb.charAt(i) != 'a' && sb.charAt(i) != 'e' && sb.charAt(i) != 'i' && sb.charAt(i) != 'o'
                    && sb.charAt(i) != 'u') {
                sbnv.append(sb.charAt(i)); // non posso utilizzare il setCharAt perchè sbnv era vuoto e il setCharAt va
                                           // solo su elementi già esistenti. Con l'append il problema è risolto.
            }
        }
        return sbnv.toString();
    }

    /**
     * Convert from binary to decimal
     * 
     * @param s
     *            a string that contains the binary representation of an integer
     * @return the converted integer
     */

    public static int bin2dec(String s) {

        StringBuilder sb = new StringBuilder(s);
        Double dec = new Double(0);
        for (int i = 0; i <= s.length() - 1; i++) {
            if (sb.reverse().charAt(i) == '0') {
                dec = dec + 0;
            } else if (sb.reverse().charAt(i) == '1') {
                dec = dec + Math.pow(2, i);
            }

        }
        return dec.intValue();
    }

    /**
     * Reverse an array of integers
     * 
     * @param data
     * @return a new array holding the same elements of input, in reversed order
     */

    public static int[] reverse(int[] data) {
        int[] result = new int[data.length];
        for (int i = 0; i <= data.length - 1; i++) {
            result[i] = data[data.length - 1 - i];
        }
        return result;
    }

    /**
     * Calculate the average
     * 
     * @param data
     * @return the average
     */

    public static double average(int[] data) {
        int result = 0;
        for (int i = 0; i <= data.length - 1; i++) {
            result = result + data[i];
        }
        result = result / data.length;
        return result;
    }

    /**
     * Find the largest value
     * 
     * @param data
     * @return the largest value
     */

    public static int max(int[] data) {
        int max = 0;
        for(int i = 0; i<=data.length-1; i++ ) {
            max = Math.max(max, data[i]);
        }
        return max;
    }
}
