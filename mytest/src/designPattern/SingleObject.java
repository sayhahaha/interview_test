package designPattern;
/** 
* @author xxh 	
* @date ����ʱ�䣺Oct 1, 2017 10:14:31 AM  
*/
public class SingleObject {

	//****����ʽ+synchronized�̰߳�ȫ
//	private static SingleObject instance; //����ʽ
//	private SingleObject(){}
//	public static synchronized SingleObject getInstance(){ //synchronized�̰߳�ȫ
//		if(instance==null)
//			instance=new SingleObject();
//		return instance;	
//	}

	//*****����ʽ+�̰߳�ȫ
//	private static SingleObject instance = new SingleObject();
//	private SingleObject(){}
//	public static SingleObject getInstance(){
//		return instance;
//	}
	
	//******˫����/˫��У����
	private volatile static SingleObject instance;
	private SingleObject(){}
	public static SingleObject getInstance(){
		if(instance==null){
			synchronized(SingleObject.class){
				if(instance==null)
					instance=new SingleObject();
			}
		}
		return instance;
	}
	
	public void showMessage(){
        System.out.println("Hello Singleton!");
    }
}
