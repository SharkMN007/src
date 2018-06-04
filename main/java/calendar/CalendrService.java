package calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalendrService {
	
	 @Autowired
	 private CalendrDao calDao;
 
	 
	 public Calendr createCalendr(String name, String user) {
		 
		 Calendr calendr = new Calendr(name, user);
		 calDao.saveCalendr(calendr);
		 
		 return calendr;
	 }
	
	 public Response deleteCalendr(Long calId) {
		 
		Response response = new Response(Boolean.TRUE);
		
		try {
			calDao.deleteCalById(calId);
		} catch (Exception e) {
			response.setFailed("Delete failed");
			// Log error
		}
		
		return response;
	 }
	 
	 public Response update(Calendr calendr) {
		 
		Response response = new Response(Boolean.TRUE);
		
		try {
			calDao.saveCalendr(calendr);
		} catch (Exception e) {
			response.setFailed("Update failed");
			// Log error
		}
		
		return response;
	 }
	 
	 public Calendr getCalendar(String name, String userName) {
		 return calDao.getCalenderByNameUserName(name, userName);
		 
	 }
	 
	 public Calendr getCalendar(Long calId) {
		 return calDao.getCalendrById(calId);
	 }
}
