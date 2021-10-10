package BT;

import java.util.Scanner;

public class Book {
	String bookNameString;
	String releasedDayString;
	String nicknameString;
	public Book() {
		super();
	}
	
	void input()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap ten sach");
		bookNameString=scanner.nextLine();
		
		System.out.println("Ngay xuat ban");
		releasedDayString=scanner.nextLine();
		
		System.out.println("Nhap but danh");
		nicknameString = scanner.nextLine();
	}
	public Book(String bookNameString, String releasedDayString, String nicknameString) {
		super();
		this.bookNameString = bookNameString;
		this.releasedDayString = releasedDayString;
		this.nicknameString = nicknameString;
	}
	public String getBookNameString() {
		return bookNameString;
	}
	public void setBookNameString(String bookNameString) {
		this.bookNameString = bookNameString;
	}
	public String getReleasedDayString() {
		return releasedDayString;
	}
	public void setReleasedDayString(String releasedDayString) {
		this.releasedDayString = releasedDayString;
	}
	public String getNicknameString() {
		return nicknameString;
	}
	public void setNicknameString(String nicknameString) {
		this.nicknameString = nicknameString;
	}
	
	
	

}
