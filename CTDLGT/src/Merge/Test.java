package Merge;

import java.sql.Array;
import java.util.Arrays;

public class Test {
	public static int[] merge(int a[], int L, int R)
	{
	    // dieu kien dung
	    if(L==R)
	    {
	        int b[] = {a[R]};
	        return b;
	    }

	    // chia ra 
	    int mid = (L+R)/2;
	    int c[] = merge(a, L, mid);
	    int d[] = merge(a,mid+1, R);
	    
	    // tron vao
	    int [] result = new int[c.length+a.length];
	    int irel=0, iC=0,iD=0;
	    while(irel < result.length )
	    {
	        // th1 : mang c va d con phan tu
	         while(iC< c.length && iD < d.length)
	        {
	            if(a[iC] <= a[iD])
	            {
	                
	                result[irel] = a[iC];
	                irel++; iC++;
	            }
	            else 
	            {
	                  result [irel] = a[iD];
	                  irel++;
	                  iD++; 
	            }
	        }
	        // 1 trong 2 mang trong
	        if(iC<c.length)
	        {
	            result[irel] = a[iC];
	            irel++; iC++;
	        }
	        else 
	        { // neu c da do het thi chi co id chua do het thoi

	            result[irel] = a[iD];
	            irel++; iD++;
	        }
	    }
	    return result;
	}
	public static int[] merge1(int a[], int L, int R)
	{
	    // dieu kien dung
	    if(L==R)
	    {
	        int b[] = {a[L]};
	        return b;
	    }

	    // chia ra 
	    int mid = (L+R)/2;
	    int c[] = merge1(a, L, mid);
	    System.out.println("mang C la " + Arrays.toString(c));
	    
	    int d[] = merge1(a,mid+1, R);
	    System.out.println("mang D la " + Arrays.toString(d));
	    
	    // tron vao
	    
	     int n = c.length+d.length;
	    	
	     int [] result = new int[n];
	     int irel=0, iC=0,iD=0;
	     while(irel < result.length )
	     {
	        // th1 : mang c va d con phan tu
	    	
	    	 
	    	   while(iC< c.length && iD < d.length)
	    		 
	        
	           {
	            if(c[iC] <= d[iD])
	            {
	                
	                result[irel] = c[iC];
	                irel++; iC++;
	            }
	            else 
	            {
	                  result [irel] = d[iD];
	                  irel++;
	                  iD++; 
	            }
	           }
	        // 1 trong 2 mang trong
	    	if(iC<c.length)
	        {
	            result[irel] = c[iC];
	            irel++; iC++;
	        }
	    	 else
	        { // neu c da do het thi chi co id chua do het thoi

	            result[irel] = d[iD];
	            irel++; iD++;
	        }
	    }
	    return result;
	}
	public static void main(String[] args) {
	    int a[] = {5,3,6,9};
	     
	    int b[] = merge1(a, 0, a.length-1);
	    System.out.println("Sau khi sap xep");
	    for (int i = 0; i < a.length; i++) {
	        System.out.println("a["+i+"]=" +b[i]);
//	    }
	}
}
}
