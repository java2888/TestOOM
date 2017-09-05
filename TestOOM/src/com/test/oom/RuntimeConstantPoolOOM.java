package com.test.oom;

import java.util.ArrayList;
import java.util.List;

/*
-XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m
*/
public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		int i=0;
		while(true){
			list.add(String.valueOf(i++).intern());
		}
	}

}
