package multithread_learning;

import java.util.concurrent.Callable;

/** 
* @author xiaohao 	
* @date 创建时间：Aug 3, 2017 4:05:40 PM 
* @version 1.0   
*/
public class Machine_Callable implements Callable <String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return "票卖完了！！！";
	}
	
}
