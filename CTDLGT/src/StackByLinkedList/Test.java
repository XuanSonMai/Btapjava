package StackByLinkedList;

public class Test {
	public static void main(String[] args) {
		Implements nodeImplements= new Implements();
	
		
		nodeImplements.push(4);
		nodeImplements.push(3);
		nodeImplements.push(2);
		System.out.print("stack hien tai: ");
		nodeImplements.print();
		
		while(true)
		{
			int tmp =nodeImplements.pop();
			if(tmp!=-1)
			{
				System.out.println("Pop"+tmp);
				nodeImplements.print();
			}
			else {
				System.out.println("Mang rong ko pop dc nua ");
				break;
			}
		}
		
		
		
			
			
//		System.out.println("Is empty??" + nodeImplements.isEmpty() );
//		System.out.println("Pop"+nodeImplements.pop());
//		System.out.print("stack hien tai: ");
//		nodeImplements.print();
//		System.out.println("Pop"+nodeImplements.pop());
//		System.out.print("stack hien tai: ");
//		nodeImplements.print();
//		System.out.println("Pop"+nodeImplements.pop());
//		System.out.print("stack hien tai: ");
//		nodeImplements.print();
		
        
		
//	   
		
		
		
		
	}

}	
