package b05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleTest {

	@Test
	void IsEvenTrue() {
		Simple simple = new Simple();
		boolean result = simple.isEven(42);

		assertTrue(result);
	}

	@Test
	void IsEvenFalse() {
		Simple simple = new Simple();
		boolean result = simple.isEven(43);

		assertFalse(result);
	}

}
