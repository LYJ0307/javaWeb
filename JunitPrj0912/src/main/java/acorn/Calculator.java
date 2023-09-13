package acorn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calculator {
	
	ExTest test = new ExTest();

	@Test
	void testAdd() {
		assertEquals(10, test.add(5,5));
		//fail("Not yet implemented");
	}

	@Test
	void testSub() {
		assertEquals(5, test.sub(10, 5));
		//fail("Not yet implemented");
	}

	@Test
	void testMulti() {
		assertEquals(15, test.multi(3, 5));
		//fail("Not yet implemented");
	}

	@Test
	void testDivide() {
		//앞쪽에 있는 값이 결과값
		assertEquals(4, test.divide(20, 5));
		//fail("Not yet implemented");
	}

}
