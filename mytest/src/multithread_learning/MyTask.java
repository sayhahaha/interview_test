package multithread_learning;
/** 
* @author xxh 	
* @date ����ʱ�䣺Sep 1, 2017 4:42:46 PM  
*/
public class MyTask implements Runnable {

	private int taskNum;
    
    public MyTask(int num) {
        this.taskNum = num;
    }
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("����ִ��task "+taskNum);
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("task "+taskNum+"ִ�����");
	}

}
