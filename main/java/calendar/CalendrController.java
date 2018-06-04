package calendar;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
public class CalendrController {
	
	 @Autowired
      private CalendrService calService;
	 
	 @Autowired
	 private ObjectMapper jacksonObjectMapper;

	  @RequestMapping(value = "/createCal", produces={"application/json"})
	   @ResponseBody public String createCalendr(@RequestBody String name, String userName)  {
 
		    String response = "Calendar creation failed";
		    
			try {
				response = jacksonObjectMapper.writeValueAsString(calService.createCalendr(name, userName));
			} catch (JsonProcessingException e) {
				// Log error
			}
		  
	        return response;
	    }
	  
	  @RequestMapping("/updateCal")
	   @ResponseBody public String updateCalendr(@RequestBody Calendr calendr) throws JsonProcessingException {
	        return jacksonObjectMapper.writeValueAsString(calService.update(calendr));
	    }
	  
	  @RequestMapping("/deleteCal")
	  @ResponseBody  public String deleteCal(@RequestBody Calendr calendr) throws JsonProcessingException {
		  return jacksonObjectMapper.writeValueAsString(calService.deleteCalendr(calendr.getCalId()));
	    }
	  
	  @RequestMapping("/getCal")
	  @ResponseBody  public String getCal(@RequestBody Long calId) throws JsonProcessingException {
		  return jacksonObjectMapper.writeValueAsString(calService.getCalendar(calId));
	    }
	  
	

}
