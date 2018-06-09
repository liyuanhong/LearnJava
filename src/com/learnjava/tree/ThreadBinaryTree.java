package com.learnjava.tree;

public class ThreadBinaryTree {
	public static void main(String[] args) {
		int[] arr = {25,10,20,30,100,399,453,43,237,373,655};
		ThreadBinaryTreeExample threadTree = new ThreadBinaryTreeExample(arr);
		threadTree.inOrderPrint();
	}
}

//构建线索二叉树节点
class ThreadNode {
	int value;
	ThreadNode left_node;
	ThreadNode right_node;
	int left_thread;
	int right_thread;
	
	public ThreadNode(int value) {
		this.value = value;
		this.left_node = null;
		this.right_node = null;
		this.left_thread = 0;
		this.right_thread = 0;
	}
}

//定义一颗线索二叉树
class ThreadBinaryTreeExample{
	ThreadNode rootNode;
	
	public ThreadBinaryTreeExample() {
		rootNode = null;
	}
	
	//通过数组声明一个线索二叉树
	public ThreadBinaryTreeExample(int arr[]) {
		for(int i = 0;i < arr.length;i++) {
			addNodeToTree(arr[i]);
			//addNodeToTree_bybook(arr[i]);
		}
		System.out.println("线索二叉树建立完成...");
	}
	
	/*
	 * 通过我的方式建立线索二叉树
	 * 通过该方法创建的线索二叉树无法使用下面的方法遍历，因为当第一个值大于后面的值的时候，就会出错
	 * 具体错误运行后就知道了
	 * 
	 */
	public void addNodeToTree(int value) {
		ThreadNode newNode = new ThreadNode(value);
		ThreadNode current ;
		ThreadNode parent;
		ThreadNode previous;
		if(rootNode == null) {
			rootNode = newNode;
			return;
		}
		current = rootNode;
		parent = rootNode;
		previous =rootNode;
		
		//定义线索二叉树的行进方向，主要用于确定previous节点
		int pos = 0;
		while(current != null) {
			if(current.value >= value) {
				if(pos != -1) {
					pos = -1;
					previous = parent;
				}
				parent = current;
				if(current.left_thread == 1) {
					current = current.left_node;
				}else {
					current = null;
				}
			}else {
				if(pos != 1) {
					pos = 1;
					previous = parent;
				}
				parent = current;
				if(current.right_thread == 1) {
					current = current.right_node;
				}else {
					current = null;
				}
			}
		}
		if(parent.value > value) {
			parent.left_thread = 1;
			parent.left_node = newNode;
			newNode.left_node = previous;
			newNode.right_node = parent;
		}else {
			parent.right_thread = 1;
			parent.right_node = newNode;
			newNode.left_node = parent;
			newNode.right_node = previous;
		}
		return;
	}
	
	
	
	/*
	 * 通过---------书上----------的方式建立线索二叉树
	 * 通过该方法创建的线索二叉树需要忽略掉第一个元素（第一个元素为辅助元素，实际的二叉树是从root元素右节点的第一个元素开始的）
	 */
		public void addNodeToTree_bybook(int value) {
			ThreadNode newNode = new ThreadNode(value);
			ThreadNode current ;
			ThreadNode parent;
			ThreadNode previous = new ThreadNode(value);
			int pos;
			if(rootNode == null) {
				rootNode = newNode;
				rootNode.left_node = rootNode;
				rootNode.right_node = null;
				rootNode.left_thread = 0;
				rootNode.right_thread = 1;
				return;
			}
			
			current = rootNode.right_node;
			if(current == null) {
				rootNode.right_node = newNode;
				newNode.left_node = rootNode;
				newNode.right_node = rootNode;
				return;
			}
			parent = rootNode;
			//定义线索二叉树的行进方向，主要用于确定previous节点
			pos = 0;
			while(current != null) {
				if(current.value >= value) {
					if(pos != -1) {
						pos = -1;
						previous = parent;
					}
					parent = current;
					if(current.left_thread == 1) {
						current = current.left_node;
					}else {
						current = null;
					}
				}else {
					if(pos != 1) {
						pos = 1;
						previous = parent;
					}
					parent = current;
					if(current.right_thread == 1) {
						current = current.right_node;
					}else {
						current = null;
					}
				}
			}
			if(parent.value > value) {
				parent.left_thread = 1;
				parent.left_node = newNode;
				newNode.left_node = previous;
				newNode.right_node = parent;
			}else {
				parent.right_thread = 1;
				parent.right_node = newNode;
				newNode.left_node = parent;
				newNode.right_node = previous;
			}
			return;
		}
		
	//通过中序遍历线索二叉树针对 addNodeToTree_bybook 方法创建的二叉树
	public void inOrderPrint() {
		ThreadNode tempNode;
		tempNode = rootNode;
		do {
			if(tempNode.right_thread == 0) {
				tempNode = tempNode.right_node;
			}else {
				tempNode = tempNode.right_node;
				while(tempNode.left_thread != 0) {
					tempNode = tempNode.left_node;
				}
			}
			
			if(tempNode != rootNode) {
				System.out.println("[ " + tempNode.value + "]");
			}
			
		}while(tempNode != rootNode);
	}
}






