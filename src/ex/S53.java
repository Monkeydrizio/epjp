package ex;

public class S53 {
	/**
	 * Average speed
	 * 
	 * @param distance
	 *            in meters
	 * @param time
	 *            in seconds
	 * @return speed in meters per second
	 */

	public static double speed(double distance, double time) {
		// TODO //crea un marker di roba da fare
		double speed = (distance / time);
		return speed;
	}

	/**
	 * Distance between (x0, y0) and (x1, y1)
	 * 
	 * @param x0
	 *            first point x
	 * @param y0
	 *            first point y
	 * @param x1
	 *            second point x
	 * @param y1
	 *            second point y
	 * @return distance
	 */
	public static double distance(int x0, int y0, int x1, int y1) {
		double distance = Math.sqrt((Math.pow(y1 - y0, 2) + (Math.pow(x1 - x0, 2))));
		return distance;
	}

	/**
	 * Engine capacity
	 * 
	 * @param bore
	 * @param stroke
	 * @param nr
	 *            number of cylinders
	 * @return the engine capacity
	 */
	public static double engineCapacity(double bore, double stroke, int nr) {
		double sez = (Math.PI * (Math.pow(bore / 2, 2)));
		double volucilinder = sez * stroke;
		double volutot = volucilinder * nr; // mm^3
		return volutot / 1000; // cm^3
	}

	// somma delle cifre in un numero
	/**
	 * Add up all the digits in an integer
	 * 
	 * @param value
	 * @return sum of digits
	 */
	public static int digitSum(int value) {
		String valuest = String.valueOf(Math.abs(value));
		int dim = valuest.length();
		int result = 0;
		for (int i = 0; i < dim; i++) {
			if (valuest.charAt(i) >= '0' && valuest.charAt(i) <= '9') {
				result = result + valuest.charAt(i) - '0';
			}
		}
		return result;
	}
}
