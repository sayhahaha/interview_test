package string_test;
/** 
* @author xiaohao 	
* @date 创建时间：Jul 31, 2017 3:51:47 PM 
* @version 1.0   
*/
public class TestSub extends Test{
	
	
	static Sample staticSamSub=new Sample("子类 静态成员staticSamSub1初始化");
    TestSub()
    {
          System.out.println("子类 TestSub 默认构造函数被调用");
    }
    Sample sam1=new Sample("子类 sam1成员初始化");
    static Sample staticSamSub1=new Sample("子类 静态成员staticSamSub2初始化");
    
    static{System.out.println("子类 static 块执行");}
    Sample sam2=new Sample("子类 sam2成员初始化");
    {
		System.out.println("子类块22222222被调用");
	}
}
