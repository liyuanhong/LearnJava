package com.learnjava.dataStucture.graph;

/*
 * 使用矩阵来表示有向图
 * 
 *       2 <======> 1
 *       | \
 *       |   \
 *       |     \
 *       v       v  
 *       4 -----> 3
 * 
 */
public class DirectedGraph {
	public static void main(String[] args) {
		int data[][] = {{1,2},{2,1},{2,3},{2,4},{4,3}};
		int arr[][] = new int[5][5];
		int len = data.length;
		
		for(int i = 0;i < 5;i++) {
			for(int j = 0;j < 5;j++) {
				arr[i][j] = 0;
			}
		}
		
		for(int i = 0;i < len;i++) {
			arr[data[i][0]][data[i][1]] = 1;
		}
		
		System.out.println("有向图形矩阵如下：");
		
		for(int i = 1;i < 5;i++) {
			for(int j = 1;j < 5;j++) {
				System.out.print("[" + arr[i][j] + "]");
			}
			System.out.println("");
		}
	}
}
