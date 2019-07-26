package ex;

public class S54 {
	/**
	 * Check if the parameter is positive, negative, or zero
	 * 
	 * @param value
	 *            an integer
	 * @return "positive", "negative", or "zero"
	 */
	public static String checkSign(int value) {
		if (value < 0) {
			return "negative";
		} else if (value == 0) {
			return "zero";
		} else {
			return "positive";
		}
	}

	/**
	 * Check if the parameter is odd
	 * 
	 * @param value
	 *            an integer
	 * @return "odd" or "even"
	 */
	public static boolean isOdd(int value) {
		if (value % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Convert the parameter to its English name, if it is in [0..9]
	 * 
	 * @param value
	 *            an integer
	 * @return "zero" for 0 ... "nine" for 9, or "other"
	 */
	public static String asWord(int value) {
		String result;
		switch (value) {
		case 0:
			result = "zero";
			break;
		case 1:
			result = "one";
			break;
		case 2:
			result = "two";
			break;
		case 3:
			result = "three";
			break;
		case 4:
			result = "four";
			break;
		case 5:
			result = "five";
			break;
		case 6:
			result = "six";
			break;
		case 7:
			result = "seven";
			break;
		case 8:
			result = "eight";
			break;
		case 9:
			result = "nine";
			break;

		default:
			result = "other";
			break;
		}
		return result;
	}

	/**
	 * Convert a value in the interval [0, 100] to a letter in [A, F]
	 * 
	 * A if value > 90 B if value in (80, 90] ... F if value <= 50
	 * 
	 * @param percentile
	 *            in [0, 100]
	 * @return a letter in [A, F]
	 */
	public static char vote(double percentile) {

		if (percentile >= 0 && percentile <= 50) {
			return 'F';
		} else if (percentile > 50 && percentile <= 60) {
			return 'E';
		} else if (percentile > 60 && percentile <= 70) {
			return 'D';
		} else if (percentile > 70 && percentile <= 80) {
			return 'C';
		} else if (percentile > 80 && percentile <= 90) {
			return 'B';
		} else // if (percentile > 90)
		{
			return 'A';
		}

	}

	/**
	 * Leap year checker
	 * 
	 * @param year
	 * @return true if leap year
	 */
	public static boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
	}

	/**
	 * Sort the input parameters
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return a sorted array
	 */
	
	public static int[] sort(int a, int b, int c) {
		int[] result = new int[3];
		result[2] = Math.max(Math.max(a, b),c);
		result[0] = Math.min(Math.min(a,b),c);
		result[1] = a + b + c - result[2] - result[0];			
		return result;
	
}
}