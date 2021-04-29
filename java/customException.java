package activities;

public class customException extends Exception {

	private String message;
	
	public customException(String msg) {
		this.message = msg;
	}
	
	@Override
	public String getMessage() {
		return message;
	}
}
