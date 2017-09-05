package com.test.oom;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.omg.CORBA.PRIVATE_MEMBER;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/*
-XX:PermSize=10m  -XX:MaxPermSize=10m

-XX:MetaspaceSize=10m -XX:MaxMetaspaceSize=10m

*/
public class JavaMethodAreaOOM {
    private static int i=0;
	static class OOMObject{
		
	}
	
	public static void main(String[] args) throws Throwable{
		
		while(true){
			Enhancer enhancer=new Enhancer();
			enhancer.setSuperclass(OOMObject.class);
			enhancer.setUseCache(false);
			enhancer.setCallback(new MethodInterceptor() {				
				public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy arg3) throws Throwable {
					// TODO Auto-generated method stub
					return arg3.invokeSuper(arg0, arg2);
				}
			});
			enhancer.create();
			System.out.println("End. i=" + i++);
		}

	}

}
