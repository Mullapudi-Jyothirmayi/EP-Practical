

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class FeedbackInsert
 */
@WebServlet("/FeedbackInsert")
public class FeedbackInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FeedbackInsert() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fb1=request.getParameter("q1");
		String fb2=request.getParameter("q2");
		String fb3=request.getParameter("q3");
		String fb4=request.getParameter("q4");
		String fb5=request.getParameter("q5");
		String fb6=request.getParameter("q6");
		FeedbackBean fb=new FeedbackBean();
		fb.setFb1(fb1);
		fb.setFb2(fb2);
		fb.setFb3(fb3);
		fb.setFb4(fb4);
		fb.setFb5(fb5);
		fb.setFb6(fb6);
		
		FeedbackDAO dao = new FeedbackDAO();
		try {
			int i=dao.FeedbackInsert(fb);
			if(i>0) {
				RequestDispatcher rd=request.getRequestDispatcher("FeedbackDisplay");
				request.setAttribute("feedbackbean",fb);
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
