package Throws;

import javax.naming.InsufficientResourcesException;

public class Person {
	
	public static void print() throws ArrayIndexOutOfBoundsException
	{
		int [] mang = {1,2};
		System.out.println(mang[2]);
	}
	public static void main(String[] args) {
		try {exeptionExample();}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("error");
		}
		
			try {
				exeption();
			} catch (InsufficientResourcesException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
	// cach 1
	static void exeptionExample()
	{
		throw new ArrayIndexOutOfBoundsException();
	}
	//cach 2
	static void exeption () throws InsufficientResourcesException
	{
		throw new InsufficientResourcesException();
	}

}
