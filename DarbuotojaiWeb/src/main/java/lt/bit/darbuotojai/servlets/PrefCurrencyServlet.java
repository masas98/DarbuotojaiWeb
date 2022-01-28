package lt.bit.darbuotojai.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrefCurrencyServlet
 */
@WebServlet("/prefCurrency")
public class PrefCurrencyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrefCurrencyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String prefCurrency=request.getParameter("prefCurrency");
		Cookie prefCurrencyCookie= new Cookie("prefCurrency", prefCurrency);
		prefCurrencyCookie.setMaxAge(60*60*24*365);
		response.addCookie(prefCurrencyCookie);
		response.sendRedirect(request.getContextPath()+"/");
	}

}
