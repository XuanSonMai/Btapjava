package Java36;

import java.util.ArrayList;
import java.util.List;

public class Test {
   static void sapXep(int a[]) {
	// TODO Auto-generated method stub
	   for(int i=0; i< a.length-1 ; i++)
	   {
		   for(int j= i+1 ; j<a.length;j++)
		   {
			   if(a[i]> a[j])
			   {
				   int tem= a[i];
				   a[i] = a[j];
				   a[j]= tem;
			   }
		   }
	   }
	   

}
   static void xinChao(Test a)
   {
	   System.out.println("Xin chao");
   }
	public static void main(String[] args) {
//	List<Integer > list = new ArrayList<Integer>();
//	list.add(1);
//	list.add(2);
//	list.add(3);
		Person aPerson = new Person("a","a");
		Person bPerson = new Person("b","b");
		Person cPerson = new Person("c","c");
		List<Person> list = new ArrayList<Person>();
		list.add(aPerson);
		list.add(bPerson);
		list.add(cPerson);
//		for (Person person : list) {
//			System.out.println(person.getNameString());
//		}
	
	     list.remove(new Person("b","b"));
//	    for (Person person : list) {
//		System.out.println(person.getNameString());
	}
	
	  
	 
	  
		
	}

