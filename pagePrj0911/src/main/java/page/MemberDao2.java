package page;

import java.io.Closeable;
import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.tomcat.dbcp.dbcp2.PStmtKey;
import org.apache.tomcat.util.security.KeyStoreUtil;

public class MemberDao2 {
	
	
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	
	public Connection dbcon() {		 
		Connection con = null;
		try {
			Class.forName(driver);
			con =DriverManager.getConnection(url, user, password);
			if( con != null) System.out.println( "ok");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;		 	
	}
	
	
	public int getTotalCnt() {
		
		
		Connection connection = dbcon();
		
		String sql = "select count(*) from member_tbl_11";
		int totalCnt = 0;
		
		
		PreparedStatement pst;
		try {
			pst = connection.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			
			if(rs.next()) {
				totalCnt = rs.getInt(1);
			}
			
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		//close();
		return totalCnt;
		
	}
	
	
	public ArrayList<Member> selectAll() {
		Connection connection = dbcon();
		
		String sql = "select * from member_tbl_11";
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		
		ArrayList<Member> list = new ArrayList<>();
		
		
		try {
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			
			while(rs.next()) {
				String m_id = rs.getString(1);
				String m_pw = rs.getString(2);
				String m_name = rs.getString(3);
				String m_tel = rs.getString(4);
				String m_birthday = rs.getString(5);
				int m_point = rs.getInt(6);
				String m_grade = rs.getString(7);
				Member member = new Member(m_id, m_pw, m_name, m_tel, m_birthday, m_point, m_grade);
				list.add(member);
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	
	//현재 페이지에 대한 목록 가져오기
	//입력: int page, int pageSize  (현재 페이지 번호, 페이지 size 크기)
	//반환: ArrayList<Member>		   (고객목록)
	
	
	public ArrayList<Member> getListPage(int page, int pageSize) {
		// PageSize = 4 한 페이지에 보일 글의 수: 4라고 했을 때
		// 1 =>			(1~4)
		// 2 =>			(5~8)
		
		int startPage = 5, endPage = 8;
		startPage = ((page-1) * pageSize) + 1;
		endPage = page * pageSize;
		
		Connection connection = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		String sql = " select * "
				 + " from (select rownum num, m_id, m_pw, m_name, m_tel, m_birthday, m_point, m_grade "
				 + " from member_tbl_11) "
				 + "where num between ? and ?";
		
		
		System.out.println( sql);
		ArrayList<Member> list = new ArrayList<>();
		
		
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, startPage);
			pst.setInt(2, endPage);
			rs = pst.executeQuery();
			
			
			while(rs.next()) {
				String m_id = rs.getString(2);
				String m_pw = rs.getString(3);
				String m_name = rs.getString(4);
				String m_tel = rs.getString(5);
				String m_birthday = rs.getString(6);
				int m_point = rs.getInt(7);
				String m_grade = rs.getString(8);
				Member member = new Member(m_id, m_pw, m_name, m_tel, m_birthday, m_point, m_grade);
				list.add(member);
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		close(pst, rs, connection);
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
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		
		MemberDao2 dao = new MemberDao2();
	
		if (dao.dbcon() != null) System.out.println("ok");
		
		
		//ArrayList<Member> list = dao.selectAll();
		//System.out.println( list);
		
		
		//int result = dao.getTotalCnt();
		//System.out.println( result);
		
		
		ArrayList<Member> list2 = dao.getListPage(2, 4);
		System.out.println( list2);

		
		
	}
	
	

}
