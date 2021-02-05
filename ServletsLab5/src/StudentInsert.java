import java.io.IOException;
//import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentInsert
 */
@WebServlet("/StudentInsert")
public class StudentInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public StudentInsert() {
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int regno=Integer.parseInt(request.getParameter("regno"));
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String dept=request.getParameter("dept");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		StudentBean sb=new StudentBean();
		sb.setRegno(regno);
		sb.setName(name);
		sb.setGender(gender);
		sb.setDept(dept);
		sb.setEmail(email);
		sb.setPassword(password);
		
		//PrintWriter pw=response.getWriter();
		//pw.print(regno+" "+name);
		
		StudentDAO dao = new StudentDAO();
		try {
			int i=dao.StudentInsert(sb);
			if(i>0) {
				RequestDispatcher rd=request.getRequestDispatcher("StudentDisplay");
				request.setAttribute("studentbean",sb);
				rd.forward(request, response);
			}
			else {
				RequestDispatcher rd=request.getRequestDispatcher("error.html");
				rd.include(request, response);				
			}
		}
		catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
