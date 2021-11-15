package com.app.treedel;

public class delBstNodes {
	private node root;
	public delBstNodes()
	{
		root=null;
	}
	public void createNode(int element)
	{
		node prev=null;
		node curr=null;
		node temp=new node();
		temp.setData(element);
		if(root==null)
		{
			root=temp;
		}
		else
		{
		curr=root;
		while(curr!=null)
		{
			prev=curr;
			if(curr.getData()<element)
			{
				curr=curr.getRight();
			}
			else if(curr.getData()>element)
			{
				curr=curr.getLeft();
			}
		}
			if(prev.getData()>element)
			{
				prev.setLeft(temp);
			}
			else
			{
				prev.setRight(temp);
			}
		}
		}
		

	public void preorder(node root)
	{
		node curr=root;
		if(curr!=null)
		{
			System.out.println(curr.getData());
			 preorder(curr.getLeft());
			 preorder(curr.getRight());
		}
		
		
	}
	public void preorder()
	{
		preorder(root);
	}
	public void inorder(node root)
	{
		node curr=root;
		if(curr!=null)
		{
			inorder(curr.getLeft());
			System.out.println(curr.getData());
			 inorder(curr.getRight());
		}
		
		
	}
	public void inorder()
	{
		inorder(root);
	}
	public void postorder(node root)
	{
		node curr=root;
		if(curr!=null)
		{
			postorder(curr.getLeft());
			postorder(curr.getRight());
			System.out.println(curr.getData());
		}
		
		
	}
	public void postorder()
	{
		postorder(root);
	}
	public void deleteleafnode(int element)
	{
		node curr=root;
		node prev=null;
		while(curr.getLeft()!=null || curr.getRight()!=null) //while any of them is null
			                                            //means it has leaf node
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
		if(prev.getData()>element) //prev will be the leaf node now
		{
			prev.setLeft(null);
		}
		else if(prev.getData()<element)
		{
			prev.setRight(null);
		}
		
	}
	public void deletenode(int element)
	{
		node curr=root;
		node prev=null;
		while((curr.getLeft()!=null && curr.getRight()!=null) || (curr.getData()!=element))
		{   //loop will exit if curr left/right is null  &  that element has found
			
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
			prev.setLeft(curr.getLeft());    //prev left is set to leaf node
			curr.setLeft(null);             //curr node left is set to null
		} 
		else if(prev.getData()<element)
		{
			prev.setRight(curr.getRight());
			curr.setRight(null);
		}
		}
	}
	
