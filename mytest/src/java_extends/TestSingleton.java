package java_extends;
/** 
* @author xiaohao 	
* @date ����ʱ�䣺Aug 14, 2017 3:47:58 PM 
* @version 1.0   
*/
public class TestSingleton {

	public static void main(String args[]){
	    System.out.println(FinalTest.x);
	    
	    Singleton singleton = Singleton.getSingleton();
	    System.out.println("counter1="+singleton.counter1);
	    System.out.println("counter2="+singleton.counter2);

	  }
	}

	class FinalTest{
	  public static final int x =6/3;//final�ؼ������ε��ǳ���
	  static {
	      System.out.println("FinalTest static block");
	  }
}
