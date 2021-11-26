package com.glen.SpringCoreIOC;

public class Coder {
	
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Coder() {
		System.out.println("Coder Object created");
	}

	public void code() {
		System.out.println("Coding....");
	}
}
