package multithread_learning;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/** 
* @author xiaohao 	
* @date ����ʱ�䣺2017��5��9�� ����9:27:26 
* @version 1.0   
*/
public class thread_test {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub

//		Machine machine1=new Machine();
//		Machine machine2=new Machine();
//		machine1.start();
//		machine2.start();
//		machine1.run();
		
//		Thread main=Thread.currentThread();	//������߳�
//		main.setPriority(3);		
		Machine2 machine=new Machine2();
		Thread t1=new Thread(machine);	//����t1��t2�߳��������̴߳����ģ�����Ĭ�Ϻ����̵߳�ǰ���ȼ���ͬ
		Thread t2=new Thread(machine);
		Thread t3=new Thread(machine);
		t1.setName("t1");
		t2.setName("t2");
		t3.setName("t3");
//		t2.setPriority(Thread.MAX_PRIORITY);
//		System.out.println(main.getPriority());
//		System.out.println(t1.getPriority());
//		System.out.println(t2.getPriority());
		t1.start();
		t2.start();
		t3.start();
//		t1.join();
//		System.out.println("main:end");
		
		//  ʵ��Callable �ӿ�
//		FutureTask <String> task=new FutureTask <String> (new Machine_Callable());
//		new Thread(task).start();
//		System.out.println(task.get());
	}

}
