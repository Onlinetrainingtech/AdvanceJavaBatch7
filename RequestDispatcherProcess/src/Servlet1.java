

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet1
 */
@WebServlet("/Servlet1")
public class Servlet1 extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String u1=req.getParameter("uname");
		
		String p1=req.getParameter("pass");
		
		PrintWriter out=resp.getWriter();
		
		if(u1.equals("admin")&&p1.equals("admin"))
		{
			RequestDispatcher dis=req.getRequestDispatcher("sucess.jsp");
			dis.forward(req, resp);
		}
		else
		{
			RequestDispatcher dis=req.getRequestDispatcher("error.jsp");
			dis.include(req, resp);
		}
		
	}

}
