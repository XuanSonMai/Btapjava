package StackAndQueue;

public class Main {
	public static void main(String[] args) {
		Stack stack = new Stack(3);
		stack.push(1);
		stack.push(2);
		
		
		System.out.println(" Lay ra phan tu "+stack.pop());
		System.out.println("Lay ra phan tu "+stack.pop());
		System.out.println("Lay ra phan tu "+stack.pop());
		stack.print();
	}

}
