package HashSet;

import java.util.HashSet;
import java.util.Set;

public class Library {
	public static void main(String[] args) {
		Set<String> mySet = new HashSet<String>();
		mySet.add("11");
		mySet.add("22");
		mySet.add("33");
		mySet.add("44");
		
		for (String aString :mySet) {
			System.out.println(aString);
		}
		
	}

}
