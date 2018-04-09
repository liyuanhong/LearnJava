package com.learnjava.list;


/*
 * 定义一个MyNode节点
 * 用于当做链表的单个节点
 */
class MyNode{
	String name;
	int age;
	MyNode next;
	
	MyNode(String name,int age){
		this.name = name;
		this.age = age;
		this.next = null;
	}
}

/*
 * 定义一个自己的LinkList实现类
 */

class MyLinkList{
	MyNode first;
	MyNode last;
	
	boolean isEmpty(){
		return first == null;
	}
	
	//插入一个linklist node 元素
	void insert(String name,int age) {
		MyNode node = new MyNode(name,age);
		if(isEmpty()) {
			this.first = node;
			this.last = node;
		}else {
			this.last.next = node;
			this.last = node;
		}
	}
	
	//打印整个linklist
	void printMyLinkList() {
		MyNode current = first;
		while(current != null) {
			System.out.println("name:" + current.name + " age:" + current.age);
			current = current.next;
		}
	}
}

public class LinkListTest {
	public static void main(String[] args) {
		MyLinkList linklist = new MyLinkList();
		linklist.insert("liuhai",25);
		linklist.insert("刘涛",25);
		linklist.insert("王鑫鑫",24);
		linklist.printMyLinkList();
	}
}
