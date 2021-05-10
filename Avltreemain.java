package avlt;

public class Avltreemain {

	public static void main(String[] args) {
		avlTree tree = new avlTree();
		 
        /* Constructing tree given in the above figure */
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 15);
        tree.root = tree.insert(tree.root, 36);
        tree.root = tree.insert(tree.root, 47);
        tree.root = tree.insert(tree.root, 53);
        tree.root = tree.insert(tree.root, 29);
        
        System.out.println("Preorder traversal" +
                " of constructed tree is : ");
        tree.preOrder(tree.root);
        
        

	}

}
