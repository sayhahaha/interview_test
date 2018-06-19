package java_extends;
/** 
* @author xiaohao 	
* @date 创建时间：2017年5月15日 上午10:48:15 
* @version 1.0   
*/
public class Dervied extends Base {
	 private String name = "dervied";

	    public Dervied() {
	        tellName();
	        printName();
	    }
	    
	    public void tellName() {
	        System.out.println("Dervied tell name: " + name);
	    }
	    
	    public void printName() {
	        System.out.println("Dervied print name: " + name);
	    }

	    public static void main(String[] args){
	        
	        new Dervied();    
	    }
}
