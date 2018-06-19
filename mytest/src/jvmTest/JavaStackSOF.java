package jvmTest;
/** 
* @author xxh 	
* @date 创建时间：Oct 6, 2017 11:12:54 AM  
*/
public class JavaStackSOF {

	private int stackLen=1;
	public void stackLeak(){
		stackLen++;
		stackLeak();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaStackSOF  oom = new JavaStackSOF();
		try{
			oom.stackLeak();
		}catch(Throwable e){
			System.out.println("stack length="+oom.stackLen);
			throw e;
		}
	}

}
