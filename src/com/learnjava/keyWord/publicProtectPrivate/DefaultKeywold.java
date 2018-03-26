package com.learnjava.keyWord.publicProtectPrivate;

import com.learnjava.keyWord.publicProtectPrivate.other.TheDefultKeyword;

public class DefaultKeywold {
	public static void main(String[] args) {
		TestDefClass test = new TestDefClass();
		TheDefultKeyword test2 = new TheDefultKeyword();
		test.printName();
		test.toPrint();
		//该语句无法调用，应为不加访问修饰符的变量或方法，只允许在同一个包中进行访问
		//test2.printName();
		test2.toPrint();
	}
}

class TestDefClass{
	String name = "lili";
	int age = 27;
	
	//即不加任何访问修饰符，通常称为“默认访问模式“。该模式下，只允许在同一个包中进行访问
	void printName() {
		System.out.println(name);
	}
	
	public void toPrint() {
		printName();
	}
}