/*
104. Maximum Depth of Binary Tree

Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Algo:
on each node takkes 3 steps

*/

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
  
  public class MaxDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
		//base condition
		if(root==null)
		{
			return 0;
		}
		//step 1
		int leftDepth = maxDepth(root.left);
		//step 2
		int rightDepth = maxDepth(root.right);
		
		//step 3
		if(leftDepth>rightDepth)
		{
			return leftDepth+1;
		}
		else
		{
			return rightDepth+1;
		}
        
    }//method
	
}//class