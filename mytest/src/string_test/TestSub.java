package string_test;
/** 
* @author xiaohao 	
* @date ����ʱ�䣺Jul 31, 2017 3:51:47 PM 
* @version 1.0   
*/
public class TestSub extends Test{
	
	
	static Sample staticSamSub=new Sample("���� ��̬��ԱstaticSamSub1��ʼ��");
    TestSub()
    {
          System.out.println("���� TestSub Ĭ�Ϲ��캯��������");
    }
    Sample sam1=new Sample("���� sam1��Ա��ʼ��");
    static Sample staticSamSub1=new Sample("���� ��̬��ԱstaticSamSub2��ʼ��");
    
    static{System.out.println("���� static ��ִ��");}
    Sample sam2=new Sample("���� sam2��Ա��ʼ��");
    {
		System.out.println("�����22222222������");
	}
}
