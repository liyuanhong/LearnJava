package com.learnjava.keyWord;


/*
 * 运行以下例子可以看出：
 * 静态变量在类构造方法调用之前就已经初始化好了
 */

public class StaticVariableInitializedOrder {
	//在调用main方法之前会先初始化将静态变量 cla2
	public static void main(String[] args) {
		System.out.println("the main print");
	}
	//cla1 不会得到初始化
	public TestClass1 cla1 = new TestClass1(100);
	public static TestClass2 cla2 = new TestClass2(800);
	//cla11的初始化不会打印任何内容，因为静态初始化只在类首次加载的时候才会进行（首次价值是指java虚拟机把class文件读入内存的过程）
	//而TestClass1在初始化cla2的时候就已经加载过了
	public TestClass1 cla11 = new TestClass1(111);
}

class TestClass1{
	public static String str1 = "hello--1";
	TestClass1(int var){
		System.out.println(str1);
		System.out.println("TestClass1-----" + var);
	}
}

class TestClass2{
	public static String str2 = "hello--2";
	public static TestClass1 te1 = new TestClass1(0);
	//在调用构造方法之前会先初始化te1
	TestClass2(int var){
		System.out.println(str2);
		System.out.println("TestClass2-----" + var);
	}
}