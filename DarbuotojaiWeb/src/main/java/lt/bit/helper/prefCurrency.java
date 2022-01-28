package lt.bit.helper;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class prefCurrency {
	
	private final static String [] currencies= {"EUR", "USD", "GBP"};

	public static String[] getCurrencies() {
		return currencies;
	}
	
	public static String getCurrency(HttpServletRequest request) {
		Cookie[] cookies=request.getCookies();
		if(cookies!=null) {
			for(Cookie c: cookies) {
				if(c.getName().equals("prefCurrency")) {
					return c.getValue();
				}
			}
		}
		return null;
		
	}

}
