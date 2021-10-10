package Queue;

public class Test {
	public static void main(String[] args) {
		Queue testQueue = new Queue(5);
		testQueue.push(1);
		testQueue.push(2);
		testQueue.print();
		
		System.out.println("\nPop: "+testQueue.pop());
		System.out.println("\nPop: "+testQueue.pop());
		System.out.println("\nPop: "+testQueue.pop());
		
		
		
		
	}

}