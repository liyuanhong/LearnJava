package com.learnjava.javaSpecial.reflect;

import java.lang.reflect.Array;
import java.lang.reflect.Field;

/**************************************

		java 反射机制学习
参考地址：https://www.cnblogs.com/ysocean/p/6516248.html

 **************************************/


/**************************************
 *
 *		java获取类的3种方式
 * 
 **************************************/
public class ReflectTest {
	//方法一
	public static void getCls_1() {
		People per = new People();
		Class cla = per.getClass();
		
		System.out.println(cla);
		System.out.println(cla.getName());
		System.out.println(cla.getFields()[0]);
	}
	
	//方法二
	public static void getCls_2() {
		Class cla = People.class;
		System.out.println(cla);
		System.out.println(cla.getName());
		System.out.println(cla.getFields()[0]);
	}
	
	public static void getCls_3() {
		Class cla = null;
		try {
			cla = Class.forName("com.learnjava.javaSpecial.reflect.People");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(cla);
		System.out.println(cla.getName());
		System.out.println(cla.getFields()[0]);
	}
	
	//方法三
	public static void main(String[] args) {
		getCls_1();
		System.out.println("-------------------------------");
		getCls_2();
		System.out.println("-------------------------------");
		getCls_3();
		System.out.println("-------------------------------");
	}
}
