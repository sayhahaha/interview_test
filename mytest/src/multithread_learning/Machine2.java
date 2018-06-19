package multithread_learning;
/** 
* @author xiaohao 	
* @date 创建时间：2017年5月9日 下午10:01:55 
* @version 1.0   
*/
public class Machine2 implements Runnable {

	private int ticket=20;
	@Override
	public void run(){
	for(int i=0;i<10;i++)
	{
		synchronized(this){	//同步代码块，上锁
			if(this.ticket>0)
			{	
				try{
					Thread.sleep(100);
				}catch(InterruptedException e)
				{
					throw new RuntimeException(e);
				}
				System.out.println(Thread.currentThread().getName()+":"+this.ticket--);
			}
		}
	}
	}
	
}
