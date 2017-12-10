/*
232. Implement Queue using Stacks


Implement the following operations of a queue using stacks.

push(x) -- Push element x to the back of queue.
pop() -- Removes the element from in front of queue.
peek() -- Get the front element.
empty() -- Return whether the queue is empty.
Notes:
You must use only standard operations of a stack -- which means only push to top, peek/pop from top, size, and is empty operations are valid.
Depending on your language, stack may not be supported natively. You may simulate a stack by using a list or deque (double-ended queue), as long as you use only standard operations of a stack.
You may assume that all operations are valid (for example, no pop or peek operations will be called on an empty queue).

*/
import java.util.*;

public class ImplementQueueUsingStack{
	
	 Stack<Integer> s1 = new Stack<Integer>();
    Stack<Integer> s2 = new Stack<Integer>();
 
    // Push element x to the back of queue.
    public void push(int x) {
        if(s1.isEmpty()){
            s1.push(x);
        }else{
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
 
            s1.push(x);
 
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }    
        }
    }
 
    // Removes the element from in front of queue.
    public int pop() {
        return s1.pop();
    }
 
    // Get the front element.
    public int peek() {
		
		try{
		
        return s1.peek();
			
		}
		catch(EmptyStackException e)
		{
			return -1;
		}
    }
 
    // Return whether the queue is empty.
    public boolean empty() {
        return s1.isEmpty();
    }
	
	
	  public static void main(String[] args) 
	{
        ImplementQueueUsingStack q1 = new ImplementQueueUsingStack();
        //       Stack s1 = new Stack();
        q1.push(1);
        q1.push(2);
        q1.push(3);
        q1.push(4);
        q1.push(5);
        q1.push(6);
        q1.push(7);
        q1.push(8);
        q1.push(9);
        q1.push(10);
        // s1.push(6);
        System.out.println("1st = " + q1.pop());
        System.out.println("2nd = " + q1.pop());
        System.out.println("3rd = " + q1.pop());
        System.out.println("4th = " + q1.pop());
        System.out.println("5th = " + q1.pop());
        System.out.println("6th = " + q1.pop());
        System.out.println("7th = " + q1.pop());
        System.out.println("8th = " + q1.pop());
        System.out.println("9th = " + q1.pop());
        System.out.println("10th= " + q1.pop());
		System.out.println("top element: " + q1.peek());
		System.out.println("isEmpty: " + q1.empty());
		
		
    }
	
	
	
}//class