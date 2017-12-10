/*
107. Binary Tree Level Order Traversal II

Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).

For example:
Given binary tree [3,9,20,null,null,15,7],
    3
   / \
  9  20
    /  \
   15   7
return its bottom-up level order traversal as:
[
  [15,7],
  [9,20],
  [3]
]

Algo:

 * Solution
 * Maintain a stack and queue. Do regular level order traversal but
 * put right first in the queue. Instead of printing put the result
 * in stack. Finally print contents of the stack.
*/
package classfiles;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
  
 public class BinaryTreeLevelOrderTraversal {
	 /*
	 public List<List<Integer>> levelOrderBottomUp(TreeNode root) {
	 
	 }
	 */
	 
	 
	  /**
     * Use one queue and delimiter to print level by level
     */
    public void levelByLevelOneQueueUsingDelimiter(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(root);
        q.offer(null);
        while (!q.isEmpty()) 
		{
            root = q.poll();
            if (root != null) 
			{
                System.out.print(root.val + " ");
                if (root.left != null) {
                    q.offer(root.left);
                }
                if (root.right != null) {
                    q.offer(root.right);
                }
            }//if 
			else 
			{
                if (!q.isEmpty()) {
                    System.out.println();
                    q.offer(null);
                }
            }//else
        }//while
    }
	 
	 //top to bottom
	  public void levelByLevelOneQueueUsingCount(TreeNode root) {
        if (root == null) {
            return;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        int levelCount = 1;
        int currentCount = 0;
        q.offer(root);
        while (!q.isEmpty()) 
		{
            while (levelCount > 0) 
			{
                root = q.poll();
                System.out.print(root.val + " "); // add to list
                if (root.left != null) {
                    currentCount++;
                    q.offer(root.left);
                }
                if (root.right != null) {
                    currentCount++;
                    q.offer(root.right);
                }
                levelCount--;
            }//while
            System.out.println(); // for new line
            levelCount = currentCount;
            currentCount = 0;
        }//while
    }
	 
	 
    public List<Integer> levelOrderBottomUp(TreeNode root) {
		if(root==null)
		{
			return null;
		}
		
		List<Integer> l = new LinkedList<Integer>();
		Queue<TreeNode> q = new LinkedList<>();
		Stack<TreeNode> s = new Stack<>();
		
		q.offer(root);
		while(!q.isEmpty())
		{
			root=q.poll();
			if(root.right!=null)
			{
				q.offer(root.right);
			}
			if(root.left!=null)
			{
				q.offer(root.left);
			}
			s.push(root);
		}//while
		while(!s.isEmpty())
		{
			l.add(s.pop().val);
		}//while
		return l;
			
	}//method
         

}//class