package Mythread;

public class TestThread2 implements Runnable{
	public int Tong;
	
	
	public TestThread2()
	{
		
		this.Tong=1000;
	}
	
	public void rutTien() throws InterruptedException
	{
		if(Tong>0)
		{
		
			Thread.sleep(1000);
			Tong = Tong-1000;
			System.out.println(Tong);
		}
		else {
			System.out.println("ko con tien");
		}
	}
	@Override
	public void run() {
		try {
			rutTien();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
			}

	
	public static void main(String[] args) {
		TestThread2 t = new TestThread2();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		t1.start();
		t2.start();
	}
}
