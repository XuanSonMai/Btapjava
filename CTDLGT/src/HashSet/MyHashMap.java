package HashSet;

import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Scanner;

import merge1.main;

public class MyHashMap {
	private final int SIZE =1000;
	ArrayList<Data> myBucket[];
	public MyHashMap()
	{
		myBucket = new ArrayList[SIZE];
		for(int i=0 ;i <myBucket.length;i++)
		{
			myBucket[i] = new ArrayList<MyHashMap.Data>();
		}
	}
	
	class Data
	{
		int key;
		int value;
		
		Data(int key, int value)
		{
			this.key=key;
			this.value=value;
		}
		
//		@Override
//		public boolean equals(Object other) {
//			if(other instanceof Data)return this.key==((Data) other).key;
//			return false;
//				
//			
//		}
		
		
	}
	
	private int hashFuntion(int key)
	{
		return key %1000;
	}
	
	public void put(int key, int value)
	{
		int hashValueInDex = hashFuntion(key);
		var bucket = myBucket[hashValueInDex];
		Data tem = new Data(key, value);
		int keyIndex = bucket.indexOf(tem); // kiem tra 
		bucket.add(tem);
//	
//		if(keyIndex>=0)
//		{
//		bucket.get(keyIndex).value=value;
//		}
//		else {
//			bucket.add(tem);
//		}
	
	}
	
	
	public void remove (int key)
	{
		int hashValueIndex = hashFuntion(key);
		var bucket = myBucket[hashValueIndex];
		bucket.remove(new Data(key, 0) );
	}
		
	
	
	public int get(int key)
	{
		int hashValueIndex = hashFuntion(key);
		var bucket = myBucket[hashValueIndex];
		Data findData= new Data(key, 0);
		int subIndex = bucket.indexOf(findData);
		System.out.println("subIndex"+subIndex);
		if(subIndex >=0)
		{
			return bucket.get(subIndex).value;
		}
		return -1;
		
		
	}
	
	public static void main(String[] args) {
		MyHashMap myMap = new MyHashMap();
		
		myMap.put(1, 1);
		
//		System.out.println("value"+myMap.get(1));
//		System.out.println("value"+myMap.get(1));
		myMap.remove(1);
		
		System.out.println("Sau khi remove");
		System.out.println(myMap.myBucket[1].get(0).key+" "+myMap.myBucket[1].get(0).value);
		//System.out.println(myMap.myBucket[1].get(1).key+" "+myMap.myBucket[1].get(1).value);
		
		//System.out.println(myMap.myBucket[1].get(0).key+" "+myMap.myBucket[1].get(0).value);
		//System.out.println(myMap.myBucket[1].get(1).key+" "+myMap.myBucket[1].get(1).value);
		
		
		//System.out.println(myMap.get(0));
		
//		myMap.remove(1);
		
		
		
		
		
		
	}
	
	

}
