package test2;
/** 
* @author xxh 	
* @date 创建时间：Nov 2, 2017 8:07:49 PM  
*/
public class MergeSortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode node=new ListNode(5);
		ListNode head = node;
		node.next=new ListNode((int)Math.random()*20);
		node.next.next=new ListNode((int)Math.random()*20);
		node.next.next.next=new ListNode((int)Math.random()*20);
		node.next.next.next.next=new ListNode((int)Math.random()*20);
		node.next.next.next.next.next=new ListNode((int)Math.random()*20);
		
		
		
		int n=6;
		for(int i=0;i<n;i++){
			node.next=new ListNode((int)Math.random()*20);
			node=node.next;
		}
	
		ListNode res=mergeSort(head);
		while(res.next!=null){
			System.out.println(res.val);
			res=res.next;
		}
	}

	public static ListNode mergeSort(ListNode head){
		if(head==null || head.next==null)
			return head;	
		else
		{
			ListNode fast=head;
			ListNode slow=head;
			while(fast.next!=null && fast.next.next!=null){
				fast=fast.next.next;
				slow=slow.next;
			}
			fast=slow;
			slow=slow.next;
			fast.next=null;
			fast=mergeSort(head);
			slow=mergeSort(slow);
			return merge(fast,slow);
		}
		
	}

	public static ListNode merge(ListNode fast, ListNode slow) {
		// TODO Auto-generated method stub
		if(fast.next==null)
			return slow;
		if(slow.next==null)
			return fast;
		ListNode temp=null;
		while(fast.next!=null && slow.next!=null){
			if(fast.val<slow.val){
				temp.next=fast;
				fast=fast.next;
			}else{
				temp.next=slow;
				slow=slow.next;
			}
			temp=temp.next;
		}
		if(fast.next!=null)
			temp.next=fast;
		if(slow.next!=null)
			temp.next=slow;
		return temp;
	}
}
