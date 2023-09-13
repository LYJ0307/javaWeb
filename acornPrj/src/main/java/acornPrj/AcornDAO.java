package acornPrj;

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
	
	public ArrayList<String> selectAll() {
		//연결
		Connection con = dbcon();	
		
		//sql
		String sql = "select name from acorntbl";
		
		
		//sql 실행
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		// 출력의 결과를 ArrayList에 채우고 있음
		ArrayList<String> list = new ArrayList<>();
		
		
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			
			while( rs.next()) {
				list.add(rs.getString(1));
			} // 명단만큼 받아옴
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//해제
		close(rs, pst, con);
		
		return list;
	}
	
	
	public ArrayList<Member> selectAll2() {
		//연결
		Connection con = dbcon();	
		
		//sql
		String sql = "select * from acorntbl";
		
		
		//sql 실행
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		// 출력의 결과를 ArrayList에 채우고 있음
		ArrayList<Member> list = new ArrayList<>();
		
		
		try {
			pst = con.prepareStatement(sql);
			rs = pst.executeQuery();
			
			
			while( rs.next()) {
				
				String id = rs.getString(1);
				String pw = rs.getString(2);
				String name = rs.getString(3);
				
				list.add( new Member(id, pw, name));
			} // 명단만큼 받아옴
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		//해제
		close(rs, pst, con);
		
		return list;
	}
	
	
	
	
	
	public Member selectOne( String id) {
		//db연결
		
		Connection con = dbcon();
		
		//sql
		String sql = " select * from acorntbl where id = ? ";
		PreparedStatement pst = null;
		ResultSet rs = null;
		Member c = null;
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, id);
			
			//sql실행
			//sql실행한 결과 Customer 객체로 만들기

			
			rs = pst.executeQuery();
			
			
			if (rs.next()) {
				String id_tmp = rs.getString(1);
				String pw_tmp = rs.getString(2);
				String name_tmp = rs.getString(3);
				c = new Member( id_tmp, pw_tmp, name_tmp);
				return c;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//자원해제
		
		close( rs, pst, con);
		return c;
	}
	
	
	
	
	
	
	
	
	
	// 매서드를 만들 때 가변 인자를 받을 수 있음
	public void close( AutoCloseable ...a) {
		for( AutoCloseable item : a) {
			try {
				item.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
		}
	}
	

	
	
	
	public static void main(String[] args) {
		AcornDAO dao = new AcornDAO();
		ArrayList<String> list = dao.selectAll();
		System.out.println( list);
		Member m = dao.selectOne("dy");
		System.out.println( m);
		
		ArrayList<Member> members = dao.selectAll2();
		
	
		System.out.println( members);
	
		
		
		
	}
	
	
	
}
	


