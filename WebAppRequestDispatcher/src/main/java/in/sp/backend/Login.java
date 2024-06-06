package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Login extends HttpServlet
{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String myemail = req.getParameter("email1");
		String mypass = req.getParameter("pass1");
		
		PrintWriter out = resp.getWriter();
		
		if (myemail.equals("deepak@gmail.com") && mypass.equals("deepak123"))
        {
			req.setAttribute("name_kay", "Deepak Panwar");
			RequestDispatcher rd = req.getRequestDispatcher("/profile.jsp");
			rd.forward(req, resp);
			
		} else
		{
			resp.setContentType("text/html");    // it gives html page 
			out.print("<h3 style='color:red'> EmailId and Password didn't match...</h3>");
            RequestDispatcher rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);   // it includes error message with html page
			
		}
		
		
	}

}
