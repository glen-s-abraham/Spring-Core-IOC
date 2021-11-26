package com.glen.SpringCoreIOC;

public class Coder {
	
	private int age;
	
	private Computer computer;
	
	public Coder() {
		System.out.println("Coder Object created");
	}
	
	public Coder(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public Computer getComputer() {
		return computer;
	}



	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	public void code() {
		System.out.println("Coding....");
		computer.compile();
	}
}
