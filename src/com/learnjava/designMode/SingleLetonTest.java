package com.learnjava.designMode;

/****************************************
 * 
 * 		学习java单例模式的5中写法
 * 		单例模式定义：单例模式确保某个类只有一个实例，而且自行实例化并向整个系统提供这个实例。
 * 		参考地址：https://www.cnblogs.com/garryfu/p/7976546.html
 * 
 ****************************************/

public class SingleLetonTest {
	public static void main(String[] args) {
		SinglePeople1 peo1 = SinglePeople1.getInstance();
		SinglePeople2 peo2 = SinglePeople2.getInstance();
	}
}

//方法一：饱汉模式(懒汉模式)
//优点：懒加载启动快，资源占用小，使用时才实例化，无锁。
//缺点：非线程安全。
//事实上，通过Java反射机制是能够实例化构造方法为private的类的，那基本上会使所有的Java单例实现失效。
class SinglePeople1{
	private static SinglePeople1 peo1 = null;
	private SinglePeople1() {
		System.out.println("create SinglePeople1");
	}
	
	public static SinglePeople1 getInstance() {
		if(peo1 == null) {
			peo1 = new SinglePeople1();
		}
		return peo1;
	}
}


//方法二：饿汉模式
//优点：饿汉模式天生是线程安全的，使用时没有延迟。
//缺点：启动时即创建实例，启动慢，有可能造成资源浪费

class SinglePeople2{
	private static SinglePeople2 peo2 = new SinglePeople2();
	private SinglePeople2() {
		System.out.println("create SinglePeople2");
	}
	
	public static SinglePeople2 getInstance() {
		return peo2;
	}
}

//方法三：






