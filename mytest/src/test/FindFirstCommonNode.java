package test;
/** 
* @author xiaohao 	
* @date 创建时间：2017年5月18日 下午8:49:25 
* @version 1.0   
*/
public class FindFirstCommonNode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode pHead1 = new ListNode(1);  
		ListNode node1 = new ListNode(2);  
		ListNode node2 = new ListNode(3);  
		ListNode node3 = new ListNode(7);  
		pHead1.next=node1; 
        node1.next=node2;  
        node2.next=node3; 
        node3.next=null;

        ListNode pHead2 = new ListNode(5);  
		ListNode node7 = new ListNode(7);  
		ListNode node8 = new ListNode(7);  
		ListNode node9 = new ListNode(8);  
		pHead2.next=node7; 
        node7.next=node8;  
        node8.next=node9; 
        node9.next=null;
        ListNode node=findFirstCommonNode(pHead1,pHead2);
        System.out.print(node.val+"->");
//        while (node!=null)
//        {
//        	System.out.print(node.val+"->");
//        	node=node.next;
//        }
 
       
	}

    public static ListNode findFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	if(pHead1==null||pHead2==null) 
    		return null;
    	ListNode node=pHead2;
    	while(pHead1!=null)
    	{
    		pHead2=node;
    		if(pHead1.val==pHead2.val)
    			return pHead1;
    		else
    		{
    			while(pHead2!=null)
    			{
    				if(pHead1.val==pHead2.val)
    	    			return pHead1;
    				pHead2=pHead2.next;
    			}
    		}
    		pHead1=pHead1.next;
    	}
    	
		return null;   	 
    }
  
}
