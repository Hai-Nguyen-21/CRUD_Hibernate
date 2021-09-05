package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.SinhVienDAO;
import entity.SinhVien;

/**
 * Servlet implementation class AddControl
 */
@WebServlet("/add")
public class AddControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SinhVienDAO dao = new SinhVienDAO();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			dao.getAllKN().removeAll(dao.getAllKN());
			request.setAttribute("LIST_KHOANGANH", dao.getAllKN());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("views/FormAdd.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String idSV = request.getParameter("txt_idSV");
			String nameSV = request.getParameter("txt_nameSV");
			String idKN = request.getParameter("idKN");
			String cccd = request.getParameter("txt_cccd");
			String pn = request.getParameter("txt_phoneNum");
			String mail = request.getParameter("txt_mail");

			SinhVien sv = new SinhVien(idSV, nameSV, idKN, cccd, pn, mail);

			dao.add(sv);
			response.sendRedirect("load");
			System.out.println(sv);
		} catch (Exception e) {
			// TODO: handle exception

			e.printStackTrace();
		}
	}

}
