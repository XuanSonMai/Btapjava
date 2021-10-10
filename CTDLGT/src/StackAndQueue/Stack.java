package StackAndQueue;

import java.util.Arrays;

import javax.management.ValueExp;

public class Stack implements StackAndQueue {
	private int[]array;
	private int SIZE;
	private int topIndex=-1;
	
	public Stack(int size) {
		this.SIZE = size;
		array = new int [SIZE];
	}

	@Override
	public boolean push(int value) {
		if(!isFull())
		{
			topIndex++;
			array[topIndex] = value;
			return true;
			
		}
			
			return false;
	}
	
	

	@Override
	public int pop() {
		if(!isEmpty())
		{
			int value = array[topIndex];
			topIndex--; // de lay phan tu tiep theo neu pop tiep
			System.out.println("Sau khi pop "+value + "top index la " + topIndex);
			return value;
		}
		return -1;
	}


	@Override
	public boolean isFull() {
	return topIndex == SIZE -1;
		
	}
	

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return  topIndex <-1;
	}
   @Override
	public void print() {
		if(isEmpty())
		{
			System.out.println("Stack is empty");
			
		}else {
			System.out.println("So phan tu con lai " );
			for(int i=0; i<=topIndex; i++)
			{
				System.out.print(array[i]+" ");
			}
			
		}
		
	}
}


