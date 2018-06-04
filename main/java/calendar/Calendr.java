package calendar;

import java.util.List;

public class Calendr {
  
	private Long calId;
	
	private String name;
	
	private String user;
		
	public Calendr() {
		super();
	}
	
	public Calendr(String name, String user) {
		super();
		this.name = name;
		this.user = user;	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Long getCalId() {
		return calId;
	}

	public void setCalId(Long calId) {
		this.calId = calId;
	}
}


