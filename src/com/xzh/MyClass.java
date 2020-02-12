package com.xzh;

public class MyClass {
	private long salary=1000;

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public void foo(int number,String name){
		System.out.println("Inside MyClass.foo (int,String)");
	}

	public static void main(String[] args) {

		MyClass myClass1=new MyClass();

		myClass1.foo(1,"foo");

	}
}
