package designPattern;
/** 
* @author xxh 	
* @date ����ʱ�䣺Oct 1, 2017 10:29:00 AM  
*/
public class SingletonPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SingleObject instance=SingleObject.getInstance();
		instance.showMessage();
	}

}
