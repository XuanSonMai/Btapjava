package Java36;

public class Person {
	private String nameString;
	private String rollNoString;

	

	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Person)
		{
			if(((Person)obj).getRollNoString()==this.rollNoString)
			{
				
				System.out.println("SAO LAI SAI EQUAL CUA TUI"+ this.rollNoString);
			return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	public Person() {
		super();
	}

	public Person(String nameString, String rollNoString) {
		super();
		this.nameString = nameString;
		this.rollNoString = rollNoString;
	}

	public String getRollNoString() {
		return rollNoString;
	}

	public void setRollNoString(String rollNoString) {
		this.rollNoString = rollNoString;
	}

	public String getNameString() {
		return nameString;
	}

	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	void gomaytinh()
	{
		System.out.println("Person go may tinh");
	}
	public void public1()
	{}
	protected void protect() {
		
	}
	
	
	
	
	
	

}
