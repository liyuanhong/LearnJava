package com.learnjava.stack;

//使用数组来模拟栈
class MyStackByArray {
	int stack[];
	int top;
	
	public MyStackByArray(int len) {
		stack = new int[len];
		top = -1;
	}
	
	//判断栈是否为空
	boolean isEmpty() {
		if(top == -1) {
			return true;
		}else {
			return false;
		}
	}
	
	//向栈存入数据
	public boolean push(int data) {
		if(top >= stack.length - 1) {
			System.out.println("堆栈已满！");
			return false;
		}else {
			stack[++top] = data;
			return true;
		}
	}
	
	//从栈顶取数据
	public int pop() {
		if(top == -1) {
			System.out.println("已到栈底！");
			return -1;
		}else {
			return stack[top--];
		}
	}
}
public class StackByArray{
	public static void main(String[] args) {
		MyStackByArray stack = new MyStackByArray(5);
		System.out.println(stack.pop());
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		
		int ind = stack.pop();
		while(ind != -1) {
			System.out.println(ind);
			ind = stack.pop();
		}
	}
}







