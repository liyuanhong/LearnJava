package com.learnjava.dataStucture.search;


//通过线性探测发来解决哈希算法产生的碰撞问题
public class LineHashCrashDetect {
	public static void main(String[] args) {
		int indexbox = 10;
		int[] data = {5,15,7,10,11,2,1};
		int maxnum = data.length;
		LineHashCrashDetectExample hash = new LineHashCrashDetectExample(indexbox,maxnum,data);
		hash.initIndex();
		hash.createHash();
		hash.print();
		
	}
}

class LineHashCrashDetectExample{
	int indexbox;   //最大哈希元素
	int maxnum;     //最大哈希个数
	int index[];
	int data[];
	LineHashCrashDetectExample(int indexbox,int maxnum,int data[]){
		this.indexbox = indexbox;
		this.maxnum = maxnum;
		this.index = new int[indexbox];
		this.data = data;
	}
	
	//初始化索引
	public void initIndex() {
		for(int i = 0;i < indexbox;i++) {
			index[i] = -1;
		}
	}
	//使用除留余数发来建立哈希索引
	public void createHashIndex(int num) {
		int temp;
		temp = num % indexbox;
		while(true) {
			if(index[temp] == -1) {
				index[temp] = num;
				break;
			}
			temp = (temp + 1)%indexbox;
		}
	}
	
	//对数据创建哈希表
	public void createHash() {
		for(int i = 0;i < maxnum;i++) {
			createHashIndex(data[i]);
		}
	}
	
	//打印创建好的哈希表
	public void print() {
		for(int i = 0;i < indexbox;i++) {
			System.out.print("[" + index[i] + "]");
		}
	}
}
