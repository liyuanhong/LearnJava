package com.learnjava.grammar;

/**********************************************
 * 			java内部类学习
 * 			广泛意义上的内部类一般来说包括这四种：成员内部类、局部内部类、匿名内部类和静态内部类。
 * 			参考地址：https://www.cnblogs.com/dolphin0520/p/3811445.html
 **********************************************/


public class InnerClass {
	public static void main(String[] args) {
		new Dog("dog").say();
		//实例话内部类（需要通过一个外部内的实例来创建）
		Dog.Hashiqi ha = new Dog("dog").new Hashiqi();
		ha.say();
		System.out.println("------------------------------------------------");
		new Cat("cat").showColor();
		System.out.println("------------------------------------------------");
		//在这里定义了一个匿名内部类
		new Fish("fish").say(new FishSay() {
			
			@Override
			public void say() {
				System.out.println("I am a fish !");
				
			}
		});
		System.out.println("------------------------------------------------");
		new Bird.Swallow().getHead();
		
	}
}


/**********************************************
 * 			定义一个成员内部类
 * 			成员内部类是最普通的内部类，它的定义为位于另一个类的内部
 **********************************************/
class Dog{
	public String name;
	Dog(String name){
		this.name = name;
	}
	
	public void say() {
		new Hashiqi().say();
	}
	
	//这是换一个成员内部类
	class Hashiqi{
		public void say() {
			System.out.println("I am hashiqi !");
		}
	}
}

/**********************************************
 * 			定义一个局部内部类
 * 			局部内部类是定义在一个方法或者一个作用域里面的类，它和成员内部类的区别在于局部内部类的访问仅限于方法内或者该作用域内。
 **********************************************/
class Cat{
	public String name;
	Cat(String name){
		this.name = name;
	}
	
	public void showColor() {
		String color = "yellow";
		//在方法内定义了一个局部内部类
		class CatColor{
			public void getColor() {
				System.out.println(color);
			}
		}
		new CatColor().getColor();
	}
}

/**********************************************
 * 			定义一个匿名内部类
 * 			匿名内部类应该是平时我们编写代码时用得最多的，在编写事件监听的代码时使用匿名内部类不但方便，而且使代码更加容易维护。
 * 			在Android开发中给控件添加监听事件经常使用到匿名内部类
 * 
 *			1、使用匿名内部类时，我们必须是继承一个类或者实现一个接口，但是两者不可兼得，同时也只能继承一个类或者实现一个接口。
 *			2、匿名内部类中是不能定义构造函数的。
 *			3、匿名内部类中不能存在任何的静态成员变量和静态方法。
 *			4、匿名内部类为局部内部类，所以局部内部类的所有限制同样对匿名内部类生效。
 *			5、匿名内部类不能是抽象的，它必须要实现继承的类或者实现的接口的所有抽象方法
 ***********************************************/
class Fish{
	public String name;
	Fish(String name){
		this.name = name;
	}
	
	//匿名内部内参见main方法中的定义
	public void say(FishSay fSay) {
		fSay.say();
	}
}

abstract class FishSay{
	public abstract void say();
}

/**********************************************
 * 			定义一个静态内部类
 * 			静态内部类也是定义在另一个类里面的类，只不过在类的前面多了一个关键字static。
 * 			静态内部类是不需要依赖于外部类的，这点和类的静态成员属性有点类似，并且它不能使用外部类的非static成员变量或者方法，
 * 			这点很好理解，因为在没有外部类的对象的情况下，可以创建静态内部类的对象，如果允许访问外部类的非static成员就会产生矛盾，
 * 			因为外部类的非static成员必须依附于具体的对象。
 **********************************************/
class Bird{
	public String name;
	public static String head = "birdHead";
	
	Bird(String name){
		this.name = name;
	}
	
	static class Swallow{
		public void getHead() {
			//System.out.println(name);    //静态内部类无法使用外部类的非静态方法
			System.out.println(head);
		}
	}
}







