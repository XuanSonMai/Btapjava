package MyException;

public class Hello {
	public static void main(String[] args) {
	
		try {
			chia2So(0, 0);
		} catch (MyException1 e) {
			// TODO Auto-generated catch block
			System.out.println("Error");
		}
	}
	
	static void chia2So(int a, int b) throws MyException1{
		try {
		int kq = a/b;
		System.out.println(kq);
		} catch (Exception e) {
			throw new MyException1("loi chia cho 0");
		}
	} 

}
