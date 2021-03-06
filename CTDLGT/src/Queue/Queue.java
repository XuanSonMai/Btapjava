package Queue;

import StackAndQueue.StackAndQueue;

public class Queue  implements StackAndQueue{
  private int[] Arrays;
  private int SIZE;
  private int headIndex;
  private int tailIndex;
  
  
  
  
	public Queue(int sIZE) {
	
	SIZE = sIZE;
	Arrays = new int[SIZE];
	headIndex = tailIndex = -1;
}

	@Override
	public boolean push(int value) {
		if(!isFull())
		{
			tailIndex++;
		    Arrays[tailIndex]=value;
		    System.out.println("Array["+tailIndex+"]= " + value);
		    return true;
			
		}
		    return false;
	}

	@Override
	public int pop() {
		if(!isEmpty())
		{
			if(tailIndex==0) // 1 phan tu
			{
				int value =Arrays[tailIndex];
				tailIndex--;
				return value;
			
			}
			else {
				
				while(headIndex< tailIndex) // khac vung nho neu ma dung toan tu < thi no se so sanh gia tri
				{
					headIndex++;
					int value = Arrays[headIndex];
					return value;
				}
			   }
		}
		System.out.println("Empty");
		tailIndex=headIndex=-1;
		return -1;
		
	}

	@Override
	public boolean isFull() {
		return tailIndex==SIZE-1;
		
	}

	@Override
	public boolean isEmpty() {
		return  (headIndex==-1) &&(tailIndex==-1);
		
	}

	@Override
	public void print() {
		if(isEmpty())
		{
			System.out.println("Queu rong");
		}
		else {
			System.out.println("Current Queeu");
			for(int i=headIndex+1; i<=tailIndex;i++)
			{
				System.out.print(Arrays[i]+" ");
			}
		}
	}
	
	

}
