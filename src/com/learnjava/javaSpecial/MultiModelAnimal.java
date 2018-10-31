package com.learnjava.javaSpecial;

/*
 * 多态实验
 */

public class MultiModelAnimal {
	public static void main(String[] args) {
		Master master = new Master();
		Animal cat = new Cat();
		Animal dog = new Dog();
		Food fish = new Fish();
		Food bone = new Bone();
		
		cat.cry();
		dog.cry();
		master.feed(cat,fish);
		master.feed(dog,bone);
	}
}

class Animal{
	private String name = "";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void cry() {
		
	}
	public void eat() {
		
	}
}

class Cat extends Animal{
	public Cat() {
		setName("猫咪");
	}
	public void cry() {
		System.out.println("喵喵喵");
	}
	public void eat() {
		System.out.println("我是猫咪，我爱吃鱼！");
	}
}

class Dog extends Animal{
	public Dog() {
		setName("狗儿");
	}
	public void cry() {
		System.out.println("汪汪汪");
	}
	public void eat() {
		System.out.println("我是狗儿，我爱骨头！");
	}
}

class Food{
	public void showName() {
		
	}
}

class Fish extends Food{
	@Override
	public void showName() {
		System.out.println("鱼");
	}
}

class Bone extends Food{
	@Override
	public void showName() {
		System.out.println("骨头");
	}
}

class Master{
	public void feed(Animal animal,Food food) {
		animal.eat();
		food.showName();
	}
}


