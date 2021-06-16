/**
 * @author n-c0de-r, jonasblome, and joeysmeets
 * @version 12.06.21
 */
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	private CalcEngineString engine;

	@BeforeEach
	void setUp() {

		engine = new CalcEngineString();
	}

	@AfterEach
	void tearDown() {

	}

	@Test
	void test01() {
		engine.buttonPressed("5");
		engine.buttonPressed("+");
		engine.buttonPressed("5");
		engine.equals(10);
		assertEquals("10", engine.getDisplayString());
	}

	@Test
	void test02() {
		engine.buttonPressed("1");
		engine.buttonPressed("+");
		engine.buttonPressed("2");
		engine.buttonPressed("*");
		engine.buttonPressed("3");
		engine.equals(10);
		assertEquals("7", engine.getDisplayString());
	}

	@Test
	void test03() {
		engine.buttonPressed("1");
		engine.buttonPressed("*");
		engine.buttonPressed("2");
		engine.buttonPressed("+");
		engine.buttonPressed("3");
		engine.equals(10);
		assertEquals("5", engine.getDisplayString());
	}

	@Test
	void test04() {
		engine.buttonPressed("(");
		engine.buttonPressed("1");
		engine.buttonPressed("+");
		engine.buttonPressed("2");
		engine.buttonPressed(")");
		engine.buttonPressed("*");
		engine.buttonPressed("3");
		engine.equals(10);
		assertEquals("9", engine.getDisplayString());
	}

	@Test
	void test05() {
		engine.buttonPressed("1");
		engine.buttonPressed("+");
		engine.buttonPressed("2");
		engine.buttonPressed("*");
		engine.buttonPressed("(");
		engine.buttonPressed("3");
		engine.buttonPressed("+");
		engine.buttonPressed("4");
		engine.buttonPressed(")");
		engine.equals(10);
		assertEquals("15", engine.getDisplayString());
	}

	@Test
	void test06() {
		engine.buttonPressed("1");
		engine.buttonPressed("*");
		engine.buttonPressed("2");
		engine.buttonPressed("+");
		engine.buttonPressed("(");
		engine.buttonPressed("3");
		engine.buttonPressed("+");
		engine.buttonPressed("4");
		engine.buttonPressed(")");
		engine.equals(10);
		assertEquals("9", engine.getDisplayString());
	}

	@Test
	void test07() {
		engine.buttonPressed("(");
		engine.buttonPressed("1");
		engine.buttonPressed("+");
		engine.buttonPressed("2");
		engine.buttonPressed(")");
		engine.buttonPressed("*");
		engine.buttonPressed("(");
		engine.buttonPressed("3");
		engine.buttonPressed("+");
		engine.buttonPressed("4");
		engine.buttonPressed(")");
		engine.equals(10);
		assertEquals("21", engine.getDisplayString());
	}

	@Test
	void test08() {
		engine.buttonPressed("1");
		engine.buttonPressed("+");
		engine.buttonPressed("2");
		engine.buttonPressed("*");
		engine.buttonPressed("3");
		engine.buttonPressed("+");
		engine.buttonPressed("4");
		engine.equals(10);
		assertEquals("11", engine.getDisplayString());
	}

	@Test
	void test09() {
		engine.buttonPressed("1");
		engine.buttonPressed("*");
		engine.buttonPressed("2");
		engine.buttonPressed("+");
		engine.buttonPressed("3");
		engine.buttonPressed("*");
		engine.buttonPressed("4");
		engine.equals(10);
		assertEquals("14", engine.getDisplayString());
	}

	@Test
	void test10() {
		engine.buttonPressed("1");
		engine.buttonPressed("*");
		engine.buttonPressed("(");
		engine.buttonPressed("2");
		engine.buttonPressed("+");
		engine.buttonPressed("3");
		engine.buttonPressed(")");
		engine.buttonPressed("+");
		engine.buttonPressed("4");
		engine.equals(10);
		assertEquals("9", engine.getDisplayString());
	}

	@Test
	void test11() {
		engine.buttonPressed("1");
		engine.buttonPressed("*");
		engine.buttonPressed("2");
		engine.buttonPressed("*");
		engine.buttonPressed("3");
		engine.buttonPressed("+");
		engine.buttonPressed("4");
		engine.buttonPressed("+");
		engine.buttonPressed("5");
		engine.equals(10);
		assertEquals("15", engine.getDisplayString());
	}

	@Test
	void test12() {
		engine.buttonPressed("1");
		engine.buttonPressed("+");
		engine.buttonPressed("2");
		engine.buttonPressed("+");
		engine.buttonPressed("3");
		engine.buttonPressed("*");
		engine.buttonPressed("4");
		engine.buttonPressed("*");
		engine.buttonPressed("5");
		engine.equals(10);
		assertEquals("63", engine.getDisplayString());
	}

	@Test
	void test13() {
		engine.buttonPressed("1");
		engine.buttonPressed("+");
		engine.buttonPressed("2");
		engine.buttonPressed("+");
		engine.buttonPressed("3");
		engine.buttonPressed("*");
		engine.buttonPressed("4");
		engine.buttonPressed("*");
		engine.buttonPressed("5");
		engine.buttonPressed("+");
		engine.buttonPressed("6");
		engine.buttonPressed("+");
		engine.buttonPressed("7");
		engine.equals(10);
		assertEquals("76", engine.getDisplayString());
	}

	@Test
	void test14() {
		engine.buttonPressed("1");
		engine.buttonPressed("*");
		engine.buttonPressed("2");
		engine.buttonPressed("*");
		engine.buttonPressed("3");
		engine.buttonPressed("+");
		engine.buttonPressed("4");
		engine.buttonPressed("+");
		engine.buttonPressed("5");
		engine.buttonPressed("*");
		engine.buttonPressed("6");
		engine.buttonPressed("*");
		engine.buttonPressed("7");
		engine.equals(10);
		assertEquals("220", engine.getDisplayString());
	}

	@Test
	void test15() {
		engine.buttonPressed("1");
		engine.buttonPressed("+");
		engine.buttonPressed("2");
		engine.buttonPressed("*");
		engine.buttonPressed("3");
		engine.buttonPressed("*");
		engine.buttonPressed("4");
		engine.buttonPressed("+");
		engine.buttonPressed("5");
		engine.buttonPressed("+");
		engine.buttonPressed("6");
		engine.buttonPressed("*");
		engine.buttonPressed("7");
		engine.equals(10);
		assertEquals("72", engine.getDisplayString());
	}
}
