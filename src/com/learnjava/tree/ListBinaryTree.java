package com.learnjava.tree;


/*
 * 通过链表来实现二叉树
 */
public class ListBinaryTree {
	public static void main(String[] args) {
		int arr[] = {5,2,7,4,9,1,3};
		System.out.println("生成的二叉数组为：");
		BinaryTree tree = new BinaryTree(arr);
		System.out.println("");
		System.out.println("使用中序遍历：");
		tree.inOrder(tree.rootNode);
		System.out.println("");
		System.out.println("使用前序遍历：");
		tree.preOrder(tree.rootNode);
		System.out.println("");
		System.out.println("使用后序遍历：");
		tree.postOrder(tree.rootNode);
		System.out.println("");
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

//定义一颗二叉树
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
	
	//使用中序法遍历二叉树
	public void inOrder(BinaryTreeNode node) {
		if(node != null) {
			inOrder(node.leftNode);
			System.out.print("[" + node.value + "]");
			inOrder(node.rightNode);
		}
	}
	
	//使用前序法遍历二叉树
	public void preOrder(BinaryTreeNode node) {
		if(node != null) {
			System.out.print("[" + node.value + "]");
			preOrder(node.leftNode);
			preOrder(node.rightNode);
		}
	}
	
	//使用后序发遍历二叉树
	public void postOrder(BinaryTreeNode node) {
		if(node != null) {
			preOrder(node.leftNode);
			preOrder(node.rightNode);
			System.out.print("[" + node.value + "]");
		}
	}
}






