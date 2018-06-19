package collection_test;
/** 
* @author xxh 	
* @date 创建时间：Sep 6, 2017 7:20:18 PM  
*/
public class Key {

	public int a ;
	public int b ;
	public Key(int a){
		this.a=a;
	}
	
	public Key(int a,int b){
		this.a=a;
		this.b=b;

	}
	public  String fun()
	{
		return "a:"+a+",b:"+b;		
	}
}
