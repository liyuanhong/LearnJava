package com.learnjava.dataStucture.sort;

import java.util.Arrays;

//选择排序实现方法
public class SelectionSort {
	public static void main(String[] args) {
		int arr[] = {200,50,150,30,4,80,90,500,210};
		SelectionSortCase selection = new SelectionSortCase();
		selection.selectMethod1(arr);
	}
}

class SelectionSortCase{
	//使用选择排序升序排列
	void selectMethod1(int arr[]) {
		int len = arr.length;
		for(int i = 0;i < len;i++) {
			for(int j = i + 1;j < len;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("第" + (i + 1) + "次排序后为：" + Arrays.toString(arr));
		}
		System.out.println("排序后的结果为：" + Arrays.toString(arr));
	}
	
	//使用选择排序降序排列
	void selectMethod2(int arr[]) {
		int len = arr.length;
		for(int i = 0;i < len;i++) {
			for(int j = i + 1;j < len;j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.println("第" + (i + 1) + "次排序后为：" + Arrays.toString(arr));
		}
		System.out.println("排序后的结果为：" + Arrays.toString(arr));
	}
}
