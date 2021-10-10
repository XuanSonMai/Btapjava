package BT;

import java.util.Scanner;

public class Author {
	private String nameString;
	private String nicknameString;
	private int old;
	private String birthdayString;
	private String addressString;
	public Author() {
		super();
	}
	
	public void input()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap ten tac gia: ");
		nameString = scanner.nextLine();
		
		System.out.println("Nhap tuoi");
		old =Integer.parseInt(scanner.nextLine());
		
		System.out.println("Nhap but danh");
		nicknameString=scanner.nextLine();
		
		System.out.println("Ngay sinh");
		birthdayString=scanner.nextLine();
		
		System.out.println("Nhap dia chi");
		addressString=scanner.nextLine();
	}
	
	public void disPlay()
	{
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return "Author [nameString=" + nameString + ", nicknameString=" + nicknameString + ", old=" + old
				+ ", birthdayString=" + birthdayString + ", addressString=" + addressString + "]";
	}

	public Author(String nameString, String nicknameString, int old, String birthdayString, String addressString) {
		super();
		this.nameString = nameString;
		this.nicknameString = nicknameString;
		this.old = old;
		this.birthdayString = birthdayString;
		this.addressString = addressString;
	}
	public String getNameString() {
		return nameString;
	}
	public String getNicknameString() {
		return nicknameString;
	}
	public int getOld() {
		return old;
	}
	public String getBirthdayString() {
		return birthdayString;
	}
	public String getAddressString() {
		return addressString;
	}
	
}
