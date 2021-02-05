import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class login
 */

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public login() {
		super();
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		PrintWriter pw=response.getWriter();
		
		
		try {
			Connection con=DBUtil.DBConnection();		
			PreparedStatement ps = con.prepareStatement("select email,password from lab5 where email=? and password=?");
			ps.setString(1,email);
            ps.setString(2,password);
            ResultSet rs = ps.executeQuery();
            String dbemail,dbpassword;
			
			if(rs.next()) 
			{
				dbemail = rs.getString("email");
				dbpassword = rs.getString("password");
				
			
			if (email.equals(dbemail) && password.equals(dbpassword)) {
						
						request.getRequestDispatcher("feedback.html").include(request, response);
						//pw.write("WELCOME");
				}
			}
				else {
					
					pw.write("INVALID CREDENTIALS");
					
				}
			
			con.close();
		
		}
		catch (ClassNotFoundException e) { // TODO Auto-generated catch block
			e.printStackTrace();

		} catch (SQLException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		} // sb have details of client

	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request,response);
	}

}