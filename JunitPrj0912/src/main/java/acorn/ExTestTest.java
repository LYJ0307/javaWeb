package acorn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExTestTest {
	
	ExTest test = new ExTest();

	@Test
	void testAdd() {
		
		assertEquals(8, test.add(3,5));
		//fail("Not yet implemented");
	}

}
