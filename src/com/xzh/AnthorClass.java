package com.xzh;

public class AnthorClass {
	public void foo( ){
		System.out.println("Inside Method AnthorClass.foo");
		this.bar();
	}

	public void bar(){
		System.out.println("Inside Method AnthorClass.bar");
	}
}
