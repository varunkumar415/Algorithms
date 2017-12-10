/*
Merge Two Sorted Lists


*/


public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode head = new ListNode(0);
    ListNode p=head;
 
    ListNode p1=l1;
    ListNode p2=l2;
    while(p1!=null && p2!=null)
	{
        if(p1.val < p2.val)
		{
            p.next = p1;
            p1 = p1.next;
        }else
		{
            p.next = p2;
            p2 = p2.next;
        }
        p=p.next;
    }//while
 
    if(p1!=null)
	{
        p.next = p1;
    }
 
    if(p2!=null)
	{
        p.next = p2;
    }
 
    return head.next;
}


//using recursion 
public static ListNode merge(ListNode n1, ListNode n2)
{
	if (n1 == null) return n2;
	if (n2 == null) return n1;

	ListNode node;
	if (n1.val < n2.val)
	{
		node = n1;
		node.next = merge(n1.next, n2);
	}
	else
	{
		node = n2;
		node.next = merge(n1, n2.next);
	}
	return node;
}
