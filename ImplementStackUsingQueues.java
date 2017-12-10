/*
225. Implement Stack using Queues
Implement the following operations of a stack using queues.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
empty() -- Return whether the stack is empty.
Notes:
You must use only standard operations of a queue -- which means only push to back, peek/pop from front, size, and is empty operations are valid.
Depending on your language, queue may not be supported natively. You may simulate a queue by using a list or deque (double-ended queue), as long as you use only standard operations of a queue.
You may assume that all operations are valid (for example, no pop or top operations will be called on an empty stack).

Algo:1
push(s,  x)
  1) Enqueue x to q1 (assuming size of q1 is unlimited).

pop(s)  
  1) One by one dequeue everything except the last element from q1 and enqueue to q2.
  2) Dequeue the last item of q1, the dequeued item is result, store it.
  3) Swap the names of q1 and q2
  4) Return the item stored in step 2.
// Swapping of names is done to avoid one more movement of all elements 
// from q2 to q1.

Algo:2
push(s, x) // x is the element to be pushed and s is stack
  1) Enqueue x to q2
  2) One by one dequeue everything from q1 and enqueue to q2.
  3) Swap the names of q1 and q2 
// Swapping of names is done to avoid one more movement of all elements 
// from q2 to q1. 

pop(s)
  1) Dequeue an item from q1 and return it.


*/
import java.util.*;

public class ImplementStackUsingQueues {

    Queue<Integer> q1 = new LinkedList<Integer>();
    Queue<Integer> q2 = new LinkedList<Integer>();

    public int pop() 
	{
        if (q1.peek() == null) {
            System.out.println("The stack is empty, nothing to return");
            int i = -1;
            return i;
        } else {
            int pop = q1.remove();
            return pop;
        }
    }

    public void push(int data) 
	{

        if (q1.peek() == null) 
		{
            q1.add(data);
        } 
		else 
		{
            //for (int i = q1.size(); i > 0; i--) // just iterate a queue
			while(!q1.isEmpty())
			{
                q2.add(q1.remove());
            }
            q1.add(data);
            //for (int j = q2.size(); j > 0; j--)  // just iterate a queue
			while(!q2.isEmpty())
			{
                q1.add(q2.remove());
            }

        }
    }
	
	
	  /* Get the top element. */
    public int top() 
	{
		return q1.peek();
        
    }
    
    /* Returns whether the stack is empty. */
    public boolean empty() 
	{
		return q1.isEmpty();
    }

    public static void main(String[] args) 
	{
        ImplementStackUsingQueues s1 = new ImplementStackUsingQueues();
        //       Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);
        s1.push(6);
        s1.push(7);
        s1.push(8);
        s1.push(9);
        s1.push(10);
        // s1.push(6);
        System.out.println("1st = " + s1.pop());
        System.out.println("2nd = " + s1.pop());
        System.out.println("3rd = " + s1.pop());
        System.out.println("4th = " + s1.pop());
        System.out.println("5th = " + s1.pop());
        System.out.println("6th = " + s1.pop());
        System.out.println("7th = " + s1.pop());
        System.out.println("8th = " + s1.pop());
        System.out.println("9th = " + s1.pop());
       // System.out.println("10th= " + s1.pop());
		System.out.println("top element: " + s1.top());
		System.out.println("isEmpty: " + s1.empty());
		
		
    }
}