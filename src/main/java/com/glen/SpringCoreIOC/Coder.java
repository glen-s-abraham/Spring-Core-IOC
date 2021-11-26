package com.glen.SpringCoreIOC;

public class Coder {
	
	private int age;
	
	private Laptop laptop;
	
	public Coder() {
		System.out.println("Coder Object created");
	}
	

	
	public Coder(int age, Laptop laptop) {
		super();
		this.age = age;
		this.laptop = laptop;
	}



	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	public Laptop getLaptop() {
		return laptop;
	}


	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}


	public void code() {
		System.out.println("Coding....");
		laptop.compile();
	}
}
