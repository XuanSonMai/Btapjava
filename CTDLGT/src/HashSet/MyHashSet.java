package HashSet;

import java.util.ArrayList;

import merge1.main;

public class MyHashSet {
	private final int SIZE = 1000;
	private ArrayList[] myBucket;
	
	
	public MyHashSet() {
		myBucket = new ArrayList[SIZE];
		for(int i=0; i< myBucket.length;i++)
		{
			myBucket[i] = new ArrayList<>();
		}
	}
	
	private int hashFuntion(int key)
	{
	  return key%SIZE;	
	}
	void add(int key)
	{
		int hashValueIndex = hashFuntion(key);
		int keyIndex = myBucket[hashValueIndex].indexOf(key);
		if (keyIndex<0)
		{
		  myBucket[hashValueIndex].add(key);	
		}
	}
	
	boolean contains(int key)
	{
		int hashValueIndex = hashFuntion(key);
		int keyIndex = myBucket[hashValueIndex].indexOf(key);
		var bucket =myBucket[hashValueIndex];
		return keyIndex>=0;  // neu lon hon = thi return <==> true;
		
		
	}
	void remove1(int key)
	{
		int hashValueIndex = hashFuntion(key);
		int keyIndex = myBucket[hashValueIndex].indexOf(key);
		var bucket =myBucket[hashValueIndex];
		if (keyIndex>=0)
		{
			bucket.remove(keyIndex);
		}
		
		
	}
	
	public static void main(String[] args) {
		
		MyHashSet myHashSet = new MyHashSet();
		myHashSet.add(1);
		System.out.println("Co chua 1 ko ??" + myHashSet.contains(1));
		myHashSet.add(1001);
		myHashSet.add(2001);
		myHashSet.remove1(1);
		System.out.println("Co chua 1 ko ??" + myHashSet.contains(1));
		
	
		System.out.println("phan tu o bucket[1]" +myHashSet.myBucket[1].toString());
		
		
		
		
		}
	}


