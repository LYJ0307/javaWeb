package Acorn;

import java.util.ArrayList;

public class AcornService {
	
	
	AcornDAO dao = new AcornDAO();

	public ArrayList<Member> getMemberRealList() {
		// TODO Auto-generated method stub
		
		ArrayList<Member> members = dao.selectAll();
		
		return members;
	}
	
	
	

}
