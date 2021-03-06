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

/**
 * Servlet implementation class LoadControl
 */
@WebServlet("/load")
public class LoadControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SinhVienDAO dao;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoadControl() {
        super();
        this.dao = new SinhVienDAO();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// get dữ liệu từ data
		dao.getAllSV().removeAll(dao.getAllSV());
		List<SinhVien> listSV = new ArrayList<>();
		listSV = dao.getAllSV();
		// set ra màn hình
		
		request.setAttribute("listS", listSV);
		request.getRequestDispatcher("views/displaySinhVien.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
