package string_test;
/** 
* @author xiaohao 	
* @date ����ʱ�䣺Jul 31, 2017 3:49:12 PM 
* @version 1.0   
*/
public class Test {

	{
		System.out.println("�����11111111������");
	}
	Test()
	{
        System.out.println("���� TestĬ�Ϲ��캯��������");
	}
	static{
        System.out.println("����static�� 1ִ��");
        }
	static Sample staticSam1=new Sample("���� ��̬��ԱstaticSam1��ʼ��");
	Sample sam1=new Sample("���� sam1��Ա��ʼ��");
	static Sample staticSam2=new Sample("���� ��̬��ԱstaticSam2��ʼ��");
	static{
        System.out.println("���� static�� 2ִ��");
        }
	
	Sample sam2=new Sample("���� sam2��Ա��ʼ��");
}
