package com.xzh;

public class MyClass {
	private long salary=1000;

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	public void foo(int number,String name) {
		System.out.println("Inside MyClass.foo (int,String)");
	}

	public int foo(){
		System.out.println("foo inside");
		return 100;
	}

	public int bar(int number){
		System.out.println("bar inside");
		return 200;
	}

	public int baz(){
		System.out.println("baz inside");
		return 300;
	}

	public static void main(String[] args) {

		MyClass myClass=new MyClass();

			myClass.foo(1,"num");

	}
}
