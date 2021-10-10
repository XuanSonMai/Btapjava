package QLCANBO;

import java.util.Scanner;

class NVPHUCVU extends QLCB{ 
	String work;

	public NVPHUCVU() {
		super();
	}

	public NVPHUCVU(String work) {
		super();
		this.work = work;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	
	@Override
	public String toString() {
		
		return super.toString()+", cong viec =" + work;
	}
	
	@Override
	void input() {
		
		super.input();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enrer work: ");
		work = scanner.nextLine();
	}
	

}
