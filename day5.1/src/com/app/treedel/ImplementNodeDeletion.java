package com.app.treedel;

public class ImplementNodeDeletion {

	public static void main(String[] args) {
		delBstNodes obj=new delBstNodes();
		obj.createNode(42);
		obj.createNode(12);
		obj.createNode(2);
		obj.createNode(422);
		obj.createNode(90);
		obj.createNode(72);
		//obj.inorder();
		System.out.println("Nodes of tree are");
		obj.preorder();
		System.out.println();
		System.out.println("After deleting 2 which is leaf node");
		obj.deleteleafnode(2);
		//obj.inorder();
		obj.preorder();
		System.out.println();
		System.out.println("After deleting a 90 which has one child");
		obj.deletenode(90);
		//obj.inorder();
		obj.preorder();

	}

}
