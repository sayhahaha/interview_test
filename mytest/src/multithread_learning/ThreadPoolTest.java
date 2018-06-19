package multithread_learning;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/** 
* @author xxh 	
* @date 创建时间：Sep 1, 2017 4:44:04 PM  
*/
public class ThreadPoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS,
                 new ArrayBlockingQueue<Runnable>(8));
		 for(int i=0;i<15;i++){
             MyTask myTask = new MyTask(i);
             executor.execute(myTask);
             System.out.println("线程池中线程数目："+executor.getPoolSize()+"，队列中等待执行的任务数目："+
             executor.getQueue().size());
         }
         executor.shutdown();
	}

}
