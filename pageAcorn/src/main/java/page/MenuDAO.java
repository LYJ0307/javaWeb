package page;

import java.io.Closeable;
import java.lang.reflect.Member;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.tomcat.dbcp.dbcp2.PStmtKey;

import oracle.jdbc.driver.DBConversion;

public class MenuDAO {
	
	String driver = "oracle.jdbc.driver.OracleDriver" ;
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="scott";
	String password="tiger";
	Connection con = null;
	
	
	public Connection dbcon() {
		Connection connection = null;
		
		try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return connection;
		
	}
	
	
	public int getTotalCnt() {
		
		
		Connection connection = dbcon();
		
		String sql = "select count(*) from coffetbl";
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
	
	
	public ArrayList<Menu> selectAll() {
		
		Connection connection = dbcon();
		
		String sql = "select * from coffeetbl";
		
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		
		ArrayList<Menu> list = new ArrayList<>();
		
		
		try {
			pst = connection.prepareStatement(sql);
			rs = pst.executeQuery();
			
			
			while(rs.next()) {
				
				String code = rs.getString(1);
				String name = rs.getString(2);
				String price = rs.getString(3);
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return list;
		
	}
	
	
	public ArrayList<Menu> getListPage(int page, int pageSize) {
		
		int startPage = 5, endPage = 8;
		startPage = ((page-1) * pageSize) + 1;
		endPage = page * pageSize;
		
		
		Connection connection = dbcon();
		PreparedStatement pst = null;
		ResultSet rs = null;
		
		
		String sql = "select * from coffeetbl";
		
		
		System.out.println( sql);
		ArrayList<Menu> list = new ArrayList<>();
		
		try {
			pst = connection.prepareStatement(sql);
			pst.setInt(1, startPage);
			pst.setInt(2, endPage);
			rs = pst.executeQuery();
			
			
			
			while(rs.next()) {

				Menu menu = new Menu(rs.getString(1), rs.getString(2), rs.getString(3));
				list.add(menu);
				
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		close(pst, rs, connection);
		return list;
		
	}
	
	
	
	
	



	private void close(AutoCloseable ...a) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		
		MenuDAO dao = new MenuDAO();
		
		
		ArrayList<Menu> list = dao.getListPage(2, 4);
		System.out.println(list);
		
		//dao.dbCon();
		//*ArrayList<Member> list = dao.getListPage(2,2);
		
		
		

	}

}
