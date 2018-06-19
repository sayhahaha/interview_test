package java_extends;
/** 
* @author xiaohao 	
* @date 创建时间：Aug 14, 2017 3:47:30 PM 
* @version 1.0   
*/
public class Singleton {

	
	public static int counter1;
	public static int counter2 = 0;
	private static Singleton singleton = new Singleton();
	
	private Singleton() {
	    counter1++;
	    counter2++;
	}

	public static Singleton getSingleton() {
	    return singleton;
	}

}
