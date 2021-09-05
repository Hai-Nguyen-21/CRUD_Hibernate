 package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.SinhVienDAO;
import entity.SinhVien;
import entity.KhoaNganh;

/**
 * Servlet implementation class UpdateControl
 */
@WebServlet("/update")
public class UpdateControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	SinhVienDAO dao = new SinhVienDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("idSV");
		
		SinhVien sv = dao.getSVByID(id);
		request.setAttribute("sv", sv);
		
//		try {
//			dao.getAllKN().removeAll(dao.getAllKN());
//			request.setAttribute("LIST_KHOANGANH_UPDATE", dao.getAllKN());
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		
		List<KhoaNganh> listSV = new ArrayList<>();
		listSV = dao.getAllKN();
		
		try {
			dao.getAllKN().removeAll(dao.getAllKN());
			request.setAttribute("LIST_KHOANGANH_UPDATE", listSV);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		request.getRequestDispatcher("views/FormUpdate.jsp").forward(request, response);
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			String idSV = request.getParameter("txt_idSV");
			String nameSV = request.getParameter("txt_nameSV");
			String idKN = request.getParameter("idKN");
			String cccd = request.getParameter("txt_cccd");
			String pn = request.getParameter("txt_phoneNum");
			String mail = request.getParameter("txt_mail");

			SinhVien sv = new SinhVien(idSV, nameSV, idKN, cccd, pn, mail);
			
			dao.update(sv);
			response.sendRedirect("load");
			System.out.println(sv.toString());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
