/*
234. Palindrome Linked List
Given a singly linked list, determine if it is a palindrome.
Algo:
use stack to push half ll
then pop and check with other half 

in odd ignore middle element


*/

import java.util.*;

//**
 //* Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode(int x) 
	  { 
		val = x; 
	  }
  }
 


 class PalindromeLinkedList {
    
	public static boolean isPalindrome(ListNode head) {
		
		ListNode curr = head;
		ListNode runner = head;
		Stack<Integer> st = new Stack<Integer>();
		
		//push 1st half in stack
		while(runner!=null && runner.next!=null)
		{
			st.push(curr.val);
			curr = curr.next;
			runner = runner.next.next;
		}
		
		//in case of odd ignore middle element
		if(runner!=null)
		{
			curr=curr.next;
		}
		
		//pop stack element and compare with other half of LL
		while(curr!=null)
		{
			if(st.pop().intValue()!=curr.val)
			{
				return false;
			}
			curr=curr.next;
		}
	
		return true;
        
    }//method
	
	public static void main(String[] args)
	{
		ListNode l1 = new ListNode(1);  //head node
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(3);
		ListNode l4 = new ListNode(2);
		ListNode l5 = new ListNode(1);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		System.out.println(isPalindrome(l1));	
	}
}//class