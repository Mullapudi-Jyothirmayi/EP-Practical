import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FeedbackDisplay
 */
@WebServlet("/FeedbackDisplay")
public class FeedbackDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public FeedbackDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		FeedbackBean fb=(FeedbackBean) request.getAttribute("feedbackbean");
		PrintWriter pw=response.getWriter();
		pw.println("STUDENT FEEDBACK DETAILS");
		pw.println("Overall teaching   : "+fb.getFb1());
		pw.println("Subject Knowledge  : "+fb.getFb2());
		pw.println("English proficiency: "+fb.getFb3());
		pw.println("Smart class usage  : "+fb.getFb4());
		pw.println("Grasping subject   : "+fb.getFb5());
		pw.println("Remarks            : "+fb.getFb6());
		
	}

}