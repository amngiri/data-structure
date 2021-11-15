package Dft;

public class BinarySearchTree {
private NodeDFT root;
public BinarySearchTree()
{
	root=null;
}
public void insertNode(int element)
{
	NodeDFT temp=new NodeDFT();
	temp.setData(element);
	if(root==null)
	{
		root=temp;
	}
	else
	{
		NodeDFT curr=root;
		NodeDFT prev=null;
		while(curr!=null)
		{
			prev=curr;
		   if(curr.getData()>element)
		   {
			   curr=curr.getLeft();
		   }
		   else if(curr.getData()<element)
		   {
			   curr=curr.getRight();
		   }
       
		}
		if(prev.getData()>element)
		{
			prev.setLeft(temp);
		}
		else if(prev.getData()<element)
		{
			prev.setRight(temp);
		}
	}
	
}
public void stack()
{
	stackDFT obj=new stackDFT();
	obj.enqueue(root);
	while(!obj.isEmpty())
	{
		NodeDFT temp=obj.dequeue();
		System.out.println(temp.getData());
		if(temp.getLeft()!=null)
		{
			obj.enqueue(temp.getLeft());
		}
		if(temp.getRight()!=null)
		{
			obj.enqueue(temp.getRight());
		}
	}
}
}
