package singlyLL;

public class singlyLinkedListDemo {

	public static void main(String[] args) {
		singlyLinkedList list = new singlyLinkedList();
		System.out.println("After 2 nodes");
		list.insertAtFront(5);
		list.insertAtFront(10);
		list.traverse();
		System.out.println("After 4 nodes");
		list.insertAtFront(12);
		list.insertAtFront(7);
		list.traverse();
		System.out.println("After insertion before elements");
		list.insertBeforeElement(10,45);
		list.traverse();
		System.out.println("After insertion in after elements");
		list.insertAfterElement(45,72);
		list.traverse();
		System.out.println("After insertion at end elements");
		list.insertAtEnd(504);
		list.traverse();
		System.out.println("After insertion at position");
		list.insertAtPosition(3,50);
		list.traverse();
		System.out.println("Deletion at position elements");
		list.deleteAtPosition(5);
		list.traverse();
	}
}
