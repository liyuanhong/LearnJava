package com.learnjava.list;

//定义一个双向链表的节点
class DoubleListNode{
	String name;
	int age;
	DoubleListNode previous;
	DoubleListNode next;
	
	DoubleListNode(int age,String name){
		this.age = age;
		this.name = name;
		previous = null;
		next = null;
	}
	
	void printNode(){
		System.out.println("姓名：" + name + "  年龄：" + age);
	}
}

class MyDoubleList{
	DoubleListNode first;
	DoubleListNode last;
	
	public boolean isEmpty() {
		return first == null;
	}
	
	//插入一个节点
	public void insert(int age,String name){
		DoubleListNode node = new DoubleListNode(age,name);
		if(isEmpty()) {
			first = node;
			last = node;
			node.previous = null;
			node.next = null;
		}else {
			node.previous = last;
			last.next = node;
			last = node;
			node.next = null;
		}
	}
	//插入一个节点
	public void insert(DoubleListNode node) {
		if(isEmpty()) {
			first = node;
			last = node;
			node.previous = null;
			node.next = null;
		}else {
			node.previous = last;
			last.next = node;
			last = node;
			node.next = null;
		}
	}
	
	//从某个位置插入节点
	public void insert(DoubleListNode node,int index) {
		
	}
	
	//打印整个链表
	void printAllNode() {
		if(isEmpty()) {
			System.out.println("双向链表为空");
		}else {
			DoubleListNode node = this.first;
			while(node != null) {
				node.printNode();
				node = node.next;
			}
		}
	}
	
	//获取双向链表长度
	int getLength() {
		int len = 0;
		if(isEmpty()) {
			return len;
		}else {
			DoubleListNode node = this.first;
			while(node != null) {
				len++;
				node = node.next;
			}
			return len;
		}
	}
	
	//通过索引获取节点
	DoubleListNode getNode(int index) {
		int len = getLength();
		if(isEmpty()) {
			return null;
		}else if(index <= 0) {
			return null;
		}else if(index > len) {
			return null;
		}else if(len == index){
			return last;
		}else {
			int i = 1;
			DoubleListNode node = this.first;
			while(index != i) {
				i++;
				node = node.next;
			}
			return node;
		}
	}
	
	//根据索引删除节点
	void delAnNode(int index) {
		int len = getLength();
		if(index <= 0) {
			
		}else if(index == 1) {
			
		}else if(index == len) {
			
		}else if(index < len) {
			
		}else if(index > len) {
			
		}
	}
}

public class DoubleList {
	public static void main(String[] args) {
		MyDoubleList doubleList = new MyDoubleList();
		doubleList.printAllNode();
		System.out.println("链表长度为：" + doubleList.getLength());
		System.out.println("------------------------------------------\n");
		
		DoubleListNode node1 = new DoubleListNode(25,"丹丹");
		DoubleListNode node2 = new DoubleListNode(26,"奔奔");
		DoubleListNode node3 = new DoubleListNode(26,"慧慧");
		DoubleListNode node4 = new DoubleListNode(25,"蚩蚩");
		doubleList.insert(node1);
		doubleList.insert(node2);
		doubleList.insert(node3);
		doubleList.insert(node4);
		doubleList.insert(22,"秀秀");
		System.out.println("链表长度为：" + doubleList.getLength());
		doubleList.printAllNode();
		System.out.println("------------------------------------------\n");
		
		doubleList.last.previous.printNode();
		System.out.println("------------------------------------------\n");
		
		doubleList.getNode(4).printNode();
		System.out.println("------------------------------------------\n");
		
	}
}
