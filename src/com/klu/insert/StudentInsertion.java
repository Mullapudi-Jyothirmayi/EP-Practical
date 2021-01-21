package com.klu.insert;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.klu.Bean.StudentBean;
import com.klu.Connections.DBUtil;

@SuppressWarnings("unused")
public class StudentInsertion {
	public static int StudentInsert(StudentBean student) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		//prepared statement
		PreparedStatement st=con.prepareStatement("insert into Student values(?,?)");
		st.setInt(1,StudentBean.getRegno());
		st.setString(2,StudentBean.getName());
		int i=st.executeUpdate();
		con.close();
		return i;
	}
	
	public static int StudentDelete(StudentBean student) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		//prepared statement
		PreparedStatement st=con.prepareStatement("delete from Student where emp_id=?");
		st.setInt(1,103);
		int j=st.executeUpdate();
		con.close();
		return j;
	}
	
	public static int StudentUpdate(StudentBean student) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		//prepared statement
		PreparedStatement st=con.prepareStatement("update Student set emp_name=? where emp_id=?");
		st.setString(1, "Satyadeep");
		st.setInt(2, 106);
		int k=st.executeUpdate();
		con.close();
		return k;
	}
	
	public static ResultSet StudentDisplay(StudentBean student) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		//prepared statement
		PreparedStatement st=con.prepareStatement("select * from Student");
		ResultSet m=st.executeQuery();
		while(m.next()) {
			System.out.println(m.getInt(1)+" "+m.getString(2));
		}
		con.close();
		return m;
	}

}

