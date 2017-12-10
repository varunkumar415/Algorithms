/*
SumOfLeftLeaves
404. Sum of Left Leaves

Find the sum of all left leaves in a given binary tree.

Example:

    3
   / \
  9  20
    /  \
   15   7

There are two left leaves in the binary tree, with values 9 and 15 respectively. Return 24.

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
class SumOfLeftLeaves {
	
	
	public static boolean isLeafNode(TreeNode node)
	{	
		if(node==null)
		{
			return false;
		}
		if(node.left == null && node.right == null)
		{
			return true;
		}
		return false;
	}//method
	
	
    public static int sumOfLeftLeaves(TreeNode root) 
	{
        int result = 0;
		if(root!=null)
		{
			if(isLeafNode(root.left))
			{
				result = result+root.left.val;
			}
			else
			{
				result = result+sumOfLeftLeaves(root.left);
			}
			
			result = result+sumOfLeftLeaves(root.right);
		}
		
		return result;
    }//method
	
	 public static void main(String args[]) 
    {
        
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
       // root.left.left = new TreeNode(12);
       // tree.root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
       
  
        System.out.println("The sum of left leaves is " + sumOfLeftLeaves(root));
    }
	
}