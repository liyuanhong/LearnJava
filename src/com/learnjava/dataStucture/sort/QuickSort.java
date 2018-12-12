package com.learnjava.dataStucture.sort;


/*
 * 快速排序方法：
 * 假设有n个记录：R1，R2，R3 ...  Rn ;其键值为：K1,K2,K3... Kn
 * 步骤1：取K为第一个键值，
 * 步骤2：由左向右找出一个键值Ki，使得Ki > K
 * 步骤3：由右向左找出一个键值Kj，使得Kj < K
 * 步骤4：若i < j,那么Ki与Kj交换，并继续步骤2的执行
 * 步骤5：若i >= j则将K与Kj交换，并以j为基准点将数据分为左右两部分，并以递归方式为左右两半进行排序，直到排序完成
 * 
 * 如下：
 * R1  R2  R3  R4  R5  R6  R7  R8  R9  R10
 * 28  6   40  2   63  9   58  16  47  20
 * K=28    i                           j 
 * 
 * R1  R2  R3  R4  R5  R6  R7  R8  R9  R10
 * 28  6   20  2   63  9   58  16  47  40
 * K=28            i           j         
 * 
 *
 */
public class QuickSort {
	public static void main(String[] args) {
		int data[] = {28,6,40,2,63,9,58,16,47,20};
		QuickSortCls quick = new QuickSortCls(data);
		quick.quick(quick.data,quick.size,0,quick.size -1);
	}
}

class QuickSortCls{
	int data[];
	int size;
	int process = 0;
	int temp;
	
	QuickSortCls(int data[]){
		this.data = data;
		size = data.length;
	}
	
	//快速排序算法
	public void quick(int data[],int size,int lf,int rg) {
		int left_index;    //数组左边的索引
		int right_index;   //数组右边的索引
		
		if(lf < rg) {    //如果rg >= lf 说明从前向后找和从后向前找数已经找到了中间位置，及排序完成 
			left_index = lf + 1;
			right_index = rg;
			while(true) {
				System.out.println("[处理过程" + process++ + "]=> ");
				for(int t = 0;t < size;t++) {
					System.out.print("[" + data[t] + "] ");
				}
				System.out.println("");
				//由左向右找出一个值大于 data[lf]
				for(int i = lf + 1;i <= size;i++) {   //执行步骤2
					if(data[i] >= data[lf]) {
						left_index = i;
						break;
					}
					left_index++;
				}
				//由右向左找出一个值小于data[lf]
				for(int j = rg;j >= lf + 1;j--) {    //执行步骤3
					if(data[j] <= data[lf]) {
						right_index = j;
						break;
					}
					right_index--;
				}
				
				if(left_index < right_index) {
					temp = data[right_index];
					data[right_index] = data[left_index];
					data[left_index] = temp;
				}else {
					break;
				}
			}
			
			if(left_index >= right_index) {  //执行步骤5
				temp = data[lf];
				data[lf] = data[right_index];
				data[right_index] = temp;
				
				quick(data,size,lf,right_index-1);
				quick(data,size,right_index+1,rg);
			}
		}
		
	}
}