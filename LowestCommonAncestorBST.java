/*
LowestCommonAncestorBST
235. Lowest Common Ancestor of a Binary Search Tree
*/


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 
public class LowestCommonAncestorBST {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) 
	{
		if(root.val>Math.max(p.val,q.val))
		{
			return lowestCommonAncestor(root.left,p,q);
		}
		else if(root.val<Math.min(p.val,q.val))
		{
			return lowestCommonAncestor(root.right,p,q);
		}
		else
		{
			return root;
		}
		
        
    }//method
}//class