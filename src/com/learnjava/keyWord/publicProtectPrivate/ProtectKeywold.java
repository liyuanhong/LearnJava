package com.learnjava.keyWord.publicProtectPrivate;

import com.learnjava.keyWord.publicProtectPrivate.other.TheProtectKeyword;

public class ProtectKeywold {
	public static void main(String[] args) {
		TestProClass test = new TestProClass();
		TheProtectKeyword test1 = new TheProtectKeyword();
		System.out.println(test.name);
		test.printName();
		test.doPrintName();
		
		//被其修饰的类、属性以及方法只能被类本身的方法及子类访问，即使子类在不同的包中也可以访问。
		//System.out.println(test1.name);
		//test1.printName();
		test1.doPrintName();
	}
}

class TestProClass{
	protected String name = "gougou";
	
	protected void printName(){
		System.out.println(name);
	}
	
	void doPrintName(){
		printName();
	}
}