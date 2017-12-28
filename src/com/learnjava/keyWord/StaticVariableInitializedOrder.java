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