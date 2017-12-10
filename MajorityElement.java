/*
169. Majority Element
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.

You may assume that the array is non-empty and the majority element always exist in the array.

*/
import java.util.Arrays;

class MajorityElement {
	
	//Boyer moore Algorithm
	// time complexity = O(n) and space complexity = O(1)
    public Integer majorityElement(int[] nums) {
		if (nums == null || nums.length == 0) {
	            return null;
	        }

	         
	        Integer candidate = null;
	        int count = 0;
	        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
	                candidate = nums[i];
	                count = 1;
	                continue;
	            } else {
	                if (candidate == nums[i]) {
	                    count++;
	                } else {
	                    count--;
                }
	            }
	        }

	        if (count == 0) {
	            return null;
	        }
	
	         
	        count = 0;
	        for (int i = 0; i < nums.length; i++) {
	            if (candidate == nums[i]) {
	                count++;
	            }
	        }
	        return (count > nums.length / 2) ? candidate : null;
        
    }//method
	
	
	// brute force O(n*n)
	 public Integer getMajorityElementNaive(int[] nums) 
	 {
	
	        if (nums == null || nums.length == 0) {
	            return null;
	        }
	
	        for (int i = 0; i < nums.length; i++) 
			{
	            int count = 0;
	            for (int j = 0; j < nums.length; j++) 
				{
	                if (nums[i] == nums[j]) {
	                    count++;
	                }
	            }//for
	            if (count > nums.length / 2) {
	                return nums[i];
	            }
	        }//for
	        return null;
	    }
	
	
	 public static void main(String[] args) {

	        int[] array = { 2, 6, 2, 2, 6, 2, 2, 8, 2, 1 };
			MajorityElement ref = new MajorityElement();
			System.out.println(Arrays.toString(array) + " \nMajority Element: "  + ref.majorityElement(array));
			System.out.println(Arrays.toString(array) + " \nMajority Element: "  + ref.getMajorityElementNaive(array));
	    }
	
}//class