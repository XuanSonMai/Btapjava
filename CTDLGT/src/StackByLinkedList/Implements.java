package StackByLinkedList;



import java.net.Inet4Address;

import StackAndQueue.StackAndQueue;

public class Implements implements StackAndQueue{
    Node topNode;
  
	private class Node
	{
		int value;
		Node next;
		public Node(int value) {
			this.value = value;
		}
	}
	
	public Implements() {
		
	}	
	
	
	@Override
	public boolean push(int value) {
		if(!isFull())
		{
			Node newNode = new Node(value);
			newNode.next = topNode;
			topNode = newNode;
			System.out.println("Top node dc them la " + topNode.value);
			return true;
		}
		return false;
	}
	
	@Override
	public int pop() {
		if(isEmpty())
			return -1;
		int value = topNode.value;
		topNode=topNode.next;
		
		return value;
	
	}

	@Override
	public boolean isFull() {
	    return false;
	}

	@Override
	public boolean isEmpty() {
		
		return topNode==null;
	}

	@Override
	public void print() {
		Node tmpNode = topNode;
		if(topNode!=null)
		{	System.out.println("topnode la " + topNode.value);}
		else {
			System.out.println("Mang rong");
		}
	
	
		while(tmpNode!=null)
		{
			
			System.out.print(tmpNode.value+"  ");
			tmpNode=tmpNode.next;
			
			
		}
		System.out.println("");
		
		
	}
	
	

}
