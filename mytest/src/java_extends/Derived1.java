package java_extends;
/** 
* @author xxh 	
* @date 创建时间：Oct 15, 2017 12:42:44 PM  
*/
public class Derived1 extends Base1{

	
	private String num;
	Derived1(){
		System.out.println("1");
	}
	
	Derived1(String num){
		this.num=num;
		System.out.println(this.num);
	}
	static {
		System.out.println("2");
	}
	{
		System.out.println("3");
	}
	
	
	public void method(){
		System.out.println("4");
	}
	public static void main(String args[]){
		System.out.println("5");
		Base1 base =new Derived1("6");
		base.method();
//		base.methodDerived();
	}
}
