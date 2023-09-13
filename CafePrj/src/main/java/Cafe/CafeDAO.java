package Cafe;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CafeDAO {
	
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
	
	
	
	public ArrayList<Cafe> selectAll() {
		
		//연결
		Connection connection = dbcon();
		
		
		//sql
		String sql = "select * from cafetbl";
		
		
		//sql 실행
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		
		//출력의 결과를 ArrayList에 채움
		ArrayList<Cafe> list = new ArrayList<>();
		
		
		try {
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				int price = rs.getInt(3);
				
				
				list.add(new Cafe(id, pw, price));
				//명단만큼 받아옴
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//해제
		close(rs, pst, connection);
		
		
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
	
	
	public static void main(String[] args) {
		CafeDAO dao = new CafeDAO();
		ArrayList<Cafe> list = dao.selectAll();
		System.out.println( list);
	}

}
