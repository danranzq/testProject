package com.project.test.loader;

class TestClass {
	static {
		System.out.println("this is a static code!");
	}

}
class SuperClass extends TestClass{
	static {
		System.out.println("this is a super class");
	}
	public static String staticVulue = "aaaa";
	public SuperClass(){
		System.out.println("this is a super class constructor!");
	}
}

public class SubClass extends SuperClass{
	static {
		System.out.println("this is a sub class");
	}
	static int a ;
	public SubClass() {
		System.out.println("this is a sub class constructor!");
	}
	
}
