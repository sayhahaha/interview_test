package java_extends;
/** 
* @author xiaohao 	
* @date ����ʱ�䣺2017��5��15�� ����10:48:38 
* @version 1.0   
*/
public class Base {
	private String name = "base";

    public Base() {
        tellName();
        printName();
    }
    
    public void tellName() {
        System.out.println("Base tell name: " + name);
    }
    
    public void printName() {
        System.out.println("Base print name: " + name);
    }
}
