package acorn;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class yaksuTest {

	yaksu yak = new yaksu();
	
	@Test
	void testTest() {
		
		ArrayList<Integer> result = new ArrayList<>();
		result.add(1);
		result.add(2);
		result.add(5);
		result.add(10);
		
		assertEquals(result, yak.test(10));
		//fail("Not yet implemented");
	}

}
