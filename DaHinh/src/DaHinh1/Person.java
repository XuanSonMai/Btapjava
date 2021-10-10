package DaHinh1;

public class Person {
	private String tenString;

	public String getTenString() {
		return tenString;
	}

	public void setTenString(String tenString) {
		this.tenString = tenString;
	}
	public void thongTin()
	{
		System.out.println("class cha");
	}
	public static void main(String[] args) {
		Employee emp = new Employee();
		
		Person p = new Employee();
		emp.setLuong(4.5);
		emp.setTenString("A");
		
		p.setTenString("B");
		//p.setLuong(4); // ko dc
		emp.thongTin();
		p.thongTin();
		
		
		
	}
	

	

}
