package wangyiSpring_2017;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/** 
* @author xiaohao 	
* @date 创建时间：Aug 13, 2017 3:08:38 PM 
* @version 1.0   
*/
public class colorBrick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		char []ch= str.toCharArray();
		Set <Character> s= new <Character> HashSet();
		for(int i=0;i<ch.length;i++)
		{
			s.add(ch[i]);
		}		
		if(s.size()>2)
			System.out.println(0);
		else
			System.out.println(s.size());
	}

}
