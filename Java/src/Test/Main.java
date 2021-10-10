package Test;

public class Main {
	
	public static void main(String[] args)
	{
Employee emp = new Employee();
emp.setTen("a");
emp.setDiachi(null);
System.out.println(emp.getTen());

Animals diachi = new Animals();
diachi.setTenDuong("hanoi");
emp.setDiachi(diachi);
System.out.println(emp.getDiachi().getTenDuong());

}
}
