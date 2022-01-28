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
import models.Darbuotojai;

/**
 * Servlet implementation class DarbuotojaiEdit
 */
@WebServlet("/DarbuotojaiEdit")
public class DarbuotojaiEdit extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private DarbuotojaiDAO darbuotojaiDAO=new DarbuotojaiDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DarbuotojaiEdit() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Counter.setCounter(request.getSession());
		Darbuotojai d=darbuotojaiDAO.getDarbuotojas(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("d", d);
	
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/DarbuotojaiEdit.jsp");
		dispatcher.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Darbuotojai d=darbuotojaiDAO.getDarbuotojas(Integer.parseInt(request.getParameter("id")));
		request.setAttribute("d", d);
		
		
		d.setName(request.getParameter("name"));
		d.setSurname(request.getParameter("surname"));
		d.setGender(request.getParameter("gender")) ;
		d.setPhone(request.getParameter("phone"));
		d.setBirthday(request.getParameter("birthday"));
		d.setEducation(request.getParameter("education"));
		
		darbuotojaiDAO.updateDarbuotojai(d);
		response.sendRedirect(request.getContextPath()+"/");
		

		
	}

}
