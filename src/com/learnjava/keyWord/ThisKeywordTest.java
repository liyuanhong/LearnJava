package com.learnjava.keyWord;

public class ThisKeywordTest {
	public static void main(String[] args) {
		People peo = new People(22, "male", "lili");
		System.out.println(peo.getName());
	}
}


class People{
	private int age;
	private String sex;
	private String name;
	
	public People(int age,String sex,String name){
		this.age = age;
		this.sex = sex;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}