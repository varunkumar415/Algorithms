
public class ReverseLinkedList{
	
	
	public static ListNode reverseLL(ListNode head)
	{
		ListNode curr = head;
		ListNode prev = null;
		ListNode next = null;
		
		while(curr!=null)
		{ 
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}//while
		return prev;
		
	}
}