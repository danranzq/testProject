package com.project.test.basic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestClass {
public static void main(String[] args) {
	Set<String> set = new HashSet<String>();
	set.add("a");
	set.add("b");
	set.add("b");
	Iterator<String> it = set.iterator();
	while(it.hasNext()){
		System.out.println(it.next()+"");
	}
	
	for(String t:set){
		System.out.println(t);
	}
	
}
}
