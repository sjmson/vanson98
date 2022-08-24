package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Connect {

	public static void main(String[] args) throws ClassNotFoundException {
		
		String url = "jdbc:mysql://127.0.0.1:3306/animalhw"; 
		
		String sql = "SELECT * FROM animal"; 
		
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		String ID="root";
		String PASS="shinjaemin98@";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, ID, PASS);
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			rs.next();
			String id = rs.getString("id");
			System.out.println("id:"+id);
			
			rs.close();
			st.close();
			con.close();
			
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}