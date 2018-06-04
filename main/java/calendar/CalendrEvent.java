package calendar;

import java.util.Date;
import java.util.List;

public class CalendrEvent {

	private Long calEventId;
	
	private Calendr calendar;
	
	private String eventTitle;
	
	private Date eventDate;
	
	private String location;
	
	private List<String> attendeeList;
	
	private Date reminderTime;
	
	private Boolean reminderSent;
	
	
	public CalendrEvent(Calendr calendar, String eventTitle, Date eventDate, String location,
			List<String> attendeeList, Date reminderTime, Boolean reminderSent) {
		super();
		this.calendar = calendar;
		this.eventTitle = eventTitle;
		this.eventDate = eventDate;
		this.location = location;
		this.attendeeList = attendeeList;
		this.reminderTime = reminderTime;
		this.reminderSent = reminderSent;
	}

	public CalendrEvent() {
		super();
	}
	
	public Calendr getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendr calendar) {
		this.calendar = calendar;
	}

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public List<String> getAttendeeList() {
		return attendeeList;
	}

	public void setAttendeeList(List<String> attendeeList) {
		this.attendeeList = attendeeList;
	}

	public Date getReminderTime() {
		return reminderTime;
	}

	public void setReminderTime(Date reminderTime) {
		this.reminderTime = reminderTime;
	}

	public Boolean getReminderSent() {
		return reminderSent;
	}

	public void setReminderSent(Boolean reminderSent) {
		this.reminderSent = reminderSent;
	}

	public Long getCalEventId() {
		return calEventId;
	}

	public void setCalEventId(Long calEventId) {
		this.calEventId = calEventId;
	}
}
