package prj0901;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CafeDAO {
	
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	
	//db 연결
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
	
	
	public void insertMenu(CafeCustomer cc) {
		//db 연결
		Connection con = dbcon();
		//sql 연결
		String sql = "insert into cafetbl values(?,?,?)";
		PreparedStatement pst = null;
		
		try {
			pst = con.prepareStatement(sql);
			pst.setString(1, cc.id);
			pst.setString(2, cc.name);
			pst.setString(3, cc.price);
			
			
			//메뉴 업데이트
			pst.executeUpdate();
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		close( pst, con);
		
	}
	
	
	
	public ArrayList<String> selectAll() {
		//연결
		Connection con = dbcon();
		
		
		//sql
		String sql = "select id from cafetbl";
		
		
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
	
	
	
	public void close(AutoCloseable ...list) {
		 
		
		for( AutoCloseable a : list) {
			try {
				a.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
	}
	
	

	public static void main(String[] args) {
		
		CafeDAO dao = new CafeDAO();
		
		CafeCustomer cc = new CafeCustomer("c004", "메리치즈커피", "7200");
		dao.insertMenu(cc);
		
	}

}
