package lt.bit.darbuotojai.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import at.favre.lib.crypto.bcrypt.BCrypt;
import dao.DarbuotojaiDAO;
import lt.bit.helper.Counter;
import lt.bit.helper.Timer;
import models.Darbuotojai;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
//		String psw="labas";
		//String hash= "$2a$12$klMnv6osNx905hRU3bZb6OWAe8arwc33nltKfVrGqeZifxQ/jjErW";
		
		//Slaptažodžio sukūrimas su BCrypt
//		System.out.println(BCrypt.withDefaults().hashToString(12, psw.toCharArray()));
		
		//Slaptažodžio patikrinimas su BCrypt
		//System.out.println(BCrypt.verifyer().verify(psw.toCharArray(), hash).verified);
		
		
		
	
		
		Counter.setCounter(request.getSession());
		Timer.setTimer(request.getSession());
		
		
	
		
		DarbuotojaiDAO darbuotojaiDAO=new DarbuotojaiDAO();
		List<Darbuotojai> darbuotojai =darbuotojaiDAO.getDarbuotojas();
		
		request.setAttribute("Darbuotojas", darbuotojai);
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("/index.jsp");
		dispatcher.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
