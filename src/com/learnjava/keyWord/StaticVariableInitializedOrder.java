package com.learnjava.keyWord;


/*
 * �����������ӿ��Կ�����
 * ��̬�������๹�췽������֮ǰ���Ѿ���ʼ������
 */

public class StaticVariableInitializedOrder {
	//�ڵ���main����֮ǰ���ȳ�ʼ������̬���� cla2
	public static void main(String[] args) {
		System.out.println("the main print");
	}
	//cla1 ����õ���ʼ��
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
	//�ڵ��ù��췽��֮ǰ���ȳ�ʼ��te1
	TestClass2(int var){
		System.out.println(str2);
		System.out.println("TestClass2-----" + var);
	}
}