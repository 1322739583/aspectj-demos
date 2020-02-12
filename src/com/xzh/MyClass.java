package com.xzh;

public class MyClass {
	private long salary=50000;

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

		public MyClass(){
		//System.out.println("default constructor!");
			//setSalary(100);
	}

//	public MyClass(int number,String name){
//		System.out.println("number="+number+" name="+name);
//	}

	public void foo(int number,String name){
		System.out.println("Inside MyClass.foo (int,String)");
	}

	public static void main(String[] args) {


	 //	MyClass myClass=new MyClass(1,"foo");
		MyClass myClass1=new MyClass();

	}
}
