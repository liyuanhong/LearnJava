package com.learnjava.temp;

public class Test1 {
	public static void main(String[] args) {
		int a,b = 0;
		a = b;
		b = 3;
		System.out.println(a);
		
		String m,n;
		n = "aaaaa";
		m = n;
		n = "bbbbb";
		System.out.println(m);
		
		TestA r,s;
		s = new TestA("mmmmmmmmm");
		r = s;
		s = new TestA("nnnnnnnn");
		System.out.println(r.a);
	}
}

class TestA{
	String a = "";
	TestA(String str){
		a = str;
	}
}
