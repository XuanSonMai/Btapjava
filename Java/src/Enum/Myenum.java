package Enum;


// enum la hang so lai voi class, contructor phai la private
public enum Myenum {    
	CAFE ("cafe");
	private String nameString;

	
	
	private Myenum ( String nameString)
	{
		this.nameString = nameString;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	
	

}
