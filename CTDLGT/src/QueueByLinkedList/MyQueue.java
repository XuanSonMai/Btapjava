package QueueByLinkedList;

import javax.net.ssl.CertPathTrustManagerParameters;

import StackAndQueue.StackAndQueue;


public class MyQueue implements StackAndQueue {
	
	Node headNode, tailNode;
	MyQueue()
	{
		headNode=tailNode=null;
		
	}
	public class Node
	{
		
		int value;
		Node nodeNexNode;
		
		
		Node(int value)
		{
			this.value = value;
			
			
			
		}
	}

	@Override
	public boolean push(int value) {
		if(isFull())
		{return false;}
		Node newNode = new Node(value);// khoi tao node
		
		if(isEmpty())
		{
			headNode=tailNode=newNode ;
		}
		else {
			tailNode.nodeNexNode= newNode;
			tailNode=tailNode.nodeNexNode;
			
					
			
		}
		return true;
		
	
		
	}
	
	int pop1()
	{
		if(!isEmpty())
		{
			while(headNode!=null)
			{
				int value = headNode.value;
				headNode=headNode.nodeNexNode;
			}
			headNode=tailNode=null;
		}
		return 0;
	}

//	@Override
//	public int pop() {
//		if(!isEmpty())
//		{
//			while(headNode!=null)
//			{
//				
//				int value = headNode.value;
//			    headNode=headNode.nodeNexNode;
//			   
//			    return value;
//			}
//			System.out.println("Mang rong");
//			tailNode=headNode=null; // tra ve mang rong
//		
//		
//		}
//			
//		
//		return 0;
//	}
//	@Override
//	public int pop() {
//		
//		
//		if(!isEmpty())
//		{
//			
//			while(headNode!=null)
//			{
//				
//				int value = headNode.value;
//			    headNode=headNode.nodeNexNode;
//			    if (isRong()) {
//					tailNode=headNode=null;
//				}
//			    
//			    return value;
//			}
//			
//			System.out.println("alo alo");
//			
//		
//		}
//			
//		
//		return 0;
//	}
	
	@Override
	public int pop()
	{
		 if(isEmpty())
		 {
			 return -1;
		 }
		 int value= headNode.value;
		 if(headNode==tailNode)
		 {
			 headNode=tailNode=null; // dieu kien duong
		 }
		 else {
			 headNode=headNode.nodeNexNode;
			
		}
		return value;
	}
	
	boolean isRong()
	{
		return headNode==null;
	}

	@Override
	public boolean isFull() {
		
		return false;
	}

	@Override
	public boolean isEmpty() {
		
		return (headNode == null && tailNode == null) ;
	}

	@Override
	public void print() {
		Node tmpNode = headNode;
		if(headNode!=null)
		{System.out.println("HeadNode la " + headNode.value);}
		else {
			System.out.println("Mang rong");
		}
		
		
	
		while(tmpNode!=null)
		{
			
			System.out.print(tmpNode.value+"  ");
			tmpNode=tmpNode.nodeNexNode;
			
			
		}
		System.out.println("");
		
	}

}
