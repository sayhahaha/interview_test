package string_test;
/** 
* @author xiaohao 	
* @date 创建时间：Jul 31, 2017 3:49:12 PM 
* @version 1.0   
*/
public class Test {

	{
		System.out.println("父类块11111111被调用");
	}
	Test()
	{
        System.out.println("父类 Test默认构造函数被调用");
	}
	static{
        System.out.println("父类static块 1执行");
        }
	static Sample staticSam1=new Sample("父类 静态成员staticSam1初始化");
	Sample sam1=new Sample("父类 sam1成员初始化");
	static Sample staticSam2=new Sample("父类 静态成员staticSam2初始化");
	static{
        System.out.println("父类 static块 2执行");
        }
	
	Sample sam2=new Sample("父类 sam2成员初始化");
}
