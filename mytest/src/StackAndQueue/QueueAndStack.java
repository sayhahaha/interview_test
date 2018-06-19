package StackAndQueue;
/** 
* @author xxh 	
* @date 创建时间：Aug 29, 2017 10:22:40 PM  
*/
public class QueueAndStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 StackByTwoQueue stack = new StackByTwoQueue();
	        for(int i=0;i<10;i++){
	            stack.push(i);
	        }
	        for(int i=0;i<10;i++){
	            System.out.println(stack.pop());
	        }
	}

}
