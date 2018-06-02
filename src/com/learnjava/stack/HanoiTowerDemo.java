package com.learnjava.stack;

import java.util.Arrays;

/*
 * 汉诺塔的java实现demo
 */

public class HanoiTowerDemo {
	public static void main(String[] args) {
//		HanoiTowerStack stack1 = new HanoiTowerStack(7);
//		stack1.printStack();
//		System.out.println(stack1.isStackAscendingSort());
//		stack1.push(11);
//		System.out.println(stack1.pop());
//		stack1.printStack();
//		stack1.push(9);
//		stack1.printStack();
//		System.out.println(stack1.isStackAscendingSort());
		
		HanoiTowerExample hanoi = new HanoiTowerExample(9);
		hanoi.moveStack();

	}
}

/*
 * 定义一个汉诺塔类
 */

class HanoiTowerExample{
	HanoiTowerStack stack1;
	HanoiTowerStack stack2;
	HanoiTowerStack stack3;
	int len;
	public HanoiTowerExample(int len) {
		this.len = len;
		stack1 = new HanoiTowerStack(len);
		stack2 = new HanoiTowerStack(len);
		stack2.clearStack();
		stack3 = new HanoiTowerStack(len);
		stack3.clearStack();
	}
	
	//打印栈
	public void printStack() {
		System.out.print("栈1：");
		stack1.printStack();
		System.out.print("栈2：");
		stack2.printStack();
		System.out.print("栈3：");
		stack3.printStack();
		System.out.println("stack1:" + stack1.isStackAscendingSort() + "  stack2:" + stack2.isStackAscendingSort() + "  stack3:" + stack3.isStackAscendingSort());
		System.out.println("----------------");
	}
	
	//定义汉诺塔算法
	public void hanoi(int len,HanoiTowerStack sta1,HanoiTowerStack sta2,HanoiTowerStack sta3) {
		if(len == 1) {
			int value = sta1.pop();
			sta3.push(value);
			printStack();
		}else {
			hanoi(len-1,sta1,sta3,sta2);
			int value = sta1.pop();
			sta3.push(value);
			printStack();
			hanoi(len-1,sta2,sta1,sta3);
		}
	}
	
	//移动汉诺塔
	public void moveStack() {
		System.out.print("原始栈1：");
		stack1.printStack();
		System.out.print("原始栈2：");
		stack2.printStack();
		System.out.print("原始栈3：");
		stack3.printStack();
		System.out.println("======================");
		hanoi(len,stack1,stack2,stack3);
	}
}

/*
 * 定义将要作为实验的汉诺塔栈
 */

class HanoiTowerStack{
	int[] stack;
	int top = -1;
	int length = 0;
	public HanoiTowerStack(int length) {
		this.stack = new int[length];
		this.top = length - 1;
		this.length = length;
		for(int i = length;i >= 1;i--) {
			stack[length - i] = i;
		}	
	}
	
	//打印栈
	public void printStack() {
		for(int i = top;i >= 0;i--) {
			System.out.print("[" + stack[i] + "]");
		}
		System.out.println("");
	}
	
	//弹出栈顶数据
	public int pop() {
		int value;
		if(top != -1) {
			value = stack[top];
			top = top -1;
			return value;
		}else {
			value = -1;
			top = -1;
			return value;
		}
	}
	
	//向栈顶存入一个数据
	public void push(int value) {
		if(top != length - 1) {
			stack[top + 1] = value;
			top = top + 1;
		}else {
			System.out.println("栈已满");
		}
	}
	
	//验证该栈是否从小到大排列
	public boolean isStackAscendingSort() {
		if(top == -1 || top == 1) {
			return true;
		}
		for(int i = top;i >= 1;i--) {
			if(stack[i] > stack[i - 1]) {
				return false;
			}
		}
		return true;
	}
	
	//清空栈
	public void clearStack() {
		top = -1;
	}
}