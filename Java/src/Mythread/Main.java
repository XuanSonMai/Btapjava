package Mythread;

public class Main {

	public static void main(String[] args) {
		Mythread1 mythread1 = new Mythread1();
		Thread thread = new Thread(mythread1);
		Mythread2 mythread2 = new Mythread2();
		
		thread.start();
		mythread2.run();

	}

}
