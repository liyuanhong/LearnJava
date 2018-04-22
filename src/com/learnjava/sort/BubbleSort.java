package com.learnjava.sort;

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
}
