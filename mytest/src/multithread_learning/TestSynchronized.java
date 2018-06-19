package multithread_learning;
/** 
* @author xiaohao 	
* @date ����ʱ�䣺Aug 7, 2017 3:11:26 PM 
* @version 1.0   
*/
public class TestSynchronized {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Sy sy = new Sy(0);
	        Sy sy2 = new Sy(1);
	        sy.setName("t1");
	        sy2.setName("t2");
	        sy.start();
	        sy2.start();
	}
}
class Sy extends Thread {
    private int flag ;

    static Object x1 = new Object();
    static Object x2 = new Object();

    public Sy(int flag) {
        this.flag = flag;
    }
    @Override
    public void run() {
        System.out.println(flag);
        try {
            if (flag == 0) {
                synchronized (x1) {
                    System.out.println(flag+"��ס��x1");
                    Thread.sleep(100); //sleep�����ͷ��������������
//                    x1.wait(1000);	//wait ���ͷŶ�����
                    synchronized (x2) {
                        System.out.println(flag+"��ס��x2");
                    }
                    System.out.println(flag+"�ͷ���x1��x2");
                }
            }
            if(flag == 1) {
                synchronized (x2) {
                    System.out.println(flag+"��ס��x2");
                    Thread.sleep(100);	//sleep�����ͷ��������������
//                    x2.wait(100);		//wait ���ͷŶ�����
                    synchronized (x1) {
                        System.out.println(flag+"��ס��x1");
                    }
                    System.out.println(flag+"�ͷ���x1��x2");
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}