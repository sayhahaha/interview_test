package multithread_learning;

/** 
* @author xiaohao 	
* @date ����ʱ�䣺2017��5��9�� ����9:29:36 
* @version 1.0   
*/
public class Machine extends Thread {

	private int i=0;
	public void run(){
	for( i=0;i<10;i++)
	{
		System.out.println(currentThread().getName()+":"+i);
		try{
			sleep(100);
		}catch(InterruptedException e)
		{
			throw new RuntimeException(e);
		}
	}
	}
}
