/*
268. Missing Number
Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.

For example,
Given nums = [0, 1, 3] return 2.

Note:
Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?


*/

class MissingNumber {
    
	public static void main(String[] args)
	{
		int[] a = {0,1,2,4};
		System.out.println(missingNumber(a));
		System.out.println(missingNumber2(a));
	}
	
	public static int missingNumber(int[] nums)
	{
		int sum=0;
		for(int i=0; i<nums.length; i++){
			sum+=nums[i];
		}
	 
		int n=nums.length;
		return n*(n+1)/2-sum;
    }
	
	
	public static int missingNumber2(int[] nums) 
	{
 
		int miss=0;
		for(int i=0; i<nums.length; i++){
			miss ^= (i+1) ^nums[i];
		}
	 
		return miss;
	}
	
	
}//class