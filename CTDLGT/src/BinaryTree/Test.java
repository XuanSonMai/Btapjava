package BinaryTree;

import BinaryTree.MyTreeNode.TreeNode;

public class Test {

	public static void main(String[] args) {
		MyTreeNode myTreeNode = new MyTreeNode();
		myTreeNode.khoitao1();
		
		
	    System.out.println("GIA TRI BAN DAU");
		myTreeNode.duyetCay(myTreeNode.rooTreeNode);
		myTreeNode.Insert(myTreeNode.rooTreeNode, 1);
		System.out.println("Search");
		if(myTreeNode.searchBST(myTreeNode.rooTreeNode, 7)!=null)
			
		{
			System.out.println(myTreeNode.searchBST(myTreeNode.rooTreeNode, 7).value);
        }
		else {
			System.out.println("Null");
		}
		
//		System.out.println("Root la " + myTreeNode.rooTreeNode.value);
//		System.out.println("Right" + myTreeNode.rooTreeNode.righTreeNode.value);
//		System.out.println("GIA TRI VUA DC THEM");
//		myTreeNode.duyetCay(myTreeNode.rooTreeNode);
		
		
		
		
		

	}

}
