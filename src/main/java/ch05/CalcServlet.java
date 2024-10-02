package ch05;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcServlet
 */
@WebServlet(description = "CalcServlet", urlPatterns = { "/calc" })
public class CalcServlet extends HttpServlet {

//	private static final long serialVersionUID = 1L;
	
	private static long serialVersionUID = 1L;	


	public CalcServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int n1 = Integer.parseInt(request.getParameter("n1"));
		System.out.print(n1);

		int n2 = Integer.parseInt(request.getParameter("n2"));
		System.out.print(n2);

		int op = Integer.parseInt(request.getParameter("op"));
		System.out.print(op);

		
		response.setContentType("text/html; charset=utf-8");
		response.getWriter()
		.append("" +  n1)
		.append("" +  n2)
		.append("" +  op)		
		.append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}