package BST;

public class implementBst {

	public static void main(String[] args) {
		Bst obj=new Bst();
		obj.createNode(42);
		obj.createNode(12);
		obj.createNode(2);
		obj.createNode(422);
		obj.createNode(90);
		obj.createNode(72);
		System.out.println();
		System.out.println("preorder traversal is: ");
		obj.preorder();
		System.out.println("Inorder Traversal is:");
		obj.inorder();
		System.out.println("Postorder Traversal is:");
		obj.postorder();
		nodeBST address=obj.searchElement(90);
		System.out.println();
		System.out.println("refrence of 90 is: "+address);


	}

}
