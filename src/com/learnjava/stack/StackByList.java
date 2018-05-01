package com.learnjava.stack;

class StackNode{
	int data;
	StackNode pre;
	public StackNode(int data) {
		this.data = data;
		pre = null;
	}
}

//使用链表来实现堆栈
class MyStackByList{
	//指向栈顶的指针
	StackNode top;
	//指向栈底的指针
	StackNode bottom;
	
	//判断栈是否为空
	boolean isEmpty(){
		return bottom == null;
	}
	
	//向栈顶插入数据
	public void insert(int data) {
		StackNode node = new StackNode(data);
		if(isEmpty()) {
			bottom = node;
			top = node;
		}else {
			node.pre = top;
			top = node;
		}
	}
	
	//打印栈
	public void printStack() {
		StackNode node = top;
		while(node != null) {
			System.out.println("栈数据为：" + node.data);
			node = node.pre;
		}
	}
	
	//从栈顶删除一条数据
	public StackNode pop() {
		StackNode node = null;
		if(isEmpty()) {
			System.out.println("栈已经为空了！");
			return null;
		}else if(top == bottom){
			node = top;
			top = null;
			bottom = null;
			return node;
		}else {
			node = top;
			top = top.pre;
			return node;
		}
	}
	
}

public class StackByList {
	public static void main(String[] args) {
		MyStackByList stack = new MyStackByList();
		stack.insert(1);
		stack.insert(3);
		stack.insert(5);
		stack.insert(7);
		stack.insert(9);
		stack.insert(11);
		stack.printStack();
		System.out.println("----------------------------");
		stack.pop();
		stack.pop();
		stack.pop();
		stack.printStack();
		System.out.println("----------------------------");
		stack.pop();
		stack.pop();
		stack.printStack();
		System.out.println("----------------------------");
		stack.pop();
		stack.printStack();
		System.out.println("----------------------------");
		stack.pop();
		stack.printStack();
		System.out.println("----------------------------");
	}
}


