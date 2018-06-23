package com.learnjava.graph;

/*
 * 使用深度优先法来遍历图
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

public class TraverseGraphByDepth {
	//定点是否遍历过0代表为遍历，1代表已经遍历
	public static int[] run = new int[6];
	//定义图形数组
	public static GraphByDepthLink[] graph= new GraphByDepthLink[6];
	
	//定义深度优先遍历算法，从某个顶点开始遍历
	public static void depthTraverse(int current) {
		//设置该顶点已经被遍历过
		run[current] = 1;
		System.out.println("[" + current + "]");
		while(graph[current].first != null) {
			if(run[graph[current].first.data] == 0) {
				depthTraverse(graph[current].first.data);
			}
			graph[current].first = graph[current].first.next;
		}
	}
	
	public static void main(String[] args) {
		//图形边线数组声明
		int[][] data = {{1,2},{1,5},{2,3},{2,4},{3,2},{3,4},{3,5},{4,2},{4,3},{4,5},{5,1},{5,3},{5,4}};
		int len = data.length;
		for(int i = 1;i < 6;i++) {
			run[i] = 0;   //设置每个定点都为没有遍历过
			graph[i] = new GraphByDepthLink();
			System.out.print("顶点" + i + "=>");
			for(int m = 0;m < len;m++) {
				if(data[m][0] == i) {
					graph[i].insert(data[m][1]);
				}
			}
			graph[i].print();
		}
		//从第一个节点开始遍历
		depthTraverse(1);
		System.out.println("");
	}
}

//定义一个节点
class GraphByDepthNode{
	int data;
	GraphByDepthNode next;
	
	GraphByDepthNode(int data){
		this.data = data;
		next = null;
	}
}

//定义链表
class GraphByDepthLink{
	GraphByDepthNode first;
	GraphByDepthNode last;
	
	public GraphByDepthLink(){
		first = null;
		last = null;
	}
	
	public boolean isEmpty() {
		return first == null;
	}
	
	public void insert(int data) {
		GraphByDepthNode node = new GraphByDepthNode(data);
		if(isEmpty()) {
			first = node;
			last = node;
		}else {
			last.next = node;
			last = node;
		}
	}
	
	public void print() {
		GraphByDepthNode current = first;
		while(current != null) {
			System.out.print("[" + current.data + "]");
			current = current.next;
		}
		System.out.println("");
	}
}

