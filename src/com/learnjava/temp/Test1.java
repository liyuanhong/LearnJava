package com.learnjava.temp;

public class Test1 {
	public static void main(String[] args) {
		new Noname() {
			public void pri() {
				System.out.println("hello");
			}
		}.pri();
	}
}

class TestA{
	String a = "";
	TestA(String str){
		a = str;
	}
}

class Noname{
	
}