  class ListNode1 {
      int val;
      ListNode1 next;
      ListNode1(int x) 
	  { val = x; }
  }

public class RemoveElementFromLinkedList{
	
	public ListNode1 removeElements(ListNode1 head, int val) {
    ListNode1 helper = new ListNode1(0);
    helper.next = head;
    ListNode1 p = helper;
 
    while(p.next != null){
        if(p.next.val == val){
            ListNode1 next = p.next;
            p.next = next.next; 
        }else{
            p = p.next;
        }
    }
 
    return helper.next;
}
		
}//class