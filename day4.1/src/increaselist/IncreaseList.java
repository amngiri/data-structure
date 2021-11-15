package increaselist;


public class IncreaseList {
	private increasingNode head;

	public IncreaseList() {
		this.head = null;
	}

	public void insert(int element) {
		increasingNode temp = new increasingNode();
		temp.setData(element);
		if (head == null) {
			head = temp;
		} else {
			temp.setNext(head);
			head = temp;
		}

	}

	public void traverse() {
		increasingNode curr = head;
		while (curr != null) {
			System.out.println(curr.getData());
			curr = curr.getNext();
		}
	}

	public void sortLL() {
		increasingNode curr = head;
		increasingNode index = null;
		while (curr != null) {
			index = curr.getNext();
			while (index != null) {
				if (curr.getData() > index.getData()) {
					int data = curr.getData();
					curr.setData(index.getData());
					index.setData(data);
				}
				index = index.getNext();
			}
			curr = curr.getNext();
		}
		traverse();
	}
}