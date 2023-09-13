package Acorn;

import java.io.Closeable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.xml.catalog.CatalogFeatures;

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
		
		
		//sql 실행
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		
		//출력의 결과를 ArrayList에 채우고 있음
		ArrayList<Member> list = new ArrayList<>();
		
		
		try {
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			
			
			while(rs.next()) {
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				
				list.add(new Member(id, pw, name));
				
			} // 명단만큼 받아옴
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		//해제
		close(rs, pst, connection);
		
		return list;
		
	}
	
	// 매서드를 만들 때 가변 인자를 받을 수 있음
	public void close(AutoCloseable ...a) {
		for(AutoCloseable item : a) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		AcornDAO dao = new AcornDAO();
	}

}
