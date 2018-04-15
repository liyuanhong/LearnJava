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
	
	void printNode(){
		System.out.println("name:" + this.name + " age:" + this.age);
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
	
	//获取linklist的长度
	int getLength() {
		int i = 1;
		if(isEmpty()) {
			return 0;
		}else {
			MyNode node = first;
			while(node.next != null) {
				node = node.next;
				i++;
			}
		}
		return i;
	}
	
	MyNode getIndexOfList(int index) {
		if(index > getLength()) {
			return null;
		}else if(index < 0) {
			return null;
		}else {
			MyNode node = first;
			int i = 1;
			while(i != index) {
				i++;
				node = node.next;
			}
			return node;
		}
	}
	
	//删除一个linklist节点
	void delAnNode(MyNode delNode) {
		if(first == delNode) {
			first = first.next;
		}else if(last == delNode){
			MyNode newNode = first;
			MyNode tmp = first;
			while(newNode != delNode) {
				newNode = tmp.next;
			}
			tmp.next = null;
		}else {
			MyNode newNode = first;
			MyNode tmp = first;
			while(newNode != delNode) {
				tmp = newNode;
				newNode = tmp.next;
			}
			tmp.next = newNode.next;
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
		linklist.insert("涛涛",25);
		linklist.insert("娜娜",25);
		linklist.insert("鑫鑫",24);
		linklist.insert("暄暄",27);
		linklist.insert("蚩蚩",25);
		linklist.insert("慧慧",25);
		linklist.printMyLinkList();
		//打印节点的长度
		System.out.println(linklist.getLength());
		System.out.println("---------------------------");
		//获取并打印节点的第六个元素
		linklist.getIndexOfList(6).printNode();
		//删除节点的第7个元素
		System.out.println("---------------------------");
		linklist.delAnNode(linklist.getIndexOfList(7));
		linklist.printMyLinkList();
		//再删除节点的第一个元素
		System.out.println("---------------------------");
		linklist.delAnNode(linklist.getIndexOfList(1));
		linklist.printMyLinkList();
		//.再删除节点的第三个元素
		System.out.println("---------------------------");
		linklist.delAnNode(linklist.getIndexOfList(3));
		linklist.printMyLinkList();
		
	}
}
