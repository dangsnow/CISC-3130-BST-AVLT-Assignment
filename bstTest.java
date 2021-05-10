
public class bstTest {

	public static void main(String[] args) {
		bst tree=new bst(10);
		

		tree.insert(tree.root, 15);
		
		tree.insert(tree.root, 20);
		tree.insert(tree.root, 6);
		tree.insert(tree.root, 5);
		tree.insert(tree.root, 7);
		tree.insert(tree.root, 16);
		tree.insert(tree.root, 14);

		System.out.println("all the notes in the bst are: ");
		tree.traverse(tree.root);




	}

}
