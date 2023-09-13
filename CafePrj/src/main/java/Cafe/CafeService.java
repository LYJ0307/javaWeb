package Cafe;

import java.util.ArrayList;

public class CafeService {
	
	CafeDAO dao = new CafeDAO();
	
	
	public ArrayList<Cafe> getRealList() {
		
		ArrayList<Cafe> cafe = dao.selectAll();
		
		return cafe;
		
	}
	

}
