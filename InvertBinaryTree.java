/*
226. Invert Binary Tree
Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9
to
     4
   /   \
  7     2
 / \   / \
9   6 3   1

*/

/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) 
	   { 
			val = x; 
	   }
  }
 */

public class InvertBinaryTree{
	
	public static void main(String[] args)
	{
		//	invertTree(root);
	}
	
	public static TreeNode invertTree(TreeNode root)
	{
		if(root!=null)
		{
			helper(root);
		}
 
    return root; 
		
	}
	
	public static void helper(TreeNode p)
	{
		if(p!=null)
		{
			//step1
			helper(p.left);
			
			//step2
			helper(p.right);
			
			//step3 swap left and right node
			TreeNode temp = p.left;
			p.left = p.right;
			p.right = temp;	
		}//if
		return;
		
	}
	
	
	
}//class