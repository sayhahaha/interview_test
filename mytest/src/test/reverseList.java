package test;

public class reverseList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head = new ListNode(1);  
		ListNode node1 = new ListNode(2);  
		ListNode node2 = new ListNode(3);  
		ListNode node3 = new ListNode(4);  
		head.next=node1; 
        node1.next=node2;  
        node2.next=node3; 
        node3.next=null;

        
        ListNode q=ReverseList(head);
        while (q!=null)
        {
        	System.out.print(q.val+"->");
        	q=q.next;
        }
	}
	public static ListNode ReverseList(ListNode head) {
		if(head==null)
			return head;
		ListNode pre=head;
		ListNode cur=head.next;// 当前结点  
		ListNode temp;// 临时结点，用于保存当前结点的指针域（即下一结点）
		while(cur!=null)
		{
			temp=cur.next;//记录下一个几点
			//链表头插法
			cur.next=pre;
			pre=cur; 
			cur =temp;// 指针往下移动
		}
		// 最后将原链表的头节点的指针域置为null，返回新链表的头结点，即原链表的尾结点
		head.next=null;
		return pre;
    }
}
