package BFT;

public class BinarySearchTree {
	private NodeBFT root;
	public BinarySearchTree()
	{
		root = null;
	}
	public void insertNode(int element)
	{
		NodeBFT temp = new NodeBFT();
		temp.setData(element);
		
		if (root == null)
		{
			root = temp;
		}
		else
		{
			NodeBFT curr,prev;
			curr= root;
			prev = null;
			while (curr!=null)
			{
				prev = curr;
				if (element > curr.getData())
					curr = curr.getRight();
				else
					curr = curr.getLeft();
			}
			if (element > prev.getData())
				prev.setRight(temp);
			else
				prev.setLeft(temp);
		}
	}
	
	public void preorder(NodeBFT node)
	{
		if (node != null)
		{
			System.out.println(node.getData());
			preorder(node.getLeft());
			preorder(node.getRight());
		}
	}
	public void preorder()
	{
		preorder(root);
	}
	// Breadth First Traversal of the tree
	// Queue has to be used.
	public void bft()
	{
		QueueBFT q = new QueueBFT();
		q.enqueue(root);
		while (!q.isEmpty())
		{
			NodeBFT temp = q.dequeue();
			System.out.println(temp.getData());
			if (temp.getLeft()!=null)
				q.enqueue(temp.getLeft());
			if (temp.getRight()!=null)
				q.enqueue(temp.getRight());
		}
	}
}
