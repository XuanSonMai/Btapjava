package QLCANBO;

import java.util.Scanner;

public class CQLCN extends QLCB{
	static final int BAC_MAX =7;
	
	int bac; // bac1-7
//	public CQLCN()
//	{}
//	public CQLCN(int bac) {
//		super();
//		this.bac = bac;
//	}
	@Override
	public String toString() {
		
		return super.toString()+", bac ="+bac;
	}
	
	@Override
	void input() {
		super.input();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap bac cong nhan ");
		bac = Integer.parseInt(scanner.nextLine());
	}
	
	

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}

	public static int getBacMax() {
		return BAC_MAX;
	}
	
	
	
	

}
