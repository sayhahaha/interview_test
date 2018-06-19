package java_extends;
/** 
* @author xxh 	
* @date 创建时间：Aug 30, 2017 5:18:34 PM  
*/
public class TestDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Person per1 = new Person();
//		per1.name="小于子";
//		per1.age=30;	
//		Person per2 = new Person();
//		per2.name="张三";
//		per2.age=20;
//		per2=per1;//此步骤就是引用传递
//		per2.name="狗剩";
//		per1.info();
		
		String str="hello";
		fun(str);
		System.out.println(str);
	}

	public static void fun(String temp) {
		// TODO Auto-generated method stub
		temp="world";
	}
}
