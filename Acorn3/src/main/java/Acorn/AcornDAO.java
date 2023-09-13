package Acorn;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AcornDAO {
	
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	
	public Connection dbcon() {	
		Connection con = null;		 
			try {
				Class.forName(driver);
				con =DriverManager.getConnection(url, user, password);				
				if( con != null) System.out.println("ok");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
		return con;
	}
	
	
	public ArrayList<Member> selectAll() {
		
		//연결
		Connection connection = dbcon();
		
		//sql
		String sql = "select * from acorntbl";
		
		
		//sql 연결
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		
		//출력의 정보를 ArrayList에 저장
		ArrayList<Student> list = new ArrayList<>();
		
		try {
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
