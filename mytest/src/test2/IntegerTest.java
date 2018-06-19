package test2;
/** 
* @author xxh 	
* @date 创建时间：Sep 6, 2017 10:44:14 PM  
*/
public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i = new Integer(1);
		add(i);
		System.out.println(i.intValue());
		System.out.println(add(i));
	}

	public static Integer add(Integer i) {
		// TODO Auto-generated method stub
		Integer temp=i;
		temp+=3;
		return temp;
	}

}
