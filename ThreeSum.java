/*
15. 3Sum

Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*/

import java.util.*;

public class ThreeSum 
{
    public static List<List<Integer>> threeSum(int[] nums, int sum) 
	{
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(nums == null || nums.length<3)
		return result;
		Arrays.sort(nums);
		
		 for (int i = 0; i < nums.length - 2; i++) 
        {
            // To find the other two elements, start two index variables
            // from two corners of the array and move them toward each
            // other
            int l = i + 1; // index of the first element in the remaining elements
            int r = nums.length - 1; // index of the last element
            while (l < r) 
            {
                if (nums[i] + nums[l] + nums[r] == sum) 
                {
                    System.out.println("Triplet is " + nums[i] + " ," + nums[l] + " ," + nums[r]);
				   List<Integer> al = new ArrayList<Integer>();
                    al.add(nums[i]);
                    al.add(nums[l]);
                    al.add(nums[r]);
                    result.add(al);
				   return result;
                    //return true;
                }
                else if (nums[i] + nums[l] + nums[r] < sum)
                    l++;
                 
                else if (nums[i] + nums[l] + nums[r] > sum)
                    r--;
            }
        }
		
		 return result;
		
		
    }//method
	
	//time complexity = O(n^3)
	 public static boolean threeSum_n3(int A[], int arr_size, int sum) 
    {
        int l, r;
 
        // Fix the first element as A[i]
        for (int i = 0; i < arr_size - 2; i++) 
        {
            // Fix the second element as A[j]
            for (int j = i + 1; j < arr_size - 1; j++) 
            {
                // Now look for the third number
                for (int k = j + 1; k < arr_size; k++) 
                {
                    if (A[i] + A[j] + A[k] == sum) 
                    {
                        System.out.println("Triplet is " + A[i] + " ," + A[j] 
                                                              + " ," + A[k]);
                        return true;
                    }
                }
            }
        }
 
        // If we reach here, then no triplet was found
        return false;
    }//method2
	
	//time complexity = O(n^2)
	public static boolean threeSum_n2(int A[], int arr_size, int sum) 
    {
        int l, r;
 
        /* Sort the elements */
       // quickSort(A, 0, arr_size - 1);
		Arrays.sort(A);	
        /* Now fix the first element one by one and find the
           other two elements */
        for (int i = 0; i < arr_size - 2; i++) 
        {
            // To find the other two elements, start two index variables
            // from two corners of the array and move them toward each
            // other
            l = i + 1; // index of the first element in the remaining elements
            r = arr_size - 1; // index of the last element
            while (l < r) 
            {
                if (A[i] + A[l] + A[r] == sum) 
                {
                    System.out.println("Triplet is " + A[i] + " ," + A[l]
                            + " ," + A[r]);
                    return true;
                }
                else if (A[i] + A[l] + A[r] < sum)
                    l++;
                 
                else // A[i] + A[l] + A[r] > sum
                    r--;
            }
        }
 
        // If we reach here, then no triplet was found
        return false;
    }
	
	
	 // Driver program to test above functions
    public static void main(String[] args) 
    {
        
        int A[] = {1, 4, 45, 6, 10, 8};
        int sum = 22;
        int arr_size = A.length;
        threeSum_n3(A, arr_size, sum);
		threeSum_n2(A, arr_size, sum);
		threeSum(A,sum);
    }
	
}//class