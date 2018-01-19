public class DataStructureAlgo{
	
	
	public static void main(String[] args)
	{
		System.out.println("main method");
			
		int arr[] = {2,5,6,8,9};
		int n = arr.length;
		int x = 8;
		int result = binarySearch(arr,0,n-1,x);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index "+result);
		
		
		
	}//main	


	// binary search in a sorted array :
	public static int binarySearch(int[] arr, int si, int ei, int searchElement)
	{
		if(ei>=si)
		{
			int mid = (si + ei)/2;
			
			if(searchElement==arr[mid])
			{
				return mid;
			}
			if(searchElement<arr[mid])
			{
				return binarySearch(arr,si,mid-1,searchElement);
			}
			if(searchElement>arr[mid])
			{
				return binarySearch(arr,mid+1,ei,searchElement);
			}
		}
		return -1;
	}
	
	//--------------------------------------------------------------------------------------------------------------
	//search element in a binary tree
		public static boolean isPresent(Node root, int x) {
		if (root != null) {

			// check if current node has the element we are looking for
			if (root.data == x) {
				return true;
			} else {
				// check if the sub trees
				return isPresent(root.left, x) || isPresent(root.right, x);
			}
		}
		return false;
	}
	
	//-------------------------------------------------------------------------------------------------------------------------
	
	//search an element in BST
	// A utility function to search a given key in BST
public Node search(Node root, int key)
{
    // Base Cases: root is null or key is present at root
    if (root==null || root.key==key)
        return root;
 
    // val is greater than root's key
    if (root.key > key)
        return search(root.left, key);
 
    // val is less than root's key
    return search(root.right, key);
}
//------------------------------------------------------------------------------------------------------------------------------------
//insert record in BST
     
    /* A recursive function to insert a new key in BST */
    Node insertRec(Node root, int key) {
 
        /* If the tree is empty, return a new node */
        if (root == null) {
            root = new Node(key);
            return root;
        }
 
        /* Otherwise, recur down the tree */
        if (key < root.key)
            root.left = insertRec(root.left, key);
        else if (key > root.key)
            root.right = insertRec(root.right, key);
 
        /* return the (unchanged) node pointer */
        return root;
    }
//------------------------------------------------------------------------------------------------------------------------------------------
//inorder traversal BST ;
  void inOrderRec(Node root) {
        if (root != null) 
		{
            inOrderRec(root.left);
            System.out.println(root.key);
            inOrderRec(root.right);
        }
    }
	
	//PreOder
	 void preOrderRec(Node root) {
        if (root != null) 
		{
            System.out.println(root.key);
			 preOrderRec(root.left);
            preOrderRec(root.right);
        }
    }
	
	//postOrder
	 void postOrderRec(Node root) {
        if (root != null) 
		{
            postOrderRec(root.left);
            postOrderRec(root.right);
			System.out.println(root.key);
        }
    }
	//---------------------------------------------------------------------------------------------------------------------------------------------------
 	//check two nodes are cousins or not:
	  // Returns 1 if a and b are cousins, otherwise 0
    boolean isCousin(Node node, Node a, Node b)
    {
        // 1. The two Nodes should be on the same level
        //       in the binary tree.
        // 2. The two Nodes should not be siblings (means
        //    that they should not have the same parent
        //    Node).
        return ((level(node, a, 1) == level(node, b, 1)) &&
                (!isSibling(node, a, b)));
    }
	
	//find level of a node
	int level(Node node, Node ptr, int lev)
    {
        // base cases
        if (node == null)
            return 0;
 
        if (node == ptr)
            return lev;
 
        // Return level if Node is present in left subtree
        int l = level(node.left, ptr, lev + 1);
        if (l != 0)
            return l;
 
        // Else search in right subtree
        return level(node.right, ptr, lev + 1);
    }
	
	//find both nodes are siblings or not
	 boolean isSibling(Node node, Node a, Node b)
    {
        // Base case
        if (node == null)
            return false;
 
        return ((node.left == a && node.right == b) ||
                (node.left == b && node.right == a) ||
                isSibling(node.left, a, b) ||
                isSibling(node.right, a, b));
    }
	
	//---------------------------------------------------------------------------------------------------------------------------------
	//calculate a^b without iteration
	/* Function to calculate x raised to the power y */
int power(int x, unsigned int y)
{
    if (y == 0)
        return 1;
    else if (y%2 == 0)
        return power(x, y/2)*power(x, y/2);
    else
        return x*power(x, y/2)*power(x, y/2);
}
//--------------------------------------------------------------------------------------------------------------------------------------
//fibonacci series using recursion
 static void printFibonacci(int count){    
    if(count>0){    
         n3 = n1 + n2;    
         n1 = n2;    
         n2 = n3;    
         System.out.print(" "+n3);   
         printFibonacci(count-1);    
     }    
 }    

//using loop
 static void printFibonacci(int count)
 {    
	 int n1=0,n2=1,n3,i,count=10;    
	System.out.print(n1+" "+n2);//printing 0 and 1   
	 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
	 {    
	  n3=n1+n2;    
	  System.out.print(" "+n3);    
	  n1=n2;    
	  n2=n3;    
	 }    
}
//--------------------------------------------------------------------------------------------------------------------------    
// print union and intersection of two given unsorted list
// Prints union of arr1[0..m-1] and arr2[0..n-1]
    static void printUnion(int arr1[], int arr2[])
    {
        HashSet<Integer> hs = new HashSet<>();
         
        for (int i = 0; i < arr1.length; i++) 
            hs.add(arr1[i]);        
        for (int i = 0; i < arr2.length; i++) 
            hs.add(arr2[i]);
        System.out.println(hs);        
    }
     
    // Prints intersection of arr1[0..m-1] and arr2[0..n-1]
    static void printIntersection(int arr1[], int arr2[])
    {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> hs1 = new HashSet<>();
         
        for (int i = 0; i < arr1.length; i++) 
            hs.add(arr1[i]);
         
        for (int i = 0; i < arr2.length; i++) 
            if (hs.contains(arr2[i]))
               System.out.print(arr2[i] + " ");
    }	
	//---------------------------------------------------------------------------------------------------------------------------------
	
	
}//class