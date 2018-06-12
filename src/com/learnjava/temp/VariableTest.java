package com.learnjava.temp;


public class VariableTest {
	public static int var1 = 1;
	public static String str = "hello world !";
	public static ClassTest cla = new ClassTest();
	
	public VariableTest(){
		var1 = 1;
		str = "yoyo";
		System.out.println("var1:" + var1);
		System.out.println("str:" + str);
	}
	
	public static void main(String[] args) {
		new VariableTest();
		System.out.println(var1);
		System.out.println(str);
		
		
	}
}

class ClassTest{
	public static String aaa = "aaa";
	public static ClassTest2 cla2 = new ClassTest2();
	
	ClassTest(){
		System.out.println(aaa);
	}
}

class ClassTest2{
	public static String bbb = "bbb";
	
	ClassTest2(){
		System.out.println(bbb);
	}
}