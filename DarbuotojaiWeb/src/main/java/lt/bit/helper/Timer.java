package lt.bit.helper;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDateTime;

import javax.servlet.http.HttpSession;

import com.google.protobuf.Duration;


public class Timer implements Serializable{
	
	LocalDateTime now = LocalDateTime.now();
	private int s=0;
	
	public Timer() {
		
	}
	
	
	public String toString() {

		long total=(java.time.Duration.between(now, LocalDateTime.now()).getSeconds());
		long min=total/60;
		long sec=total%60;

		
		return min+" min."+sec+" sec";
	}
	
	public static void setTimer(HttpSession session) {
		if (session.getAttribute("timer")==null) {
			session.setAttribute("timer", new Timer());
		}
		else
		{
			Timer t=(Timer)session.getAttribute("timer");
			t.toString();
		}
	}
	
	
	
	

	

	


}
