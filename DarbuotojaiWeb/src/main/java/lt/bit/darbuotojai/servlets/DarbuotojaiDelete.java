package lt.bit.darbuotojai.servlets;



import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DarbuotojaiDAO;
import models.Darbuotojai;

/**
 * Servlet implementation class DarbuotojaiDelete
 */
@WebServlet("/DarbuotojaiDelete")
public class DarbuotojaiDelete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DarbuotojaiDelete() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DarbuotojaiDAO darbuotojaiDAO=new DarbuotojaiDAO();
		Darbuotojai d= darbuotojaiDAO.getDarbuotojas(Integer.parseInt(request.getParameter("id")));
		darbuotojaiDAO.deleteDarbuotojai(d);
		
		response.sendRedirect(request.getContextPath()+"/");
		

	}



}
