package com.learnjava.keyWord;

/*
 * 参考地址：https://blog.csdn.net/zyhlwzy/article/details/79045066
 * https://www.cnblogs.com/jin-zhe/p/8259422.html
 * 枚举的本质与作用：
 * 枚举的本质是类，在没有枚举之前，仍然可以按照java最基本的编程手段来解决需要用到枚举的地方。
 * 枚举屏蔽了枚举值的类型信息，不像在用public static final定义变量必须指定类型。
 * 枚举是用来构建常量数据结构的模板，这个模板可扩展。
 */

public class EnumKeyword {
	public static void main(String[] args) {
		System.out.println(Day.MONDAY);
		System.out.println(Day1.MONDAY.name);
		System.out.println(Day2.THRUSDAY.getInfo());
	}
}


/*
 * enum，与class关键字类似，只不过前者是定义枚举类型，后者是定义类类型。
 * 枚举类型Day中分别定义了从周一到周日的值，这里要注意，值一般是大写的字母，
 * 多个值之间以逗号分隔。同时我们应该知道的是枚举类型可以像类(class)类型一样，
 * 定义为一个单独的文件，当然也可以定义在其他类内部，
 * 
 * 原理：实际上在使用关键字enum创建枚举类型并编译后，编译器会为我们生成一个相关的类，
 * 这个类继承了Java API中的java.lang.Enum类，
 * 也就是说通过关键字enum创建枚举类型在编译后事实上也是一个类类型而且该类继承自java.lang.Enum类。
 */

/**********************************************
 *			枚举作为特殊的类
 **********************************************/
enum Day{
	MONDAY,
	TUESDAY,
	WEDENSDAY,
	THRUSDAY,
	FRIDAY,
	SATUDAY,
	SUNDAY
}

//给枚举类型添加构造函数,让枚举的选项有属性和值
//枚举是一个特殊的类，因此它是可拓展的。这意味着他们可以有实例字段、构造器和方法
//（默认无参构造器不能够被声明并且所有的构造器必须被private修饰）

/**********************************************
 *				枚举与实例字段
 **********************************************/
enum Day1{
	MONDAY("周一",1,false),
	TUESDAY("周二",2,false),
	WEDENSDAY("周三",3,false),
	THRUSDAY("周四",4,false),
	FRIDAY("周五",5,false),
	SATUDAY("周六",6,false),
	SUNDAY("周七",7,false);
	
	public final String name;
	public final int index;
	public final boolean isWeekend;
	
	//定义一个枚举构造器
	private Day1(String name,int index,boolean isWeekend) {
		this.name = name;
		this.index =- index;
		this.isWeekend = isWeekend;
	}
}

/**********************************************
 *				枚举与接口
 **********************************************/
interface Behaviour{
	void pirnt();
	String getInfo();
}

enum Day2 implements Behaviour{
	MONDAY("周一",1,false),
	TUESDAY("周二",2,false),
	WEDENSDAY("周三",3,false),
	THRUSDAY("周四",4,false),
	FRIDAY("周五",5,false),
	SATUDAY("周六",6,false),
	SUNDAY("周七",7,false);

	
	public final String name;
	public final int index;
	public final boolean isWeekend;
	
	//定义一个枚举构造器
		private Day2(String name,int index,boolean isWeekend) {
			this.name = name;
			this.index =- index;
			this.isWeekend = isWeekend;
		}
	@Override
	public void pirnt() {
		System.out.println(this.name + "," + this.index + "," + this.isWeekend);
	}

	@Override
	public String getInfo() {
		return this.name + "," + this.index + "," + this.isWeekend;
	}
	
}


