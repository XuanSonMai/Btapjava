package BinaryTree;

import java.util.concurrent.TimeUnit;

import javax.sound.midi.MidiChannel;
import javax.swing.plaf.basic.BasicSplitPaneUI.KeyboardDownRightHandler;



import QueueByLinkedList.MyQueue.Node;

public class MyTreeNode {
	TreeNode rooTreeNode;
	
	
	public MyTreeNode() {
		
	}
	class TreeNode {
		int value;
		TreeNode lefTreeNode;
	    TreeNode righTreeNode;
	    public TreeNode(int vl) {
			this.value=vl;
	}
	}
	 public void khoitao()
	 {
		 TreeNode n0= new TreeNode(0);
		 TreeNode n1= new TreeNode(1);
		 TreeNode n2= new TreeNode(2);
		 TreeNode n3= new TreeNode(3);
		 TreeNode n4= new TreeNode(4);
		 TreeNode n5= new TreeNode(5);
		 n0.lefTreeNode=n1; n0.righTreeNode= n2;
		 n1.lefTreeNode=n3; n1.righTreeNode= n4;
		 n2.righTreeNode= n5;
		 
		 rooTreeNode=n0;
		 
		 
		 
	 }
	 public void khoitao1()
	 {
		 TreeNode n0= new TreeNode(2);
		 TreeNode n1= new TreeNode(3);
		 TreeNode n2= new TreeNode(7);
		 TreeNode n3= new TreeNode(8);
		 TreeNode n4= new TreeNode(0);
		 n0.lefTreeNode=n4;
		 n0.righTreeNode=n1;
				 n1.righTreeNode=n2;
		 n2.righTreeNode=n3;
		 rooTreeNode=n0;
		 
		
		 
		 
		 
		 
	 }
	 
	 // cach dung de quy
	 TreeNode Insert(TreeNode root,int value)
	 {
		if(root==null)
		{    
			
			return root = new TreeNode(value);
		}
		
		if(root.value< value)
		{
//			
			if(root.righTreeNode==null)
			{
			   root.righTreeNode=new TreeNode(value);
			}
			else {
				Insert(root.righTreeNode, value);
			}
			
				
			
				
			
				
			
			
			
			
			
		}
			
		    else {
		    	if(root.lefTreeNode==null)
				{
					root.lefTreeNode=new TreeNode(value);
				}
		    	else {
		    		Insert(root.lefTreeNode, value);
				}
		    		
			
				
		    	
		    	
		        }
			
		
		return root;
		
	 }
	 void duyetCay(TreeNode rooTreeNode)

	 {
		 
		 if(rooTreeNode==null)
		 {
			 return ;
		 }
		 else {
			 
				 System.out.println("xuat node "+rooTreeNode.value);
				 
				 duyetCay(rooTreeNode.lefTreeNode);
				
				
				 duyetCay(rooTreeNode.righTreeNode);
			 }
		}
		 
			 
		 
	 
TreeNode findLeftModeNode(TreeNode node)
{
	if(node==null)
	{
		return null;
	}
	
TreeNode nextRooTreeNode = node;
while(nextRooTreeNode.lefTreeNode!=null) // neu ben trai con root thi tro trai tiep
{
	 nextRooTreeNode= nextRooTreeNode.lefTreeNode; // tro sang ben trai
}
   return nextRooTreeNode;
}


	 
	    
	 
	 
	 TreeNode deleteNode(TreeNode root, int key)

	 {
		 if(root==null)
		 {
			 return null;
		 }
		 if(key<root.value)
		 {
			 root.lefTreeNode=deleteNode(root.lefTreeNode, key);
		 }
		 else if (key>root.value) {
			root.righTreeNode=deleteNode(root.righTreeNode, key);
		}
		 else { // tim dc node can xoa
		 
		 // b2 : xoa node
		 //th1 : node la
		 if(root.lefTreeNode==null && root.righTreeNode==null)
		 {
			 return null;
		 }
		 //th2.1 : chi co 1 con ben trai
		 if(root.lefTreeNode!=null && root.righTreeNode==null ) {
			return root.lefTreeNode;
		}
		 // th 2.2: chi co 1 con phai
		 if(root.lefTreeNode==null && root.righTreeNode!=null) {
			return root.righTreeNode;
		}
		 
		 //th3 : ton tai 2 node con 
		TreeNode leftModeNode = findLeftModeNode(root.righTreeNode);
		root.value=leftModeNode.value; // lay gia tri node trai cung gan cho node
		root.righTreeNode=deleteNode(root.righTreeNode, leftModeNode.value); // xoa node leftmode de phong truong hop node nay co 1 con
		
	    }
		 return root;
		 
	 }
	 
	   public TreeNode searchBST(TreeNode root, int val) {
	       if(root==null)
	      {
	          return null;
	       }
	       if(root.value==val)
	       {
	        
	        return root;
	       }
	        else if(val<root.value)
	        {
	            return searchBST(root.lefTreeNode,  val);
	        }
	        else
	        {
	           return searchBST(root.righTreeNode,  val);
	        }
	        
	            
	            
	            
	        
	      
	    }
	}
	 

	 
	
	 
			
		
		 
		 
		 
	
//		public TreeNode insertIntoBST(TreeNode root, int value) {
//		        if(root==null){
//					 root=new TreeNode(value);
//		             return root;
//				 }
//		         
//		          
//				     if (root.value<value) {
//		             
//		              insertIntoBST(root.lefTreeNode, value);
//				      }
//				      else (root.value>value) {
//		                insertIntoBST(root.lefTreeNode, value);
//					 
//				      }
//		           
//		        return root;
//		  }
		



