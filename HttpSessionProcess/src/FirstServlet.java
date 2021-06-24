

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out=resp.getWriter();
		
		String u=req.getParameter("uname");
		
		if(u.equals("admin"))
		{
			HttpSession sess=req.getSession();
			
			sess.setAttribute("j1",u);
			
			resp.sendRedirect("SecondServlet");
		}
		else
		{
			Cookie ck=new Cookie("j2",u);
			
			resp.addCookie(ck);

			out.println("<a href='ThirdServlet'>ClickHere</a>");
		}
	}

}
