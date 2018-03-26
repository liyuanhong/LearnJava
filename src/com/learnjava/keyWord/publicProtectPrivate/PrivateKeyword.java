package com.learnjava.keyWord.publicProtectPrivate;

//public： Java语言中访问限制最宽的修饰符，一般称之为“公共的”。被其修饰的类、属性以及方法不仅可以跨类访问，而且允许跨包（package）访问。
//private: Java语言中对访问权限限制的最窄的修饰符，一般称之为“私有的”。被其修饰的类、属性以及方法只能被该类的对象访问，其子类不能访问，更不能允许跨包访问。
//protect: 介于public 和 private 之间的一种访问修饰符，一般称之为“保护形”。被其修饰的类、属性以及方法只能被类本身的方法及子类访问，即使子类在不同的包中也可以访问。
//default：即不加任何访问修饰符，通常称为“默认访问模式“。该模式下，只允许在同一个包中进行访问。


public class PrivateKeyword {
	public static void main(String[] args) {
		TestPriClass test = new TestPriClass();
		//声明为private的变量或方法，被其修饰的类、属性以及方法只能被该类的对象访问，其子类不能访问，更不能允许跨包访问
		//test.printHello();   
		//System.out.println(test.age);
		test.usePrintHello();
	}
}

class TestPriClass{
	private String name = "lili";
	private int age = 28;
	
	private void printHello() {
		System.out.println("hell world !");
	}
	
	public void usePrintHello() {
		printHello();
	}
}

