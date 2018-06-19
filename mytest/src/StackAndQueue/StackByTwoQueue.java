package StackAndQueue;

import java.util.LinkedList;
import java.util.List;

/** 
* @author xxh 	
* @date 创建时间：Aug 29, 2017 9:46:10 PM  
*/
public class StackByTwoQueue {

	List <Integer> queue1  = new LinkedList<Integer>();
	List <Integer> queue2 = new LinkedList<Integer>();
	public Integer pop() {
		// TODO Auto-generated method stub
		if (queue1.isEmpty()&&queue2.isEmpty()) {
            try {
                throw new Exception("stack is empty");
            } catch (Exception e) {
            }
        }
        if(queue1.isEmpty()){
            while(queue2.size()>1){
                queue1.add(queue2.get(0));
                queue2.remove(0);
            }
            int res=queue2.get(0);
            queue2.remove(0);
            return res;
        }
        if(queue2.isEmpty()){
            while(queue1.size()>1){
                queue2.add(queue1.get(0));
                queue1.remove(0);
            }
            int res=queue1.get(0);
            queue1.remove(0);
            return res;
        }
        return null;
	}

	public void push(int n) {
		// TODO Auto-generated method stub
		if(queue1 .isEmpty())
		{
			queue2.add(n);
		}
		if(queue2.isEmpty())
		{
			queue1 .add(n);
		}
	}
}
