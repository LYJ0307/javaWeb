package Acorn;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	
	public ArrayList<Student> selectAll() {
		
		//연결
		Connection connection = dbcon();
		Connection connection2 = dbcon();
		
		//sql
		String sql = "select * from acorntbl";
		
		
		//sql실행
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		
		ArrayList<Student> list = new ArrayList<>();
		
		try {
			pst=connection.prepareStatement(sql);
			rs=pst.executeQuery();
			
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				
				list.add(new Student(id, pw, name));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		close(pst, rs, con);
		
		return list;
		
	}
	
	
	public void close(AutoCloseable ...a) {
		
		
		for(AutoCloseable item : a) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
	}

}
