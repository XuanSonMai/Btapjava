package quick;

import java.util.Arrays;

import merge1.main;

public class Test {
	static void quickSort(int[] a, int L, int R)
	{
		if(L>=R) return;
			
			
			
		//b1 chon khoa 
		int key = a[(L+R)/2];
		//b2 phan bo lai mang theo khoa
		int k= partition(a,L,R,key); // tra ve khoa 
		
		
		
		//b3 : chia doi mang ==> lap lai
		quickSort(a, L, k-1); // ben trai
		quickSort(a,k, R); // ben phai
	}
	
	

	static int partition(int[] a, int l, int r, int key) {
		
		int iL=l;
		int iR=r;
		int i=0;
		while(iL<=iR)
		{
			
			while(a[iL]<key)
			{
				iL++;
			}
			while(a[iR]>key)
			{
				iR--;
			}
			// doi cho 2 phan tu ko dung vi tri
			if(iL<=iR)
			{
				int tem=a[iL];
				a[iL]=a[iR];
				a[iR]=tem;
				iL++;
				iR--;
			}
			System.out.println("");
				
//				else {
//				iL++;
//				iL--;
//				}
			
			
		}
		System.out.println("IL la " + iL);
		
		
		return iL;
	}
	
	public static void main(String[] args) {
		int [] a= {9,8,7,5,6,2,53};
		
		System.out.println("Start");
		quickSort(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
		System.out.println("Finished");
	}
	
	

}
