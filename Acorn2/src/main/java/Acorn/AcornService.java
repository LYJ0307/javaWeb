package Acorn;

import java.util.ArrayList;

public class AcornService {
	
	AcornDAO dao = new AcornDAO();
	
	
	public ArrayList<Member> getList() {
		
		
		ArrayList<Member> members = dao.selectAll();
		
		return members;
	}

}
