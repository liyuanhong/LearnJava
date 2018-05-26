package com.learnjava.tree;

/*
 * 通过数组来实现二叉树
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
/*
 * 注意，建立二叉树必须遵守“小于父节点的值放在左子节点，大于父节点的值，放在右子节点”
 * 遵守这样规则的二叉树叫做“二叉排序树”
 */
public class ArrayBinaryTree {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("请输入数组的长度：");
		int arrayLen = 0;
		try {
			arrayLen = Integer.parseInt(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//定义一个将要转换为二叉树的数组
		int arr[] = new int[arrayLen];
		int num = 0;
		for(int i = 0;i < arrayLen;i++) {
			System.out.println("请输入数组的第" + i + 1 + "个数：" );
			try {
				arr[i] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		System.out.print("将要转换为二叉树的数组：");
		System.out.println(Arrays.toString(arr));
		
		//定义一个二叉树数组
		int treeArr[] = new int[2*arrayLen];
		int len = treeArr.length;
		for(int j = 0;j < len;j++) treeArr[j] = 0;
		
		System.out.print("将要存入的二叉树数组：");
		System.out.println(Arrays.toString(treeArr));
		
		//将数组存入二叉树数组
		int level;   
		for(int m = 0;m < arrayLen;m++) {
			for(level = 1;treeArr[level] != 0;) {
				if(arr[m] > treeArr[level]) {
					level = level*2 + 1;
				}else if(arr[m] <= treeArr[level]){
					level = level*2;
				}
			}
			treeArr[level] = arr[m];
		}
		
		System.out.print("生成后的二叉数组为（注意这里的二叉数组索引值从1开始）：");
		System.out.println(Arrays.toString(treeArr));
	}
}
