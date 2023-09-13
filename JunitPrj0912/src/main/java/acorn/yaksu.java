package acorn;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class yaksu {
	

	ArrayList<Integer> list = new ArrayList<>();
	
	@Test
	public ArrayList<Integer> test(int a) {
		
		
		for(int i=1; i<=a; i++) {
			if (a % i == 0) {
				list.add(i);
			}
		}
		
		return list;
		
	}

}
