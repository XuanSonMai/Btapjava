package LC_049;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Test {
public static int nextNumber(int n)
{
	     int sum=0;
			while(n!=0){
				int k= n%10;
				n=n/10;
				sum+=(k*k);
			    }
	   return sum;

}
   static boolean isHappy(int n)
   {
	   //Set<Integer> existNumberSet = new HashSet<Integer>();
	   Set<Integer> existNumberSet = new HashSet<>();
	  
	   while(existNumberSet.contains(n)==false)
	   {
		  
		   existNumberSet.add(n);
		   if(n==1)
		   {
			   return true;
		   }
		   n=nextNumber(n);
		   // dieu kien dung vong lap la n nam trong set
		   
	   }
	   return false;
   }
   public static boolean isHappy1(int n) {
       Set<Integer> existNumbers = new HashSet<>();
       
       while(existNumbers.contains(n) == false){
           existNumbers.add(n);
           if(n == 1){
               return true;
           }
           n = nextNumber(n);
       }

       return false;
   }

   public static void main(String[] args) {
	Collections.so
	   
//	System.out.println(nextNumber(100)
//	   );
	System.out.println(isHappy(19));
   }
	
	
}

