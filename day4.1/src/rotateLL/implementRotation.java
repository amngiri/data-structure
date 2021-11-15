package rotateLL;

public class implementRotation {

	public static void main(String[] args) {
		rotateLinkedList obj=new rotateLinkedList();
		obj.makingLinkedList(5);
		obj.makingLinkedList(12);
		obj.makingLinkedList(19);
		obj.makingLinkedList(7);
		obj.makingLinkedList(2);
		obj.makingLinkedList(1);
		System.out.println("Elements of linked list are:");
		obj.traverse();
		System.out.println("Rotating node by 2");
		obj.traverse(2);
	}

}
