package circularLL;

public class implementCircularLinkedList {

	public static void main(String[] args) {
		queuebycircularLinkedList obj=new queuebycircularLinkedList();
		obj.enqueue(45);
		obj.enqueue(54);
		obj.enqueue(325);
		obj.enqueue(105);
		//System.out.println();
		System.out.println("After Enqueue nodes");
        obj.traverse();
        System.out.println();
        System.out.println("After inserting last node");
        obj.insertAtEnd(92);
        obj.traverse();
        System.out.println();
        System.out.println("After deleting first node");
        obj.deleteFromFront();
        obj.traverse();
	}

}
