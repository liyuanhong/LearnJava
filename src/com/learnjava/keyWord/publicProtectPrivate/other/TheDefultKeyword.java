package com.learnjava.keyWord.publicProtectPrivate.other;

public class TheDefultKeyword {
	String name = "liming";
	int age = 28;
	
	//即不加任何访问修饰符，通常称为“默认访问模式“。该模式下，只允许在同一个包中进行访问
	void printName() {
		System.out.println(name);
	}
	
	public void toPrint() {
		printName();
	}
}
