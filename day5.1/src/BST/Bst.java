package BST;

public class Bst {
private nodeBST root;
public Bst()
{
	root=null;
}
public void createNode(int element)
{
	nodeBST prev=null;
	nodeBST curr=null;
	nodeBST temp=new nodeBST();
	temp.setData(element);
	if(root==null)//if root is null so it is first node
	{
		root=temp; //set root to null
	}
	else
	{
	curr=root; //making primary ref variable as root
	while(curr!=null) //it will iterate till it will go above
	{
		prev=curr; //maintain previous node such that it will go uo on the last node
		           //because curr will pass the last node also
		
		if(curr.getData()<element) //if curr is lesser than element then move right
		{
			curr=curr.getRight(); //moving right
		}
		else if(curr.getData()>element) //if curr is greater than element then move right
		{
			curr=curr.getLeft();//moving left
		}
	}
		if(prev.getData()>element) //if prev node data is greater than element then
			                      //element will be inserted in the left side of prev
		{
			prev.setLeft(temp);
		}
		else                     //if prev node data is lesser than element then
                                 //element will be inserted in the right side of prev
		{
			prev.setRight(temp);
		}
	}
	}
	
public nodeBST searchElement(int element)
{
	nodeBST curr=root;
	while(curr.getData()!=element) //will go till target node only
	{
		if(curr.getData()>element)
		{
			curr=curr.getLeft();
		}
		else if(curr.getData()<element)
		{
			curr=curr.getRight();
		}
	}
	return curr;
}
public void preorder(nodeBST root)
{
	nodeBST curr=root;
	if(curr!=null)
	{
		System.out.println(curr.getData());     //root
		 preorder(curr.getLeft());             //left side between
		 preorder(curr.getRight());           //right side at end
	}	
}
public void preorder()
{
	preorder(root);
}
public void inorder(nodeBST root) //as to traverse inorder root will be required & user dont have root
{
	nodeBST curr=root;
	if(curr!=null) //because current can be null & it will end recursion when required
	{
		inorder(curr.getLeft());             //left side first
		System.out.println(curr.getData()); //root 
		 inorder(curr.getRight());         //right side at last
	}	
}

public void inorder() //so a method is made to initiate the inorder funtion by root
{                     //constructor overloading
	inorder(root); //sending parametre to inorder method
}
public void postorder(nodeBST root)
{
	nodeBST curr=root;
	if(curr!=null)
	{
		postorder(curr.getLeft());             //left side first
		postorder(curr.getRight());            //right side in between
		System.out.println(curr.getData());    //root in last
	}
	
	
}
public void postorder()
{
	postorder(root);
}
}
