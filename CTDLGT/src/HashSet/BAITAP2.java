package HashSet;

import java.util.HashMap;
import java.util.Map;

public class BAITAP2 {
	static int first(String s)
	{
		Map<Character, Integer> myMap = new HashMap<Character, Integer>();
	
		for(int i=0 ; i < s.length(); i++)
		{
			char c = s.charAt(i); // chuyen thanh char o vi tri i
			if(myMap.containsKey(c)==false)
			{
				myMap.put(c, 1);
			}
			else {
				
				myMap.put(c, myMap.get(c)+1);
					
				}
		}
			
		
	     for(int i = 0; i< s.length();i++)
	     {
	    	 char c = s.charAt(i);
	    	 if(myMap.get(c)==1)
	    	 {
	    		 return i;
	    	 }
	     }
	return -1;
	}
	
	public static void main(String[] args) {
		String string= "leetcode";
		if(first(string)==0)
		{
			
		}
	}
			
			
		
		
			
		
	}


