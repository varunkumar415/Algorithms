/*
101. Symmetric Tree
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree [1,2,2,3,4,4,3] is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following [1,2,2,null,3,null,3] is not:
    1
   / \
  2   2
   \   \
   3    3

*/




  // Definition for a binary tree node.
  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
 
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
		return root==null || checkSysmmetry(root.left, root.right);
        
    }//method
	
	public boolean checkSymmtery(TreeNode left, TreeNode right){
		if(left==null || right==null)
		{
			return left==right;
		}
		if(left.val!=right.val)
		{
			return false
		}
		else
		{
			return (checkSymmetry(left.left, right.right)&& checkSymmetry(left.right, right.left));
		}
		
		
	}
	
}//class