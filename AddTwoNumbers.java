/*
2. Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8

*/


  //Definition for singly-linked list.
  class ListNode 
  {
      int val;
      ListNode next;
      ListNode(int x) 
	  { val = x; 
		next = null;
	  }
  }
 
class AddTwoNumbers 
{
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) 
	{
			  int carry =0;
 
        ListNode newHead = new ListNode(0);
        ListNode p1 = l1, p2 = l2, p3=newHead;
 
        while(p1 != null || p2 != null){
            if(p1 != null){
                carry += p1.val;
                p1 = p1.next;
            }
 
            if(p2 != null){
                carry += p2.val;
                p2 = p2.next;
            }
 
            p3.next = new ListNode(carry%10);
            p3 = p3.next;
            carry /= 10;
        }
 
        if(carry==1) 
            p3.next=new ListNode(1);
 
        return newHead.next;
    }//method
	
	public static void main(String[] args)
	{
		ListNode head1 = new ListNode(3);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(2);
		head1.next = node2;
		node2.next = node3;
		node3.next = null;
		
		
		ListNode head2 = new ListNode(4);
		ListNode node22 = new ListNode(6);
		ListNode node23 = new ListNode(5);
		head2.next = node22;
		node22.next = node23;
		node23.next = null;
		
		ListNode res = new ListNode(0);
		res = addTwoNumbers(head1, head2);
		while(res!=null)
		{
			
				System.out.print(res.val+"->");
				res = res.next;
		}
		
	}//main
	
}//
