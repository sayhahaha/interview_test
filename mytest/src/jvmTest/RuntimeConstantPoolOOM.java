package jvmTest;

import java.util.ArrayList;
import java.util.List;

/** 
* @author xxh 	
* @date ����ʱ�䣺Oct 6, 2017 10:52:39 AM  
*/
public class RuntimeConstantPoolOOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List <String> list = new ArrayList<String> ();
		int i=0;
//		while(true){
//			list.add(String.valueOf(i++).intern());
//		}
		String str1=new StringBuilder("�����").append("���").toString();
		System.out.println(str1.intern()==str1);
		String str2=new StringBuilder("�����").append("���").toString();
		System.out.println(str2.intern()==str1);
	}

}
