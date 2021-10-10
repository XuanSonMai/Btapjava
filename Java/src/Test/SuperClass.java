package Test;

public class SuperClass {

	public int tong2So(int a,int b)
	{
		return a+b;
	}
	//overload method
	public long tong2So(int a,long b)
	{
		return a+b;
	}
	
	public float tong2So(float a)
	{
		return a;
	}

	
	public static void main(String[] args) {
		SuperClass superClass = new SuperClass();
		LopCon kodomo = new LopCon();
		//ystem.out.println(superClass.tong2So(5f));
		System.out.println(kodomo.tong2So(5f));
		
	}
}

