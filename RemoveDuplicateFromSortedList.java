/*
83. Remove Duplicates from Sorted List

Given a sorted linked list, delete all duplicates such that each element appear only once.

For example,
Given 1->1->2, return 1->2.
Given 1->1->2->3->3, return 1->2->3.



*/


/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class RemoveDuplicateFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
		ListNode cur=head;
		while(cur!=null)
		{
			ListNode temp = cur.next;
			while(temp!=null && cur.val==temp.val)
			{
				temp=temp.next;
			}//while
			cur.next=temp;
			cur=cur.next;
				
		}//while
        return head;
    }//method
	
}//class
