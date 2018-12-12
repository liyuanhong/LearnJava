package com.learnjava.dataStucture.sort;

import java.util.Arrays;

//冒泡排序实现方法
public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = {33,30,8,16,500,200,150,55,3,7,2,9,4,6,20,12,18,400,320};
		BubbleSortCase bubble = new BubbleSortCase();
		bubble.printBubbleSortCase2(arr);
	}
}

class BubbleSortCase{
	//冒泡排序方式1
	void printBubbleSortCase1(int[] arr) {
		int len = arr.length;
		for(int i = 0;i < len - 1;i++) {
			for(int j = 0;j < len - i - 1;j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("第" + (i + 1) + "次排序后为：" + Arrays.toString(arr));
		}
		System.out.println("排序后的结果为：" + Arrays.toString(arr));
	}
	
	//冒泡排序方法2
	void printBubbleSortCase2(int arr[]) {
		int len = arr.length;
		for(int i = len - 1;i > 0;i--) {
			for(int j = 0;j < i;j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
			System.out.println("第" + (len -i) + "次排序后为：" + Arrays.toString(arr));
		}
		System.out.println("排序后的结果为：" + Arrays.toString(arr));
	}
	
	//冒泡排序方法3，增加了是否排好序的逻辑，减少了排序的次数
	void printBubbleSortCase3(int arr[]) {
		int len = arr.length;
		//判断是否还在排序，如果没有排序了则判断为已经排好序，从而停止排序
		int flag = 1;
		for(int i = len - 1;i > 0;i--) {
			if(flag != 0) {
				flag = 0;
				for(int j = 0;j < i;j++) {
					if(arr[j] > arr[j + 1]) {
						int temp = arr[j];
						arr[j] = arr[j + 1];
						arr[j + 1] = temp;
						flag++;
					}
				}
				System.out.println("第" + (len -i) + "次排序后为：" + Arrays.toString(arr));
			}else {
				break;
			}
		}
		System.out.println("排序后的结果为：" + Arrays.toString(arr));
	}
	
}
