package merge1;

public class merge {
	public int[] merge1(int[]a1, int[]a2)
	{
		int n= a1.length+a2.length; // lay so luong phan tu mang result
		int[]result = new int[n]; // mang chua ket qua so sanh
		
		int i=0,i1=0,i2=0; // luu index sau moi lan tang gia tri
		while(i<n) // chua full
		{
			if(i1 < a1.length && i2 < a2.length)// s1 va  a2 != rong 
			{
				if(a1[i1] <= a2[i2])
				{
					result[i]= a1[i1];
					i++;i1 ++;
				}
				else 
				{
					
						//a2 nho hon a1
						result [i]= a2[i2];
						i++;i2++;
				}
			}
			else {//a1 rong or a2 rong
				if(i1 < a1.length)
				{
					result[i]=a1[i1];
				    i++;i2++;
				}
				else 
				{
					result[i]=a2[i2];
					i++;
					i2++;
				}
					
				
			     }
		
			}
		
		return result;
	}
	
	public int[] mergeTest(int[]a1, int[]a2)
	{
		int n= a1.length+a2.length;
		int[]result = new int[n];
		int i=0, i1=0, i2=0;
		while(i<n)
		{
			if(i1<a1.length && i2<a2.length)
			{
				if(a1[i1]<=a2[i2])
				{
					result[i]=a1[i1];
					i++;i1++;
				}
				else {
					result[i]=a2[i2];
					i++;i2++;
					
				}
				
			}
			else {
				if(i1<a1.length )
				{
					result[i]=a1[i1];
					i++;i1++;
				}
				else {
					result[i]=a2[i2];
					i++;i2++;
				}
				
				
			}
		}
		return result;
	}
	
	public int[] mergeSort ( int a[], int L, int R)
	{
		//THDB , Dieu kien dung
		if(L==R)
		{
			int[] single = {a[L]};
			return single;
		}
		// THTQ
		// Chia ra
		System.out.println("Chia" +L+"-" + R);
		int k=(L+R)/2;
		int[] a1= mergeSort(a, L, k);
		int[] a2 = mergeSort(a, k+1, R);
		
		// tron a1 va a2 la cac mang da duoc sap xep
		int[] result = merge1(a1, a2);
		return result;
	}
	public int[] mergeSort2(int[]a,int L, int R)
	{
		if(L==R)
		{
		   int [] single = {a[R]};
		   return single;
		}
		System.out.println("Chia "+L + "-" +R);
		int k=(L+R)/2;
		int[] a1=mergeSort2(a, L, k);
		int [] a2=mergeSort2(a, k+1, R);
		int[] result= mergeTest(a1, a2);
		return result;
		
		
	}
	
	
	public static void main(String[] args) {
		merge sapxepMerge = new merge();
		int[] b = {9,8,7,6,5,4,3,2,1};
		int[] result = sapxepMerge.mergeSort2(b, 0, b.length-1);
		System.out.println("Mang b sau khi sap xep la :" ) ;
		int count=0;
		for (int i : result) {
			
			
              System.out.println("phan tu vi tri "+count +"la "+ i);	
              count++;
		}
      		
	}
	

}

