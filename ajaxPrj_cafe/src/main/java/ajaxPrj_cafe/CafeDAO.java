package ajaxPrj_cafe;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CafeDAO {
	
	  String driver = "oracle.jdbc.driver.OracleDriver" ;
	  String url="jdbc:oracle:thin:@localhost:1521:xe";
	  String user="scott";
	  String password="tiger";
	  
	  
	  public Connection dbcon() {
		  
		  Connection connection = null;
		  
		  try {
			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			if (connection != null) System.out.println("ok");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
		return connection;
		  
	  }
	  
	  
	  public ArrayList<Cafe> getCafeList() {
		  
		  Connection connection = dbcon();
		  String sql = "select * from cafetbl";
		  ArrayList<Cafe> list = new ArrayList<>();
		  
		  try {
			PreparedStatement pst = connection.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				String id = rs.getString(1);
				String name = rs.getString(2);
				int price = rs.getInt(3); 
				
				
				Cafe cafe = new Cafe(id, name, price);
				list.add(cafe);
			
				
			}
			
			rs.close();
			pst.close();
			connection.close();
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		  
		 
		  
		return list;
		  
	  }
	  
	  
	  public static void main(String[] args) {
		  CafeDAO c = new CafeDAO();
		  ArrayList<Cafe> list = c.getCafeList();
		  System.out.println(list);
	  }
	  

}
