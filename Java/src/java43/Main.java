package java43;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node aNode = new Node();
		aNode.setNameString("A");
		
		TreeNode treeNode = new TreeNode();
		treeNode.setA(1);
		treeNode.setB(2);
		aNode.setNode(treeNode);
		System.out.println(aNode.getNameString()+ " " + aNode.getNode().a+aNode.getNode().b);

	}

}
