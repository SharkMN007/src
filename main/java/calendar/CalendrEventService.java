package calendar;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalendrEventService {

	 @Autowired
	 private CalEventDao calEventDao;	
	 
	 
	//Stub
	public Response saveCalEvent(CalendrEvent calEvent) {
		
		Response response = new Response(Boolean.TRUE);
		
		try {
			calEventDao.saveCalEvent(calEvent);
		} catch (Exception e) {
			response.setFailed("Save failed");
			// Log error
		}
		
		return response;
	}
	
	//Stub
	public Response updateCalEvent(CalendrEvent calEvent) {
		
		Response response = new Response(Boolean.TRUE);
			
		try {
			calEventDao.updateCalEvent(calEvent);;
		} catch (Exception e) {
			response.setFailed("Update failed");
			// Log error
		}
		
		return response;
	}
	
	//Stub
	public Response deleteCalEventById(Long id) {
		
		Response response = new Response(Boolean.TRUE);
		
		try {
			calEventDao.deleteCalEventById(id);;
		} catch (Exception e) {
			response.setFailed("Delete failed");
			// Log error
		}
		
		return response;		
	}
	
	//Stub
	public Response deleteCalEvent(CalendrEvent calEvent) {
		
		Response response = new Response(Boolean.TRUE);
		
		try {
			calEventDao.deleteCalEvent(calEvent);;
		} catch (Exception e) {
			response.setFailed("Delete failed");
			// Log error
		}
		
		return response;			
	}
	
	//Stub
	public CalendrEvent getCalEventById(Long Id) {
		return calEventDao.getCalendrById(Id);
	}
	
	//Stub
	public List<CalendrEvent> getAllCalEvents(Calendr calendr) {
		
		return calEventDao.getAllCalEvents(calendr);
	}
	
	//Stub
	public List<CalendrEvent> getCalEventsByDate(Calendr calendr, Date date) {
		
		return calEventDao.getCalEventsByDate(calendr, date);
	}
	
	//Stub
	public List<CalendrEvent> getCalEventsByDateRange(Calendr calendr, Date startDate, Date endDate) {
		
		return calEventDao.getCalEventsByDateRange(calendr, startDate, endDate);
	}
}
