package designPattern;
/** 
* @author xxh 	
* @date 创建时间：Oct 1, 2017 4:27:22 PM  
*/
public class RealServer implements HttpProxy{

	@Override
	public void getHttpIP() {
		// TODO Auto-generated method stub
		System.out.println("real server ip 1.1.1.1");
	}

}
