package HashSet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class BTAP {
	
	static boolean containsDuplicate(int[] a)
	{Set<Integer> mySet = new HashSet<Integer>();
	for (Integer elemenInteger : a) {
		if(mySet.contains(elemenInteger))
		{
			return true;
		}
		mySet.add(elemenInteger);
		
	}
	return false;
	
		
	}
	public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println(containsDuplicate(nums));
		
		
		
		
	}
	
	

}
