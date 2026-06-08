package de.cas.mse.exercise.diamond;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DiamondTest {

	@Test
	public void diamond3_shouldPrint() {
		StringBuffer expected = new StringBuffer();
		expected.append(" *\n");
		expected.append("***\n");
		expected.append(" *\n");

		String actual = new Diamond().generateStringOrNull(3);
		assertEquals(expected.toString(), actual);
		System.out.println(actual);
	}

	@Test
	public void diamond5_shouldPrint() {
		StringBuffer expected = new StringBuffer();
		expected.append("  *\n");
		expected.append(" ***\n");
		expected.append("*****\n");
		expected.append(" ***\n");
		expected.append("  *\n");

		String actual = new Diamond().generateStringOrNull(5);
		assertEquals(expected.toString(), actual);
		System.out.println(actual);
	}

	@Test
	public void diamond0_shouldReturnNull() {
		assertEquals(null, new Diamond().generateStringOrNull(0));
	}

	@Test
	public void diamondNegative_shouldReturnNull() {
		assertEquals(null, new Diamond().generateStringOrNull(-1));
	}

	@Test
	public void diamondEven_shouldReturnNull() {
		assertEquals(null, new Diamond().generateStringOrNull(10));
	}
}
