package Acorn;

import java.util.ArrayList;

public class AcornService {
	
	
	AcornDAO dao = new AcornDAO();
	
	
	public ArrayList<Student> getList() {
		
		ArrayList<Student> student = dao.selectAll();
		
		return student;
		
	}
	

}
