package Java36;

public class Famer  extends Employee{
String luongString;

public String getLuongString() {
	return luongString;
}

public void setLuongString(String luongString) {
	this.luongString = luongString;
}

@Override
	void gomaytinh() {
		// TODO Auto-generated method stub
		
		System.out.println("Famer go may tinh");
	}
 @Override
	public boolean equals(Object obj) {
		
	 if(obj instanceof Person)
		{
			if(((Person)obj).getRollNoString()==this.getRollNoString())
			{
				
				
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

}
