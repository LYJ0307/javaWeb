package acorn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AcornDAOTest {
	
	
	AcornDAO dao = new AcornDAO();

	@Test
	void testInsert2() {
		//fail("Not yet implemented");
		int result = dao.insert2(new Customer("zz", "1234", "test"));
		assertEquals(1, result);
	}

}
