package HashSet;

import java.util.HashMap;
import java.util.Map;

public class HashMapJava {
	public static void main(String[] args) {
		Map<Integer, Integer> myMap = new HashMap<>();
		int[] arr = {1,2,3,1,1,2};
		// key gia tri element
		// value la so lan xuat hien
		for (int i : arr) {
			if(myMap.containsKey(i))
			{
				
			int slxuahien= myMap.get(i);
			slxuahien++;
			myMap.put(i, slxuahien);
			
			}
			else {
				myMap.put(i, 1);
			}
			
		}
		
		for (Map.Entry entry : myMap.entrySet()) {
			System.out.println("Key " + entry.getKey() +"value " + entry.getValue());
		}
		
	}

}
