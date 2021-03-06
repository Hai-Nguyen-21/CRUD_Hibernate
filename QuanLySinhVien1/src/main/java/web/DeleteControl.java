package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.SinhVienDAO;

/**
 * Servlet implementation class DeleteControl
 */
@WebServlet("/delSV")
public class DeleteControl extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private SinhVienDAO dao = new SinhVienDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteControl() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// lấy id 
		String id = request.getParameter("idSV");
		dao.delete(id);
		// load lại trang home
		response.sendRedirect("load"); // gọi tới tên webservlet nha
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
