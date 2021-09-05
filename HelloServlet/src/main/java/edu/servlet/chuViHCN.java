package edu.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class chuViHCN
 */
@WebServlet("/chuViHCN")
public class chuViHCN extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public chuViHCN() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher rd = request.getRequestDispatcher("/views/chuViHCN.jsp");
		
		String CR = request.getParameter("cr");
		String CD = request.getParameter("cd");
		
		double cr = Double.parseDouble(CR);
		double cd = Double.parseDouble(CD);
		
		double cv = (cr + cd) *2;
		double dt = cr * cd;
		
		String chuVi = cv+"";
		String dienTich = dt+"";
		
		request.setAttribute("chuVi", chuVi);
		request.setAttribute("dienTich", dienTich);
		
		rd.forward(request, response);
	}

}
