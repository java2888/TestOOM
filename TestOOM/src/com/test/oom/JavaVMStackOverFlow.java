package com.test.oom;

public class JavaVMStackOverFlow {
	private int length=1;
	private void stackOverFlow(){
		length++;
		stackOverFlow();
	}

	public static void main(String[] args) {
		 
		JavaVMStackOverFlow oom=new JavaVMStackOverFlow();
		try {
			oom.stackOverFlow();
		} catch (Throwable e) {
			System.out.println("length=" + oom.length );
			throw e;
		}
		
	}

}

// -Xss120k

/*private int stackLength = 1;

private void stackLeakDemo() {
	stackLength++;
	stackLeakDemo();
}*/


/*JavaVMStackOverFlow oom = new JavaVMStackOverFlow();
try {
	oom.stackLeakDemo();
} catch (Throwable e) {
	System.out.println("stackLength = " + oom.stackLength);
	throw e;
}*/


