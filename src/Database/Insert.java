package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class Insert {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://127.0.0.1:3306/animalhw"; 
		String sql = "INSERT INTO animal (id, happenDT, happenPlace, kindCd, colorCd, age, weight, noticeNo, "
				+ "popfile, processState, sexCd, careTel, careAddr, chargeNm, officetel) "
				+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);"; 
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, "root", "shinjaemin98@");
			PreparedStatement stmt = con.prepareStatement(sql);
			
	
			stmt.setInt(1, 2);
			stmt.setString(2, "20211231");
			stmt.setString(3, "공주시 우금티터널");
			stmt.setString(4, "[개] 믹스견");
			stmt.setString(5, "갈색");
			stmt.setInt(6, 2019);
			stmt.setInt(7, 5);
			stmt.setString(8, "충남-공주-2022-00001");
			stmt.setString(9, "http://www.animal.go.kr/files/shelter/2021/12/202201041101258.png");
			stmt.setString(10, "종료(반환)");
			stmt.setString(11, "M");
			stmt.setInt(12, 041-853-7575);
			stmt.setString(13, "충청남도 공주시 감영길 7 (반죽동)  ");
			stmt.setString(14,"축산유통팀");
			stmt.setInt(15, 041-840-8580);

			
			//add to table
			int result = stmt.executeUpdate();
			System.out.println("result: "+result);
			
			stmt.close();
			con.close();
			
		}catch(SQLException se) {
			se.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}