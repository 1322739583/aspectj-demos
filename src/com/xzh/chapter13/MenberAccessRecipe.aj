package com.xzh.chapter13;

import com.xzh.MyClass;

public privileged aspect MenberAccessRecipe {

//	pointcut executionMenberMethod():execution(void com.xzh.MyClass.foo(int,java.lang.String));
//
//	after(MyClass myClass):executionMenberMethod()&&this(myClass){
//		myClass.setSalary(200);
//		System.out.println(myClass.getSalary());
//		System.out.println(myClass.salary);
//	}
}
