package QLCANBO;

import java.util.Scanner;

public class QLCB {
	String name,birthday,gender,address;

	public QLCB() {
		super();
	}
	
	
	void disPlay()
	{
		System.out.println(toString());
	}
	
	void input()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Full name : ");
		name=scanner.nextLine();
		
		System.out.println("BirthDay: ");
		birthday= scanner.nextLine();
		
		System.out.println("Gender: ");
		gender=scanner.nextLine();
		
		System.out.println("Address");
		address=scanner.nextLine();
		
		
	}

	@Override
	public String toString() {
		return "QLCB [name=" + name + ", birthday=" + birthday + ", gender=" + gender + ", address=" + address ;
	}




//	public QLCB(String name, String birthday, String gender, String address) {
//		super();
//		this.name = name;
//		this.birthday = birthday;
//		this.gender = gender;
//		this.address = address;
//	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
}
