package MyException;

public class MyException1  extends Exception {
	private String errorString;

	public MyException1(String errorString) {
		super();
		this.errorString = errorString;
	}

	public String getErrorString() {
		return errorString;
	}

	public void setErrorString(String errorString) {
		this.errorString = errorString;
	}
	
	
	
}
