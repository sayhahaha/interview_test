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
		ListNode cur=head.next;// ��ǰ���  
		ListNode temp;// ��ʱ��㣬���ڱ��浱ǰ����ָ���򣨼���һ��㣩
		while(cur!=null)
		{
			temp=cur.next;//��¼��һ������
			//����ͷ�巨
			cur.next=pre;
			pre=cur; 
			cur =temp;// ָ�������ƶ�
		}
		// ���ԭ�����ͷ�ڵ��ָ������Ϊnull�������������ͷ��㣬��ԭ�����β���
		head.next=null;
		return pre;
    }
}
