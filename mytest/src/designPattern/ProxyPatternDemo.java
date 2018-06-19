package designPattern;
/** 
* @author xxh 	
* @date 创建时间：Oct 1, 2017 4:35:39 PM  
*/
public class ProxyPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RealServer real = new RealServer();
		ProxyServer proxy=new ProxyServer(real);
		proxy.getHttpIP();
	}

}
