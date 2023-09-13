package Acorn;

import java.io.DataOutput;
import java.util.ArrayList;

public class AcornService {
	
	
	AcornDAO dao = new AcornDAO();
	
	
	public ArrayList<Member> getMemberRealList() {
		
		ArrayList<Member> members = dao.selectAll();
		return members ;
		
	}

}
