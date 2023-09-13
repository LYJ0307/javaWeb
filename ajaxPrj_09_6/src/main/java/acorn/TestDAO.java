package acorn;

import java.lang.reflect.Member;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class TestDAO {
	
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	
	
	public Connection dbcon() {
		Connection con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return con;
		
	}
	
	/*
	public ArrayList<Member> getMemberList() {
		
	}
	*/
	
	/*
	 * public Member selectOne( String id) {
	 * 
	 *
	 * }
	 * 
	 * 
	 * */
	
	
	public String selectOne( String id) {
		
		String name = "";
		Connection con = dbcon();
		String sql = "select name from acorntbl where id = ? " ;
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, id);
			ResultSet rs = pst.executeQuery();
			
			
			if (rs.next()) {
				name = rs.getString(1);
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return name;
		
	}
	
	
	
	public static void main(String[] args) {
		
		
		TestDAO dao = new TestDAO();
		//Connection connection = dao.dbcon();
		//if (connection != null) System.out.println("db ok");
		
		
		String name = dao.selectOne("yj2");
		System.out.println( name);
		
		
	}
	
	

}
