package com.learnjava.search;

/*
 * 二分查找的实现
 */

public class BinarySearch {
	public static void main(String[] args) {
		int data[] = {1,3,6,8,13,22,25,28,40,44,57,66,79,80,89,122,123,250,255,298};
		BinarySearchExample searchExp = new BinarySearchExample(data);
		int index = searchExp.search(57);
		if(index == -1) {
			System.out.println("没有搜索到该值");
		}else {
			System.out.println("在第" + index + "位置找到了：" + data[index]);
		}
	}
}


class BinarySearchExample{
	int data[];
	BinarySearchExample(int data[]){
		this.data = data;
	}
	
	//二分查找的实现
	public int search(int value) {
		int mid;
		int low = 0;
		int high = data.length - 1;
		while(low <= high) {
			mid = (low + high)/2;
			if(value > data[mid]) {
				low = mid + 1;
			}else if(value < data[mid]) {
				high = mid -1;
			}else {
				return mid;
			}
		}
		return -1;
	}
	
	public int[] generateArr(int length) {
		int arr[] = new int[length];
		for(int i = 0;i < length;i++) {
			
		}
		return arr;
	}
}

