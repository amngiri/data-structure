package stackbylinkedlist;

public class implementStackByLinkedList {

	public static void main(String[] args) {
		stackByLinkedList obj=new stackByLinkedList();
		obj.push(45);
		System.out.println("poped element "+obj.pop());
		obj.push(55);
		obj.push(65);
		obj.push(75);
		obj.push(85);
		System.out.println();
		System.out.println("Traverse of elements");
		obj.traverse();
		System.out.println();
		System.out.println("poping element "+obj.pop());
		System.out.println("poping element "+obj.pop());
		System.out.println("poping element "+obj.pop());
		System.out.println("poping element "+obj.pop());
		System.out.println("poping element "+obj.pop());
		obj.push(37);
		obj.push(39);
		System.out.println("poping element "+obj.pop());
		System.out.println("poping element "+obj.pop());
		obj.push(87);
		System.out.println("poping element "+obj.pop());
		obj.traverse();

	}

}
