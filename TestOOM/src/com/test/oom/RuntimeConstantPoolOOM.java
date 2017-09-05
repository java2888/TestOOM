package com.test.oom;

import java.util.ArrayList;
import java.util.List;

/*
-XX:MetaspaceSize=3m -XX:MaxMetaspaceSize=3m
*/
public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {
		test_intern();
		 
		
/*		List<String> list=new ArrayList<String>();
		int i=0;
		while(true){
			list.add(String.valueOf(i++).intern());
			System.out.println("RuntimeConstantPoolOOM. i=" + i);
		}*/
	}
	
	public static void test_intern(){
		String str1=new StringBuilder("计算机").append("软件").toString();
		System.out.println(str1.intern()==str1);
		
		String str2=new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern()==str2);
	}

}
