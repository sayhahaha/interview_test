package designPattern;
/** 
* @author xxh 	
* @date 创建时间：Oct 1, 2017 4:30:06 PM  
*/
public class ProxyServer implements HttpProxy {

	RealServer server;
	
	public ProxyServer (RealServer server){
		this.server=server;
	}
	@Override
	public void getHttpIP() {
		// TODO Auto-generated method stub
		System.out.println("do something before real peration...");
		if(server==null)
			server=new RealServer();
		server.getHttpIP();
		System.out.println("do something after real peration...");
	}

}
