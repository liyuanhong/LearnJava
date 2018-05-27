package com.learnjava.tree;

/*
 * 如果一颗树的每一个节点的数据大于左子节点并且小于右子节点，这棵树就叫做“二分树”
 * 二分树包含“二叉排序树”和“二叉搜索树”
 * 二叉搜索树与二叉排序树的区别在于；前者每个节点的值都不相同
 */
public class SearchBinaryTree {
	public static void main(String[] args) {
		int arr[] = {7,3,8,5,9,33,42,12,55,78,13};
		SearchTree tree = new SearchTree(arr);
		System.out.println("");
		tree.searchValue(tree.rootNode,13);
	}
}

//定义一个二叉搜索树节点
class SearchBinaryTreeNode{
	int value;
	SearchBinaryTreeNode leftNode;
	SearchBinaryTreeNode rightNode;
	
	public SearchBinaryTreeNode(int value){
		this.value = value;
		leftNode = null;
		rightNode = null;
	}
}

//定义一棵二叉搜索树
class SearchTree{
	SearchBinaryTreeNode rootNode = null;
	//定义查找二叉树的次数
	int count = 1;
	
	//传入一个数组来构建二叉树
	public SearchTree(int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			addNodeToTree(arr[i]);
		}
	}
	
	//添加节点到二叉树
	public void addNodeToTree(int value) {
		SearchBinaryTreeNode currentNode = rootNode;
		if(rootNode == null) {
			rootNode = new SearchBinaryTreeNode(value);
			System.out.print("[" + value + "]");
			return;
		}
		while(true) {
			if(value < currentNode.value) {
				if(currentNode.leftNode == null) {
					currentNode.leftNode = new SearchBinaryTreeNode(value);
					System.out.print("[" + value + "]");
					return;
				}else {
					currentNode = currentNode.leftNode;
				}
			}else {
				if(currentNode.rightNode == null) {
					currentNode.rightNode = new SearchBinaryTreeNode(value);
					System.out.print("[" + value + "]");
					return;
				}else {
					currentNode = currentNode.rightNode;
				}
			}
		}
	}
	
	//从二叉树中搜索一个值
	public void searchValue(SearchBinaryTreeNode node,int value) {
		if(node == null) {
			System.out.println("无法找到该节点，因为二叉树为空");
			return;
		}
		if(node.value == value) {
			System.out.println("查找值为：" + value + "的节点一共找了：" + this.count + "次");
			return;
		}
		if(node.value > value) {
			count+=1;
			searchValue(node.leftNode,value);
		}else {
			count+=1;
			searchValue(node.rightNode,value);
		}
	}
}