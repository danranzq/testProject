package com.project.test.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflect {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		Class cl = Class.forName("com.project.test.reflect.BookInfo");
		@SuppressWarnings("unused")
		BookInfo book = (BookInfo) cl.newInstance();
		book.setIsbn("11111100000000");
		 Method[] methods = cl.getDeclaredMethods();
		 Field[] fields = cl.getDeclaredFields();
		 Constructor[] cons = cl.getDeclaredConstructors();
		
		 methods[0].getName();
		Class[] pa = methods[0].getParameterTypes();
		 methods[0].getReturnType();
		 methods[0].getModifiers();
		 fields[0].getType();
		 fields[0].setAccessible(true);
		 fields[0].get(book);
		 
		 
		 
		 
		 System.out.println(methods[0].getReturnType().getName());
	}
 
}
