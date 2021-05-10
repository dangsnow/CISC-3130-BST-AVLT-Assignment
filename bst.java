import java.io.*;

public class bst {
	Node root;
	
	static class Node{
		Node left;
		Node right;
		int value;
		
		public Node(int value) {
			this.value=value;
			this.left=null;
			this.right=null;
			
		}
	}
	
	public bst(int value) {
		this.root=new Node(value);
	}
	
	public bst() {
		this.root=null;
	}
	
	public void insert(Node current, int data) {

		
		if (current==null) 
			current=new Node(data);
		
		
		if(data<=current.value) {
			if(current.left==null)
				current.left=new Node(data);
			else
				insert(current.left, data);
		}
		else {
			if(current.right==null)
				current.right=new Node(data);
			else
				insert(current.right, data);
		}
			
	}
	
	public void traverse(Node node) {
	    if (node != null) {
	        System.out.print(node.value+" ");
	        traverse(node.left);
	        traverse(node.right);
	    }
	}

}

