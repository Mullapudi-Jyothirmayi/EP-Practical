package lab_6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Account {
	public int Insert(Bean eb) throws ClassNotFoundException,SQLException{
		Connection con=DBUtil.DBConnection();
		String sql="insert into lab6 values(?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,eb.getFirstname());
		ps.setString(2,eb.getLastname());
		ps.setString(3,eb.getEmail());
		ps.setString(4,eb.getPassword());
		int i=ps.executeUpdate();
		return i;
		
	}
	
	public static boolean Login(Bean eb) throws ClassNotFoundException,SQLException{
		boolean status=false;  
		try{  
		Connection con=DBUtil.DBConnection();
		String sql="select * from lab6 where email=? and password=?";
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setString(1,eb.getEmail());
		ps.setString(2,eb.getPassword());
		ResultSet rs =ps.executeQuery();
		status = rs.next();
		}
		catch(Exception e){}  
		  
		return status;  
		  
		}  
		
	}