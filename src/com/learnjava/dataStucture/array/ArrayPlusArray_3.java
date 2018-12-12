package com.learnjava.dataStucture.array;

/*
 * 使用二维数组来实现矩阵的相加，举证如下
 * A矩阵：            B矩阵：
 * [1 3 5]           [9 8 7]
 * [7 9 11]          [6 5 4]
 * [13 15 17]        [3 2 1]
 */

public class ArrayPlusArray_3 {
	public static void main(String[] args) {
		int ray1[][] = {{1,3,5},{7,9,11},{13,15,17}};
		int ray2[][] = {{9,8,7},{6,5,4},{3,2,1}};
		int ray3[][] = null;
		
		System.out.println("矩阵1如下：");
		printArr(ray1);
		System.out.println("矩阵2如下：");
		printArr(ray2);
		ray3 = arrayPlus(ray1,ray2);
		System.out.println("矩阵1加矩阵2结果如下：");
		printArr(ray3);
	}
	
	public static int[][] arrayPlus(int arr1[][],int arr2[][]) {
		int x = arr1.length;
		int y = arr1[0].length;
		int arr3[][] = new int[x][y];
		for(int i=0;i<x;i++) {
			for(int j=0;j<y;j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		} 
		return arr3;
	}
	
	public static void printArr(int arr[][]) {
		int x = arr.length;
		int y = arr[0].length;
		
		for(int i=0;i<x;i++) {
			String str = "[";
			for(int j=0;j<y;j++) {
				if(j == 0) {
					str = str + arr[i][j];
				}else {
					str = str + " " + arr[i][j];
				}
			}
			str = str + "]";
			System.out.println(str);
		}
	}
}
