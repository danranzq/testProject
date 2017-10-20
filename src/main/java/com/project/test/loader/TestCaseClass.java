package com.project.test.loader;

import java.lang.reflect.Method;

public class TestCaseClass {
public static void main(String[] args) {
//	System.out.println(SubClass.staticVulue);
//	ClassLoader cl = Thread.currentThread().getContextClassLoader();
//	System.out.println(System.getProperty("sun.boot.class.path"));
//	System.out.println(System.getProperty("java.class.path"));
//	@SuppressWarnings("unused")
//	int a = 1;
//	ClassLoader cl1 = TestCaseClass.class.getClassLoader();
//	System.out.println(cl1.toString());
//	System.out.println(cl1.getParent().toString());
//	System.out.println(cl1.getParent().getParent().toString());
//	System.out.println(cl1.getParent().getParent().getParent().toString());
//	cl1 = Integer.class.getClassLoader();
//	System.out.println("@@@@@@"+cl1.toString());
	DiskClassLoader dcl = new DiskClassLoader("D:\\");
	try{
		@SuppressWarnings("rawtypes")
		Class cl = dcl.loadClass("com.project.test.loader.TestLoaderClass");
		if(cl != null){
			Object obj = cl.newInstance();
			Method me = cl.getDeclaredMethod("printInfo", null);
			me.invoke(obj, null);
		}
	} catch(Exception e){
		e.printStackTrace();
		}
	}

}
