package com.supermarket.crud;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.supermarket.Bean.SuperMarketBean;
import com.supermarket.connections.DBUtil;

@SuppressWarnings("unused")
public class SuperMarketCRUD {
	public static int Insert(SuperMarketBean supermarket) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		//prepared statement
		PreparedStatement st=con.prepareStatement("insert into sales values(?,?,?)");
		st.setInt(1,SuperMarketBean.getitemid());
		st.setString(2,SuperMarketBean.getitemname());
		st.setFloat(3,SuperMarketBean.getitemcost());
		int i=st.executeUpdate();
		con.close();
		return i;
	}
	
		
	/*public static int Update(SuperMarketBean student) throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		//prepared statement
		PreparedStatement st=con.prepareStatement("update Student set item_name=? where item_id=?");
		st.setString(1, "Madhavi");
		st.setInt(2, 104);
		int k=st.executeUpdate();
		con.close();
		return k;
	}*/
	
	public static ResultSet Display() throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		//prepared statement
		PreparedStatement st=con.prepareStatement("select * from sales");
		ResultSet m=st.executeQuery();
		System.out.println("Item-Id \tItem-Name \tItem-Cost");
		while(m.next()) {
			System.out.println(m.getInt(1)+"\t\t"+m.getString(2)+"\t\t"+m.getFloat(3));
		}
		con.close();
		return m;
	}
	
	
	public static void Totalcost() throws ClassNotFoundException, SQLException {
		Connection con = DBUtil.DBConnection();
		//prepared statement
		PreparedStatement st=con.prepareStatement("select sum(item_cost) from sales");
		ResultSet m=st.executeQuery();
		while(m.next()) {
			System.out.println("Total cost of all items : "+m.getFloat(1));
		}
		con.close();
	}

}
