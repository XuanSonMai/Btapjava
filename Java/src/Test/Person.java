package Test;

public class Person {
	private Animals diachi; // has a voi kieu du lieu la dia chi, moi person co 1 dia chi
	private String ten;
	
	
	
	public Person(String ten) {
		super();
		this.ten = ten;
	}
	public Animals getDiachi() {
		return diachi;
	}
	public void setDiachi(Animals diachi) {
		this.diachi = diachi;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	
	
	

}
