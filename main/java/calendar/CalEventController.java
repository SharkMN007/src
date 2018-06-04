package calendar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalEventController {

	  @RequestMapping("/createCalEvt")
	    public String createCalEvt() {
	        return "Stub";
	    }
	  
	  @RequestMapping("/updateCalEvt")
	    public String updateCalEvt() {
	        return "Stub";
	    }
	  
	  @RequestMapping("/deleteCalEvt")
	    public String deleteCalEvt() {
	        return "Stub";
	    }
	  
	  @RequestMapping("/getCalEvt")
	    public String getCalEvt() {
	        return "Stub";
	    }
}
