package com.learnjava.graph;

/*
 * 使用先广后深法来遍历图
 * 
 *                  1
 *                 / \
 *                /   \     
 *               2-----|----3
 *               |     |  / |
 *               |     |/   |
 *               |    / \   |
 *               |  /     \ |
 *               4----------5
 */


public class TraverseGraphByBreadth {
	//定点是否遍历过0代表为遍历，1代表已经遍历
	public static int run[] = new int[6];
	//定义队列的前端
	public static int front = -1;
	//定义队列的后端
	public static int rear = -1;
	//定义数组队列的最大长度
	public static int MAX = 6;
	//定义一个队列数组，长度为节点的个数
	public static int queue[] = new int[MAX];
	
	//定义图形数组
	public static GraphByBreadthLink graph[] = new GraphByBreadthLink[6];
	
	//队列数据的存入
	public static void enqueue(int data) {
		if(rear >= MAX) return;
		rear++;
		queue[rear] = data;
	}
	
	//队列数据的取出
	public static int dequeue() {
		if(front == rear) return -1;
		front++;
		return queue[front];
	}
	
	//使用广度优先法遍历图
	public static void breadthTraverse(int current) {
		GraphByBreadth node;
		enqueue(current);  //将第一个节点存入队列
		run[current] = 1;   //将遍历过的节点值设置为1
		System.out.print("[" + current + "]");
		while(front != rear) {
			current = dequeue();
			node = graph[current].first;  //先记录定点的位置
			while(node != null) {
				if(run[node.data] == 0) {
					enqueue(node.data);
					run[node.data] = 1;   //记录该节点已经遍历过
					System.out.print("[" + node.data + "]");
				}
				node = node.next;
			}
		}
	}
	
	public static void main(String[] args) {
		//图形边线数组声明
		int[][] data = {{1,2},{1,5},{2,3},{2,4},{3,2},{3,4},{3,5},{4,2},{4,3},{4,5},{5,1},{5,3},{5,4}};
		int len = data.length;
		for(int i = 1;i < 6;i++) {
			run[i] = 0;   //设置每个定点都为没有遍历过
			graph[i] = new GraphByBreadthLink();
			System.out.print("顶点" + i + "=>");
			for(int m = 0;m < len;m++) {
				if(data[m][0] == i) {
					graph[i].insert(data[m][1]);
				}
			}
			graph[i].print();
		}
		System.out.println("广度优先遍历结果如下：");
		breadthTraverse(1);
		System.out.println("");
	}
}

class GraphByBreadth{
	int data;
	GraphByBreadth next;
	
	GraphByBreadth(int data){
		this.data = data;
		this.next = null;
	}
}

class GraphByBreadthLink{
	GraphByBreadth first;
	GraphByBreadth last;
	
	public GraphByBreadthLink(){
		this.first = null;
		this.last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void print() {
		GraphByBreadth current = first;
		while(current != null) {
			System.out.print("[" + current.data + "]");
			current = current.next;
		}
		System.out.println("");
	}
	
	public void insert(int data) {
		GraphByBreadth node = new GraphByBreadth(data);
		if(isEmpty()) {
			first = node;
			last = node;
		}else {
			last.next = node;
			last = node;
		}
	}
}





