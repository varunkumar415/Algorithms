/*
 
167. Two Sum II - Input array is sorted

Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution and you may not use the same element twice.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2
*/


class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
	int[] ans=new int[2];
	if (numbers == null || numbers.length == 0)
		return null;
 
	int i = 0;
	int j = numbers.length - 1;
 
	while (i < j) 
	{
		int x = numbers[i] + numbers[j];
		if(x==target)
		{
			ans[0]=i+1;
			ans[1]=j+1;
			break;
		}
		else if (x < target) 
		{
			i++;
		} 
		else if (x > target) 
		{
			j--;
		
		}
	}
 
	return ans;	
	
    
    }//method
	
	
	public static void main(String[] args){
		
		TwoSumII ref = new TwoSumII();
		int[] nums = {2, 11, 12, 7};
		int target = 9;
		int[] ans=new int[2];
		ans=ref.twoSum(nums,target);
		System.out.println(ans[0]+" "+ans[1]);
	}
	
}//class