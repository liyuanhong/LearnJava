package com.learnjava.dataStucture.sort;

//插入排序

public class InsertSort {
	static int data[] = {2,6,4,8,5,1,9,3};
	
	public static void main(String[] args) {
		print();
		doInsert();
	}
	
	//使用插入排序方法来排序
	public static void doInsert() {
		int i;
		int j;
		int temp;
		
		for(i = 1;i < data.length;i++) {
			temp = data[i];
			j = i - 1;
			while(j >= 0 && temp < data[j]) {
				data[j + 1] = data[j];
				j--;
			}
			data[j + 1] = temp;
			System.out.println("第" + i + "次扫描：");
			print();
		}
	}
	
	//打印元素数组
	public static void print() {
		int len = data.length;
		System.out.print("[");
		for(int i = 0;i < len;i++) {
			System.out.print(data[i]);
			if(i != len -1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
}
