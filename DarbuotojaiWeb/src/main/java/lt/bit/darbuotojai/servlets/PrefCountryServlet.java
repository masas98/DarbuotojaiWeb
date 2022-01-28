package lt.bit.darbuotojai.servlets;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrefCountryServlet
 */
@WebServlet("/PrefCountry")
public class PrefCountryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrefCountryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prefCountry=request.getParameter("prefCountry");
		Cookie prefCountryCookie=new Cookie("prefCountry", prefCountry);
		prefCountryCookie.setMaxAge(60*60*24*365);
	
		
		response.addCookie(prefCountryCookie);
		
		response.sendRedirect(request.getContextPath()+"/");
	}

}
