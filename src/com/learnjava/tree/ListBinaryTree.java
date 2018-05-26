package com.learnjava.tree;


/*
 * 通过链表来实现二叉树
 */
public class ListBinaryTree {
	public static void main(String[] args) {
		int arr[] = {5,2,7,4,9,1,3};
		BinaryTree tree = new BinaryTree(arr);
	}
}

//定义二叉树的节点
class BinaryTreeNode{
	int value;
	BinaryTreeNode leftNode;
	BinaryTreeNode rightNode;
	
	public BinaryTreeNode(int value){
		this.value = value;
		leftNode = null;
		rightNode = null;
	}
}

class BinaryTree{
	BinaryTreeNode rootNode = null;
	
	//传入一个数组来构建二叉树
	public BinaryTree(int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			addNodeToTree(arr[i]);
		}
	}
	
	//添加节点到二叉树
	public void addNodeToTree(int value) {
		BinaryTreeNode currentNode = rootNode;
		if(rootNode == null) {
			rootNode = new BinaryTreeNode(value);
			System.out.print("[" + value + "]");
			return;
		}
		while(true) {
			if(value < currentNode.value) {
				if(currentNode.leftNode == null) {
					currentNode.leftNode = new BinaryTreeNode(value);
					System.out.print("[" + value + "]");
					return;
				}else {
					currentNode = currentNode.leftNode;
				}
			}else {
				if(currentNode.rightNode == null) {
					currentNode.rightNode = new BinaryTreeNode(value);
					System.out.print("[" + value + "]");
					return;
				}else {
					currentNode = currentNode.rightNode;
				}
			}
		}
	}
}






