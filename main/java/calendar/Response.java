package calendar;

public class Response {
	
    private Boolean success;
	
	private String message;
	
	public Response() {
		
	}
	
	public Response(Boolean success) {
		this.success = success;
	}
	
	public void setFailed(String msg) {
		success = Boolean.FALSE;
		message = msg;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
