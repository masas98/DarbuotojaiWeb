package lt.bit.darbuotojai.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DarbuotojaiDAO;
import lt.bit.helper.Counter;
import lt.bit.helper.UserManager;
import models.Darbuotojai;

/**
 * Servlet implementation class Kurti
 */
@WebServlet("/Kurti")
public class Kurti extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Kurti() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Counter.setCounter(request.getSession());
		if (!UserManager.isLoggedIn(request.getSession())) {
			response.sendRedirect(request.getContextPath()+"/");
			return;
		}
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/Kurti.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Darbuotojai d=new Darbuotojai();
		d.setName(request.getParameter("name"));
		d.setSurname(request.getParameter("surname"));
		d.setGender(request.getParameter("gender"));
		d.setPhone(request.getParameter("phone"));
		d.setBirthday(request.getParameter("birthday"));
		d.setEducation(request.getParameter("education"));
		
		DarbuotojaiDAO darbuotojaiDAO=new DarbuotojaiDAO();
		darbuotojaiDAO.newDarbuotojai(d);
		response.sendRedirect(request.getContextPath()+"/");
		
	}

}
