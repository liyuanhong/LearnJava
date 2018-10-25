package com.learnjava.keyWord;

public class FinalKeyword extends Testaaa{
	/*
	 * 用来修饰数据，包括成员变量和局部变量，该变量只能被赋值一次且它的值无法被改变。对于成员变量来讲，我们必须在声明时或者构造方法中对它赋值；
	 *用来修饰方法参数，表示在变量的生存期中它的值不能被改变；
	 *修饰方法，表示该方法无法被重写；
	 *修饰类，表示该类无法被继承。
	 */
	
	
	public static void main(String[] args) {
		/*
		 * 用final关键字修饰的变量，只能进行一次赋值操作，并且在生存期内不可以改变它的值。更重要的是，
		 * final会告诉编译器，这个数据是不会修改的，那么编译器就可能会在编译时期就对该数据进行替换甚至执行计算，
		 * 这样可以对我们的程序起到一点优化。
		 */
		final int va1 = 27;
		final int va2;
		//va1 = 23;    //会报错，被final修饰已经赋值的变量无法修改值
		System.out.println(va1);
		va2 = 23;
		//va2 = 22;      //会报错，被final修饰的变量只能被赋值一次
		System.out.println(va2);
		
	}
	
	public void modifyVa(final int va3) {
		/*
		 * 如果变量是作为参数传入的，我们怎么保证它的值不会改变呢？这就用到了final的第二种用法，即在我们编写方法时，
		 * 可以在参数前面添加final关键字，它表示在整个方法中，我们不会（实际上是不能）改变参数的值
		 */
		//va3 = 26;    //会报错，不可对final修饰的形参改变其值
		System.out.println(va3);
	}
	
	
	/*
	 * 会报错，被final修饰的方法无法被重写
	 */
//	public String getName(){
//		return "aaa";
//	}
}

class Testaaa{
	String name = "lili";
	public final String getName() {
		return name;
	}
}

/*
 * final修饰的类无法被继承
 */
final class Testbbb{
	String str = "hahah";
	
	public String getStr() {
		return str;
	}
}






