package com.app.treedel;

public class node {
private int data;
private node left;
private node right;
public node()
{
	data=0;
	left=null;
	right=null;
}
public int getData() {
	return data;
}
public void setData(int data) {
	this.data = data;
}
public node getLeft() {
	return left;
}
public void setLeft(node left) {
	this.left = left;
}
public node getRight() {
	return right;
}
public void setRight(node right) {
	this.right = right;
}


}
