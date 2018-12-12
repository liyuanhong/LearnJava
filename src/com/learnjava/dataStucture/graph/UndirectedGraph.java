package com.learnjava.dataStucture.graph;

/*
 * 使用矩阵来实现无向图的表示
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

public class UndirectedGraph {
	public static void main(String[] args) {
		int[][] data = {{1,2},{1,5},{2,1},{2,3},{2,4},{3,2},{3,4},{3,5},{4,2},{4,3},{4,5},{5,1},{5,3},{5,4}};
		int[][] arr = new int[6][6];
		int len = data.length;
		
		//初始化矩阵
		for(int i = 0;i < 6;i++) {
			for(int j = 0;j < 6;j++) {
				arr[i][j] = 0;
			}
		}
		
		//将数据存入矩阵
		for(int i = 0;i < len;i++) {
			arr[data[i][0]][data[i][1]] = 1;
		}
		
		//打印矩阵
		for(int i = 1; i < 6;i++) {
			for(int j = 1;j < 6;j++) {
				System.out.print("[" + arr[i][j] + "]");
			}
			System.out.println("");
		}
	}
}
