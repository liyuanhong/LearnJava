package com.learnjava.graph;

/*
 * 使用链表来实现无向图的表示
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

public class LinkUndirectedGraph {
	public static void main(String[] args) {
		//图形变现数组声明
		int[][] data = {{1,2},{1,5},{2,1},{2,3},{2,4},{3,2},{3,4},{3,5},{4,2},{4,3},{4,5},{5,1},{5,3},{5,4}};
		GraphLink head[] = new GraphLink[6];
		
		for(int i = 1;i < 6;i++) {
			head[i] = new GraphLink();
			System.out.print("定点" + i + "相连节点：");
			for(int j = 0;j < data.length;j++) {
				if(data[j][0] == i) {
					head[i].insert(data[j][1]);
				}
			}
			head[i].printNode();
			System.out.println("");
		}
	}
}

class GraphNode{
	int data;
	GraphNode next;
	
	GraphNode(int data){
		this.data = data;
		this.next = null;
	}
}

class GraphLink{
	GraphNode first;
	GraphNode last;
	
	GraphLink(){
		first = null;
		last = null;
	};
	public boolean isEmpty() {
		return first == null;
	}
	
	public void printNode() {
		GraphNode current = first;
		while(current != null) {
			System.out.print("[" + current.data + "]");
			current = current.next;
		}
	}
	
	public void insert(int data) {
		GraphNode node = new GraphNode(data);
		if(isEmpty()) {
			first = node;
			last = node;
		}else {
			last.next = node;
			last = node;
		}
	}
}

