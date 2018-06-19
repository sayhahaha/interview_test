package designPattern;
/** 
* @author xxh 	
* @date 创建时间：Oct 1, 2017 10:14:31 AM  
*/
public class SingleObject {

	//****懒汉式+synchronized线程安全
//	private static SingleObject instance; //懒汉式
//	private SingleObject(){}
//	public static synchronized SingleObject getInstance(){ //synchronized线程安全
//		if(instance==null)
//			instance=new SingleObject();
//		return instance;	
//	}

	//*****饿汉式+线程安全
//	private static SingleObject instance = new SingleObject();
//	private SingleObject(){}
//	public static SingleObject getInstance(){
//		return instance;
//	}
	
	//******双检锁/双重校验锁
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
