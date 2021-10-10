package QueueByLinkedList;

public class Test {

	public static void main(String[] args) {
		MyQueue myQueue = new MyQueue();
		myQueue.push(1);
		myQueue.push(2);
		myQueue.push(3);
		myQueue.print();
		while(!myQueue.isEmpty())
		{
			System.out.println("pop"+ myQueue.pop());
			myQueue.print();
						
		}
		System.out.println("empty");
		
		
	}

}
