package Movie;

import java.sql.Connection;
import java.sql.DriverManager;

public class MovieDAO {
	
	  String driver = "oracle.jdbc.driver.OracleDriver" ;
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
		}
		  
		  return con;
	  }
	  
}
