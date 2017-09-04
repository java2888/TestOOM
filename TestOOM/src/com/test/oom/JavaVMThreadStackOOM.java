package com.test.oom;

/*
 -Xss2m
 */
public class JavaVMThreadStackOOM {

	private void doLoop() {
		while(true){
			
		}
	}

	private void execThread() {
		while (true) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					doLoop();
				}
			});
			thread.start();
		}//while

	}

	public static void main(String[] args) {
			JavaVMThreadStackOOM javaVMThreadStackOOM=new JavaVMThreadStackOOM();
			javaVMThreadStackOOM.execThread();
	}

}
