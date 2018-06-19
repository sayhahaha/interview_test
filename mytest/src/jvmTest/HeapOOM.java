package jvmTest;

import java.util.ArrayList;
import java.util.List;

/** 
* @author xxh 	
* @date 创建时间：Oct 6, 2017 10:26:41 AM  
*/
public class HeapOOM {

	static class OOMObject{}
	
	private static final int _1MB=1024*1024;
	public static void testAllocation(){
		byte []allocation1,allocation2,allocation3,allocation4;
		allocation1=new byte[2*_1MB];
		allocation2=new byte[2*_1MB];
		allocation3=new byte[2*_1MB];
		allocation4=new byte[4*_1MB];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <OOMObject> list = new ArrayList<>();
		int i=1000;
		while(true){
			list.add(new OOMObject());
//			System.gc();
		}
	}

}
