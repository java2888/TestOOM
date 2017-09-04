/**
 * 
 */
package com.test.oom;


import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 *
 */
public class HeapOOM {

	static class OOMObject{
		
	}
 

	/**
	 * @param args
	 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
	 */
	public static void main(String[] args) {
 
		List<OOMObject> list=new ArrayList<OOMObject>();
		while(true){
			list.add(new OOMObject());
		}
	}

}

/*static class OOMObject{
	
}*/

//List<OOMObject> list=new ArrayList<OOMObject>();
//while(true){
//	 list.add(new OOMObject());
//}
 