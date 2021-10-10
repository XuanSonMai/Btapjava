package QLCANBO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<QLCB> canboList = new ArrayList<QLCB>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int choose;
		do {
			showMenu();
			choose=Integer.parseInt(scanner.nextLine());
			switch (choose){
			case 1: 
				inputData();
				
				break;
			case 2:
				searchByName();
				break;
			case 3: 
				showData();
				break;
			case 4: 
				System.out.println("Thoat");
				break;
				
			default:
				System.out.println("Nhap sai !!");
				
			
			
			
		} 
			}while(choose !=4);
		
	}
		
		
	
	
	private static void showData() {
		for (QLCB qlcb : canboList) {
			qlcb.disPlay();
			
		}
		
	}




	private static void searchByName() {
		System.out.println("Nhap ten can bo can tim: ");
		String tenString = scanner.nextLine();
		for (QLCB qlcb : canboList) {
			if(qlcb.getName().equalsIgnoreCase(tenString))
			{
				System.out.println("TT CAN BO CAN TIM LA : ");
				qlcb.disPlay();
			}
		}
		
	}




	private static void inputData() {
		System.out.println("Nhap so can bo can them");
		int n = Integer.parseInt(scanner.nextLine());
		
	   for (int i = 0; i < n; i++) {
		   QLCB canBoQlcb = createCanbo();
		   canboList.add(canBoQlcb);
	   }
		
	}
	static QLCB createCanbo() // xac dinh coi muon nhap can bo gi
	{
		QLCB canBo = null;
		System.out.println("1. Nhap thong tin cong nhan");
		System.out.println("2. Nhap thong tin Ky su");
		System.out.println("3. Nhap thong tin Nhan Vien phuc vu");
		System.out.println("Chon");
		int choose = Integer.parseInt(scanner.nextLine());
		switch (choose){
		case 1: 
			canBo = new CQLCN();
			break;
			
	
		case 2: 
			canBo = new ENJINIA();
			
			break;
			
			
		default:
			canBo = new NVPHUCVU();
			
			break;
			
		
			
		}
		canBo.input();
		return canBo;
		
	
		
		
	}
		
	




	static void showMenu()
	{
		System.out.println("1. Nhap thong tin cho can bo");
		System.out.println("2. Tim kiem ho ten");
		System.out.println("3. Hien Thi thong tin");
		System.out.println("4.Thoat");
		System.out.println("5.Chon");
	}

}
